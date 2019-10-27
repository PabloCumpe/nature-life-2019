package com.nature.life.controllers;

import com.nature.life.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

@RestController
@RequestMapping("users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


/*    @GetMapping("/{ids}")
    public ResponseEntity<List<UserResponse>> getUsersById(@PathVariable BigInteger... ids){
       return ResponseEntity.ok(this.userService.getUserByIds(ids)
                .stream()
                .map(e -> new UserResponse(e.getId(),e.getFirstName(),e.getLastName(),e.getMail()))
                .collect(Collectors.toList()));
    }

    @PostMapping
    public void createUser(@RequestBody UserRequest userRequest) {
        CustomerEntity userEntity= new CustomerEntity(userRequest.getUserName(),
                userRequest.getUserLastName(),
                userRequest.getMail(),
                userRequest.getPassword(),
                LocalDateTime.now())  ;
        this.userService.createNewUser(userEntity);
    }*/
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable BigInteger id) {
       this.userService.deleteUser(id);
    }
}
