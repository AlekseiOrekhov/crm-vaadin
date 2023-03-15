package com.example.crmvaadin.orders.dao;

import com.example.crmvaadin.orders.dao.entity.OrderEntity;
import com.example.crmvaadin.user.dao.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDao extends JpaRepository<OrderEntity, Long> {
}
