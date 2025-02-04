package com.lorenzozagallo.course.config;

import com.lorenzozagallo.course.entities.Order;
import com.lorenzozagallo.course.entities.User;
import com.lorenzozagallo.course.repositories.OrderRepository;
import com.lorenzozagallo.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        Order o1 = new Order(null, Instant.parse("2024-11-20T19:53:07.000-03:00"), u1);
        Order o2 = new Order(null, Instant.parse("2024-12-21T03:42:10.000-03:00"), u2);
        Order o3 = new Order(null, Instant.parse("2024-12-22T15:21:22.000-03:00"), u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
