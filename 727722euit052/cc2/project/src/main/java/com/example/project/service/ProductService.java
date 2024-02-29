package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.project.model.Product;
import com.example.project.repository.RepoProduct;
@Service
public class ProductService {
    @Autowired RepoProduct productrepo;
    //add product
    public Product addproduct(Product pa)
    {
        return productrepo.save(pa);
    }
    //return all product
    public List<Product> getProducts(int pageNumber) {
        return productrepo.findAll(PageRequest.of(pageNumber, 3, Sort.by(Sort.Direction.ASC, "productAvailable"))).getContent();
        //return productrepo.findAll();
        
    }
    //delete product
    public String deleteproduct(long id)
    {
        Product edit=productrepo.findById(id).orElse(null);
        if(edit!=null)
        {
        productrepo.deleteById(id);
        return "Delete successfully";
        }
        else
        {
            return "Item not found";
        }
    }

}
