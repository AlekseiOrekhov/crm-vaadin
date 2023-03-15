package com.example.crmvaadin.orders.repository;

import com.example.crmvaadin.orders.dao.entity.OrderEntity;

public interface OrderRepository {
    void add(OrderEntity orderEntity);
}
