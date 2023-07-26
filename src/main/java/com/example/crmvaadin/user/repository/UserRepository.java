package com.example.crmvaadin.user.repository;

import com.example.crmvaadin.user.dao.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    //    Optional<UserEntity> (UserEntity userEntity);
//    Long getUserEntityByid
    Optional<UserEntity> getAllByUserName(String s);
}
