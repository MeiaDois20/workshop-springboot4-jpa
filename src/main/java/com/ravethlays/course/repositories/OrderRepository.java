package com.ravethlays.course.repositories;

import com.ravethlays.course.entities.Order;
import com.ravethlays.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
