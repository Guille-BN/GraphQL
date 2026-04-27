package com.example.demo.services;

import com.example.demo.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    public List<Post> getAllPosts() {
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("1", "First Post", "Alice", "Hello GraphQL!"));
        posts.add(new Post("2", "Second Post", "Bob", "GraphQL with Spring Boot."));
        return posts;
    }

}
