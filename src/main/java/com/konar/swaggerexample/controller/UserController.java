package com.konar.swaggerexample.controller;

import com.konar.swaggerexample.model.UserModel;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/v1/api")
@Tag(name = "", description = "The users entity controller")
public class UserController {

    @GetMapping
    @Operation(description = "Get all users")
    public List<UserModel> getAll(){
        return Collections.emptyList();
    }

    @PostMapping
    @Operation(description = "Create new user")
    public void create(@RequestBody UserModel user){

    }

    @PutMapping("/{id}")
    @Operation(description = "Update user data")
    public void update(@PathVariable int id, @RequestBody UserModel user ){

    }

    @DeleteMapping("/{id}")
    @Operation(description = "Delete user")
    public void delete(@PathVariable int id){

    }

}
