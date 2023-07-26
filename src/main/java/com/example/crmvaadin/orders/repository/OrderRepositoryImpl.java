package com.example.crmvaadin.orders.repository;

import com.example.crmvaadin.orders.dao.OrderDAO;
import com.example.crmvaadin.orders.dao.entity.OrderEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class OrderRepositoryImpl implements OrderRepository {
//    private final OrderDAO orderDAO;
    @Override
    public void add(OrderEntity orderEntity) {
//        return;
//        orderDAO.save(orderEntity);
    }
}
