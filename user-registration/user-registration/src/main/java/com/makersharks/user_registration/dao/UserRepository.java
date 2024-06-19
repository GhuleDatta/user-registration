package com.makersharks.user_registration.dao;

import com.makersharks.user_registration.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User,Integer> {

    @Query("SELECT u.userName FROM User u")
    User findUserByUserName(String userName);

}
