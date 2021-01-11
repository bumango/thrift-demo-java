package io.buman.curd;

import org.apache.thrift.TException;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * CURD service demo.
 * @author: buman
 * @date: Created on 6:20 下午 2021/1/8
 */
@Component
public class CurdServiceImpl implements CurdService.Iface{
    private static final Map<Integer, User> userMap = new HashMap<>();
    @Override
    public User insertUser(String name, int age, GenderEnum gender, String addr) throws TException {
        UserInsertDto dto = new UserInsertDto(name, age, gender);
        dto.setAddr(addr);
        return insertByDto(dto);
    }

    @Override
    public User insertByDto(UserInsertDto dto) throws TException {
        User user = new User();
        user.setId(getIncrKey()).setName(dto.getName()).setAge(dto.getAge()).setGender(dto.getGender())
                .setAddr(dto.getAddr());
        userMap.put(user.getId(), user);
        return user;
    }

    @Override
    public User updateUser(UserUpdateDto dto) throws UserNotFoundException, TException {
        User user = userMap.getOrDefault(dto.getId(), null);
        if (user == null) {
            UserNotFoundException e = new UserNotFoundException();
            e.setCode(400);
            e.setMsg("user not found for id = " + dto.getId());
            throw e;
        }
        if (dto.isSetName()){
            user.setName(dto.getName());
        }
        if (dto.isSetAge()) {
            user.setAge(dto.getAge());
        }
        if (dto.isSetGender()) {
            user.setGender(dto.getGender());
        }
        if (dto.isSetAddr()) {
            user.setAddr(dto.getAddr());
        }
        return user;
    }

    @Override
    public User queryUser(int id) throws UserNotFoundException, TException {
        User user = userMap.getOrDefault(id, null);
        if (user == null) {
            UserNotFoundException e = new UserNotFoundException();
            e.setCode(400);
            e.setMsg("user not found for id = " + id);
            throw e;
        }
        return user;
    }

    @Override
    public java.util.List<User> queryAll() throws TException {
        return new ArrayList<>(userMap.values());
    }

    @Override
    public User deleteUser(int id) throws UserNotFoundException, TException {
        User user = userMap.remove(id);
        if (user == null) {
            UserNotFoundException e = new UserNotFoundException();
            e.setCode(400);
            e.setMsg("user not found for id = " + id);
            throw e;
        }
        return user;
    }

    private int getIncrKey() {
        if (userMap.isEmpty()) {
            return 1;
        }
        List<Integer> list = new ArrayList<>(userMap.keySet());
        Collections.sort(list, ((o1, o2) -> (o2 - o1)));
        return list.get(0)+1;
    }
}