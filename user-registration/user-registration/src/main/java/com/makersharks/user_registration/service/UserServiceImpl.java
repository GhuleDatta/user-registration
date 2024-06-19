package com.makersharks.user_registration.service;

import com.makersharks.user_registration.dao.UserRepository;
import com.makersharks.user_registration.entity.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    // injecting user dao //
    private UserRepository userRepository;

    @Autowired
    UserServiceImpl(UserRepository userRepository)
    {
        this.userRepository=userRepository;
    }

    @Override
    public List<User> fetchAllUsers() {
       return userRepository.findAll();
    }

    @Override
    public User fetchUserById(int id) {
        Optional<User> result=userRepository.findById(id);
        User foundUser=null;
        if(result.isPresent())
        {
            foundUser=result.get();
        }
        else {
            throw new RuntimeException("User Not Found With Id: "+id);
        }
        return foundUser;
    }


    @Override
    @Transactional
    public User saveUser(User theUser) {
        return userRepository.save(theUser);
    }

    @Override
    public void deleteById(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public User findUserByUserName(String userName) {
        return userRepository.findUserByUserName(userName);
    }
}
