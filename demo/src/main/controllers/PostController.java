package com.example.demo.controllers;

import com.example.demo.Post;
import com.example.demo.services.PostService;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PostController {

    record Post (long ID,
    String title,
    String author,
    String content) {}

	@QueryMapping
	public List<Post> getAllPosts() {
		return List.of (
            new Post(1, "Halo", "Bungie", "Juego de 2010"),
            new Post(2, "Call of Duty", "aisf", "Juego de 2011")
        );
	}

}