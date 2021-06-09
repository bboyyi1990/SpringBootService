//package com.yi.service;
//
//import com.yi.data.User;
//import com.yi.db.UserRepositoryDao;
//import org.springframework.beans.factory.annotation.Autowired;
//
///**
// * user业务层
// */
//public class UserService {
//    @Autowired
//    private UserRepositoryDao repository;
//
//    public User findUserByName(String name) {
//        User user = null;
//        try {
//            user = repository.findByUserName(name);
//        } catch (Exception e) {
//        }
//        return user;
//    }
//}
