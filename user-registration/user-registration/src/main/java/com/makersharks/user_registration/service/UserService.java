package com.makersharks.user_registration.service;

import com.makersharks.user_registration.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserService {
    List<User> fetchAllUsers();

    User fetchUserById(int id);
    User saveUser(User theUser);

    void deleteById(int id);

    @Query("SELECT u.userName FROM User u")
    User findUserByUserName(String userName);

}
