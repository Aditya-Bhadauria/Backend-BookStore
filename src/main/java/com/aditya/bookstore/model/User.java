package com.aditya.bookstore.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Document(collection = "bookstore-users")
public class User {
    @Id
    private String id;
    private String username;
    private String email;
    private String password;
    private List<String> wishlist = new ArrayList<>();
}

