package com.ravethlays.course.resources;

import com.ravethlays.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Thalys", "thalys@gmail.com", "0000000", "123345");
        return ResponseEntity.ok().body(u);
    }
}
