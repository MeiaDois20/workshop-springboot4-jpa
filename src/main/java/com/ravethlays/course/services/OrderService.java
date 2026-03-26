package com.ravethlays.course.services;

import com.ravethlays.course.entities.Order;
import com.ravethlays.course.entities.User;
import com.ravethlays.course.repositories.OrderRepository;
import com.ravethlays.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = orderRepository.findById(id);
        return obj.get();
    }
}
