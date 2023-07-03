package com.example.springwithmysql.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User saveUser(User user){
        return repository.save(user);
    }

    public List<User> saveUsers(List<User> users){
        return repository.saveAll(users);
    }

    public List<User> getUsers(){
        return repository.findAll();
    }

    public User getUserById(int id){
        return repository.findById(id).orElse(null);
    }

    public User getUserByName(String name){
        return repository.findByName(name);
    }

    public User updateUser(User user){
        User currentU = repository.findById(user.getId()).orElse(null);
        currentU.setName(user.getName());
        currentU.setPosition(user.getPosition());
        currentU.setWage_USD(user.getWage_USD());
        return repository.save(currentU);
    }

    public String deleteUser(int id){
        repository.deleteById(id);
        return "Deleted User " + id;
    }
}