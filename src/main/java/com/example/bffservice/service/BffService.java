package com.example.bffservice.service;

import com.example.bffservice.model.Order;
import com.example.bffservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@Service
public class BffService {
    @Autowired
    private RestTemplate restTemplate;

    public User getUser(Long userId) {
        String url = "http://localhost:8081/api/users/" + userId;
        return restTemplate.getForObject(url, User.class);
    }

    public List<Order> getOrders(Long userId) {
        String url = "http://localhost:8082/api/orders/by-user/" + userId;
        Order[] orders = restTemplate.getForObject(url, Order[].class);
        return Arrays.asList(orders);
    }
}