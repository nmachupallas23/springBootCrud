package com.curso.clase04.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.clase04.dao.UserRepository;
import com.curso.clase04.entities.User;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User create(User user) {
        return userRepository.save(user);        
    }
    public User getUserbyId(int id) {
        return userRepository.findById(id).orElse(null);
    }
    public User update(User user) {
        return userRepository.save(user);
    }
    public void delete(int id) {
        userRepository.deleteById(id);
    }


}
