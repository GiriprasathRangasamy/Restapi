package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.User;
@Repository
public interface RepoUser extends JpaRepository<User,Long>{
    
}
