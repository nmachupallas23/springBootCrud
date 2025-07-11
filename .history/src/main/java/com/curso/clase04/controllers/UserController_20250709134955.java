package com.curso.clase04.controllers;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.curso.clase04.dto.UserDto;
import com.curso.clase04.entities.User;
import com.curso.clase04.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("")
    public  ResponseEntity<List<User>> getAllUsers() {
        return new ResponseEntity<List<User>>(userService.findAll(), HttpStatus.ACCEPTED);        
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Integer id) {
        return new ResponseEntity<User>(userService.getUserbyId(id),HttpStatus.OK);               
    }
   /*  @GetMapping("/{id}")
    public UserDto getUserById1(@PathVariable Integer id) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(userService.getUserbyId(id), UserDto.class); 
    }*/

    @PostMapping("/add")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return new ResponseEntity<User>(userService.create(user),HttpStatus.CREATED);        
    }

    @PutMapping("/update")
    public User updateUser(@RequestBody User user) {
        return userService.update(user);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Integer id) {
        userService.delete(id);
    }


}
