package edu.eci.restapi.service;

import edu.eci.restapi.data.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceHashMap implements UserService{

    private final HashMap<String,User> users = new HashMap<>();

    @Override
    public User create(User user) {
        String newId = generateId();
        user.setId(newId);
        users.put(newId,user);

        return user;
    }

    @Override
    public User findById(String id) {
        return users.get(id);
    }

    @Override
    public List<User> all() {
        ArrayList<User> usersList = new ArrayList<>(users.values());
        return usersList;
    }

    @Override
    public boolean deleteById(String id) {
        if(users.remove(id)==null){
            return false;
        }
        return true;
    }

    @Override
    public User update(User user, String userId) {
        user.setId(userId);
        users.put(userId,user);
        return users.get(userId);
    }

    private String generateId(){
        return String.valueOf(users.size()+1);
    }
}
