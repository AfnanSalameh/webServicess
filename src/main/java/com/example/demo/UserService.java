package com.example.demo;

import com.example.repository.SupplierRepository;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    @Autowired
    UserRepository userRepository;


    public List<user> getAllUsers()
    {
        List<user> user = new ArrayList<user>();
        userRepository.findAll().forEach(user1 -> supplier.add(user1));
        return user;
    }

    public supplier getUserById(int id)
    {
        return userRepository.findById(id).get();
    }

    public void saveOrUpdate(user user)
    {
        userRepository.save(user);
    }

    public void delete(int id)
    {
        userRepository.deleteById(id);
    }

    public void update(user user, int userid)
    {
        userRepository.save(user);
    }
}
