package com.caracciolo.course.repositories;

import com.caracciolo.course.entities.OrderItem;
import com.caracciolo.course.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}