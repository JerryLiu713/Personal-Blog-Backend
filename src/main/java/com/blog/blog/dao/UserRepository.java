package com.blog.blog.dao;

import com.blog.blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUserNameAndPassword(String userName, String password);

}
