package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.Product;
import com.example.project.model.User;
import com.example.project.service.ProjectService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ProjectController {
    @Autowired ProjectService s;
    @PostMapping("/signup")
    public User Signup(@RequestBody User entity) {
        return s.signup(entity);
    }
    @GetMapping("/login")
    public boolean Login(@RequestParam("empid") long empid,@RequestParam("password") String password)
    {
        return s.login(empid, password);
    }

//product
    @PostMapping("/addproducts")
    public Product Addproduct(@RequestBody Product entity1)
    {
        return s.addproduct(entity1);
    }
    @GetMapping("/getproduct")
    public List<Product> Getproduct()
    {
        return s.getproduct();
    }
    
    @PutMapping("/updateproduct/{id}")
    public String Updateproduct(@PathVariable long id,@RequestBody Product p)
    {
        return s.editproduct(id, p);
    }
    @DeleteMapping("/deleteproduct/{id}")
    public String Deleteproduct(@PathVariable long id)
    {
        return s.deleteproduct(id);
    }
   

}
