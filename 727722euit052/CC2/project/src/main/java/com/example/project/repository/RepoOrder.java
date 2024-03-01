package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.Orders;

@Repository
public interface RepoOrder extends JpaRepository<Orders,Long> {
    
}
