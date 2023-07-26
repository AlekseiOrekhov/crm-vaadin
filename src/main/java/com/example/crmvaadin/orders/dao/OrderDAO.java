package com.example.crmvaadin.orders.dao;

import com.example.crmvaadin.orders.dao.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDAO extends JpaRepository<OrderEntity, Long> {
}
