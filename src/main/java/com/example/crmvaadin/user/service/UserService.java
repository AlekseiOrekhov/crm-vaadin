package com.example.crmvaadin.user.service;

import com.example.crmvaadin.user.dao.entity.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> getAll();

    UserEntity addUser(String userName, String password);
}
