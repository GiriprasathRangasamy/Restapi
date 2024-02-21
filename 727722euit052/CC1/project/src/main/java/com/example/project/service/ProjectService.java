package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.project.model.Product;
import com.example.project.model.User;
import com.example.project.repository.RepoProduct;
import com.example.project.repository.RepoUser;

@Service
public class ProjectService {
    @Autowired RepoProduct product;
    @Autowired RepoUser user;
    public User signup(User u)
    {
        return user.save(u);
    }
    public boolean login(long id,String password)
    {
        User u=user.findById(id).orElse(null);
        if(u!=null)
        {
            if(u.getPassword().equals(password))
            {
                return true;
            }
            else{
                return false;
            }
        }
        else
        {
            return false;
        }
    }



    public Product addproduct(Product pa)
    {
        return product.save(pa);
    }
    public List<Product> getproduct()
    {
        return product.findAll();
    }
    public String editproduct(long id,Product p)
    {
        Product edit=product.findById(id).orElse(null);
        if(edit!=null)
        {
        edit.setMarket_price(p.getMarket_price());
        edit.setProduct_Available(p.getProduct_Available());
        edit.setProduct_id(p.getProduct_id());
        edit.setProduct_name(p.getProduct_name());
        edit.setProduct_type(p.getProduct_type());
        return "Update successful";}
        else{
            return "Item not found";
        }
    }
    public String deleteproduct(long id)
    {
        Product edit=product.findById(id).orElse(null);
        if(edit!=null)
        {
        product.deleteById(id);
        return "Delete successfully";
        }
        else
        {
            return "Item not found";
        }
    }
}
