package com.test.controller;


import com.test.model.User;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User add(@RequestBody User user){
        return userService.saveUser(user);
//        return "Data Ditambahkan";
    }

    @GetMapping("/user")
    List<User> getAllUsers(){
        return userService.getAllUser();
    }

//    @PutMapping("/user/{id}")
//    public User update(@PathVariable("id") Long id, @RequestParam("nama") String nama,
//                       @RequestParam("alamat") String alamat, @RequestParam("nis") String nis,
//                       @RequestParam("nilai") String nilai){
//
//        User user= new User();
//        user.setId(id);
//        user.setNama(nama);
//        user.setAlamat(alamat);
//        user.setNis(nis);
//        user.setNilai(nilai);
//
//        return userService.saveUser(user);
//    }
//
//    @DeleteMapping("/user/{id}")
//    public void delete(@PathVariable("id") Long id){
//        List<User> deleteUser(){
//            return;
//        }
//    }
}
