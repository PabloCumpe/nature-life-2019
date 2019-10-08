package com.nature.life.controllers;

import com.nature.life.api.UserRequest;
import com.nature.life.api.UserResponse;
import com.nature.life.entity.UserEntity;
import com.nature.life.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/{ids}")
    public ResponseEntity<List<UserResponse>> getUsersById(@PathVariable BigInteger... ids){
       return ResponseEntity.ok(this.userService.getUserByIds(ids)
                .stream()
                .map(e -> new UserResponse(e.getId(),e.getFirstName(),e.getLastName(),e.getMail()))
                .collect(Collectors.toList()));
    }

    @PostMapping
    public void createUser(@RequestBody UserRequest userRequest) {
        UserEntity userEntity= new UserEntity(userRequest.getUserName(),
                userRequest.getUserLastName(),
                userRequest.getMail(),
                userRequest.getPassword(),
                LocalDateTime.now())  ;
        this.userService.createNewUser(userEntity);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable BigInteger id) {
       this.userService.deleteUser(id);
    }
}
