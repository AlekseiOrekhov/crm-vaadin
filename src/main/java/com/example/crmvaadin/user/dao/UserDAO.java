package com.example.crmvaadin.user.dao;

import com.example.crmvaadin.user.dao.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserDAO extends JpaRepository<UserEntity, Long> {
//    Optional<UserEntity> (UserEntity userEntity);
//    Long getUserEntityByid
    Optional<UserEntity> getByUserName(String s);
}
