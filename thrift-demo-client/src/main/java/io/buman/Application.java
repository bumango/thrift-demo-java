package io.buman;

import io.buman.curd.CurdService;
import io.buman.curd.GenderEnum;
import io.buman.curd.User;
import io.buman.curd.UserInsertDto;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import java.util.List;

/**
 * thrift demo client.
 */
public class Application {
    public static void main(String[] args) {
        try {
            TTransport tTransport = new TSocket("127.0.0.1", 3041);
            tTransport.open();
            TProtocol protocol = new TBinaryProtocol(tTransport);
            CurdService.Client client = new CurdService.Client(protocol);
            UserInsertDto dto = new UserInsertDto("buman", 18, GenderEnum.UNKNOWN);
            dto.setAddr("中国台湾省纽约市");
            User user = client.insertByDto(dto);
            System.out.println("insert user by dto = "+user);
            User user1 = client.insertUser("buman", 19, GenderEnum.UNKNOWN, null);
            System.out.println("insert user1 by params = "+user1);
            List<User> users = client.queryAll();
            for (User user2 : users) {
                System.out.println("queryAll user = "+ user2);
            }
            for (User user4 : users) {
                System.out.println("deleted user = "+ client.deleteUser(user4.getId()));
            }
            List<User> users1 = client.queryAll();
            System.out.println("queryALl after deleted size = "+ users1.size());
            tTransport.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}