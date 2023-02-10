package com.example.crmvaadin.user.service;

import com.example.crmvaadin.user.dao.entity.UserEntity;
import com.example.crmvaadin.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public List<UserEntity> getAll() {
        return userRepository.getAll();
    }

    @Override
    public UserEntity addUser(String userName, String password) {
        if (!userName.isEmpty() && !password.isEmpty()) {
            UserEntity user = new UserEntity();
            user.setUserName(userName);
            user.setPassword(password);
//            user.setId(generateId());
            return userRepository.addUser(user);
        } else {
            return null;
        }
    }

//    private Long generateId() {
//
//    }
}
