package com.example.bffservice.model;

import lombok.Data;
import java.util.List;

@Data
public class UserProfile {
    private User user;
    private List<Order> orders;
}