package com.example.springwithmysql.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping(path = "/saveUser")
    public User saveUser(@RequestBody User user){
        return service.saveUser(user);
    }

    @PostMapping(path = "/saveUsers")
    public List<User> saveUsers(@RequestBody List<User> user){
        return service.saveUsers(user);
    }

    @GetMapping(path = "/getUsers")
    public List<User> getUsers(){
        return service.getUsers();
    }

    @GetMapping(path = "/getUserId/{id}")
    public User getUserById(@PathVariable int id){
        return service.getUserById(id);
    }

    @GetMapping(path = "/getUserName/{first_name}")
    public User getUserByName(@PathVariable String first_name){
        return service.getUserByName(first_name);
    }

    @PutMapping(path = "/update")
    public User updateUser(@RequestBody User user){
        return service.updateUser(user);
    }

    @DeleteMapping(path = "/delete/{id}")
    public String deleteUser(@PathVariable int id){
        return service.deleteUser(id);
    }
}