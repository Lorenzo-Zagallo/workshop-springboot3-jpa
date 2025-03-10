package com.lorenzozagallo.jpa.repositories;

import com.lorenzozagallo.jpa.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
