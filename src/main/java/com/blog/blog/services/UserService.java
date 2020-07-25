package com.blog.blog.services;

import com.blog.blog.model.User;
import org.springframework.stereotype.Service;


@Service
public interface UserService {

    User checkUser(String username, String password);
}
