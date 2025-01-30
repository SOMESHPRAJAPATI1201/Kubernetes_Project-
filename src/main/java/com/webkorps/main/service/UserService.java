package com.webkorps.main.service;

import com.webkorps.main.entity.User;
import com.webkorps.main.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public List<User> getUser() {
        return userRepo.findAll();
    }

    public User getUserById(int id) {
        return userRepo.findById(id).get();
    }

    public User saveUser(User user) {
        return userRepo.save(userRepo.save(user));
    }

}
