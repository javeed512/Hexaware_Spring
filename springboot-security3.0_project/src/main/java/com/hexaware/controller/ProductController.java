package com.hexaware.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.hexaware.dto.Product;
import com.hexaware.entity.UserInfo;
import com.hexaware.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome this endpoint is not secure";
    }

    @PostMapping("/new")
    public String addNewUser(@RequestBody UserInfo userInfo){
        return service.addUser(userInfo);
    }

    @GetMapping("/getall")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<Product> getAllTheProducts() {
        return service.getProducts();
    }

    @GetMapping("/get/{id}")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public Product getProductById(@PathVariable int id) {
        return service.getProduct(id);
    }
    
}