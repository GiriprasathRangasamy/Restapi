package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.project.model.Dealer;
import com.example.project.repository.RepoDealer;

@Service
public class AddDealer {
    @Autowired RepoDealer d;
    //save dealer and product
    public String saveDealer(Dealer ds)
    {
        d.save(ds);
        return "Successful";
    }
    // find dealer by dealer name 
    public List<Dealer> findbyname(String name)
    {
        return d.findByDeelerName(name);
    }
    // return all deealer
    public List<Dealer> findall(String s)
    {
        Sort sort=Sort.by(Sort.Direction.DESC,s );
        return d.findAll(sort);
    }

}
