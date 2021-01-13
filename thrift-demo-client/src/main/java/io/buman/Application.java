package io.buman;

import io.buman.guild.Guild;
import io.buman.player.GenderEnum;
import io.buman.player.Player;
import io.buman.player.PlayerService;
import io.buman.player.RoleEnum;
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
            PlayerService.Client client = new PlayerService.Client(protocol);
            Player player = new Player();
            player.setName("三季稻").setGender(GenderEnum.FEMALE).setRole(RoleEnum.MAGE);
            player = client.signIn(player);
            Player player1 = new Player().setName("苍天哥").setGender(GenderEnum.FEMALE).setRole(RoleEnum.MAGE);
            player1 = client.signIn(player1);
            client.addCp(player.getId(), player1);
            Guild guild = new Guild().setName("不当人子");
            guild = client.registerGuild(guild);
            player = client.joinGuild(player.getId(), guild.getId());
            List<Player> players = client.queryAllPlayer();
            for (Player p : players) {
                System.out.println("queryAll user = "+ p);
            }
            tTransport.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}