package com.example.crmvaadin.orders.service;

import com.example.crmvaadin.orders.dao.entity.OrderEntity;
import com.example.crmvaadin.orders.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService{
    private final OrderRepository orderRepository;
    @Override
    public void add() {
        OrderEntity orderEntity = new OrderEntity();

        orderRepository.add(orderEntity);
    }
}
