package me.mamakari.server.controller;

import me.mamakari.server.model.Post;
import me.mamakari.server.model.User;
import me.mamakari.server.repository.PostRepository;
import me.mamakari.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAllPosts(){
        return userRepository.findAll();
    }
}
