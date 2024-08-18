package com.epam.TableBookingApp.service;

import com.epam.TableBookingApp.model.User;
import com.epam.TableBookingApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User registerUser(User user) {
//        String encodedPassword = new BCryptPasswordEncoder().encode(user.getPassword());
//        user.setPassword(encodedPassword);
        return userRepository.save(user);
    }
}
