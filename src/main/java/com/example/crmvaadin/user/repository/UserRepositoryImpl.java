package com.example.crmvaadin.user.repository;

import com.example.crmvaadin.user.dao.UserDAO;
import com.example.crmvaadin.user.dao.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Slf4j
@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {
    private final UserDAO userDAO;
    @Override
    public List<UserEntity> getAll() {
        return userDAO.findAll();
    }

    @Override
    public UserEntity addUser(UserEntity userEntity) {
        try {
            log.info("" + userEntity);
             userDAO.save(userEntity);
            return null;
        } catch (Exception e) {
            log.error("Не удалось добавить юзера");
        }
        return null;
    }
}
