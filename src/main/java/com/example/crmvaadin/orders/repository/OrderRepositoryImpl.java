package com.example.crmvaadin.orders.repository;

import com.example.crmvaadin.orders.dao.OrderDao;
import com.example.crmvaadin.orders.dao.entity.OrderEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class OrderRepositoryImpl implements OrderRepository {
    private final OrderDao orderDao;
    @Override
    public void add(OrderEntity orderEntity) {
        orderDao.save(orderEntity);
    }
}
