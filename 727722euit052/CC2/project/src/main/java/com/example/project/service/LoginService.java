package com.example.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.project.model.User;
import com.example.project.repository.RepoUser;

@Service
public class LoginService {
    
    @Autowired RepoUser user;
    //create user
    public String signup(User u)
    {
        User s=user.findById(u.getEmpId()).orElse(null);
        if(s==null)
        {
        user.save(u);
        return "Successful creation";
        }
        else
        return "user exist";
    }
    //user login aunthication
    public String login(long id,String password)
    {
        User u=user.findById(id).orElse(null);
        if(u!=null)
        {
            if(u.getPassword().equals(password))
            {
                return "Successful Login";
            }
            else{
                return "Incorrect password";
            }
        }
        else
        {
            return "User Not Exist";
        }
    }



}
