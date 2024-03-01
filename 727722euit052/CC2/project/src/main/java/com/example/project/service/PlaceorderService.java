package com.example.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.project.model.Finddealer;
import com.example.project.model.Orders;
import com.example.project.repository.RepoDealer;
import com.example.project.repository.RepoOrder;

@Service
public class PlaceorderService {
    @Autowired RepoOrder repoorder;
    @Autowired RepoDealer repodealer;
    // save pdealer
    public String placeorder(Orders o)
    {
        repoorder.save(o);
        return "placed Successfully";
    }
    //find by productname and return dealername,price,mobilenumber
     public List<Finddealer> finddealer(String productName) {
        List<Object[]> resultList = repodealer.finddeal(productName);
        List<Finddealer> dealers = new ArrayList<>();
        
        for (Object[] result : resultList) {
            Finddealer finddealer = new Finddealer();
            finddealer.setDeelerName((String) result[0]);
            finddealer.setPricePerUnit((Double) result[1]);
            finddealer.setMobileNumber((Long) result[2]);
            dealers.add(finddealer);
        }
        
        return dealers;
    }
    
    public List<Orders> findallorder(int pagenumber)
    {
        Pageable page=PageRequest.of(pagenumber, 3);
        return repoorder.findAll(page).getContent();
    }
}
