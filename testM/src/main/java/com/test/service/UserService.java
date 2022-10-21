package com.test.service;

import com.test.model.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);

    public List<User> getAllUser();
}
