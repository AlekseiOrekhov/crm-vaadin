package com.example.crmvaadin.user.repository;

import com.example.crmvaadin.user.dao.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    List<UserEntity> getAll();

    UserEntity addUser(UserEntity userEntity);

    UserEntity getUserByUserName(String userName);
}
