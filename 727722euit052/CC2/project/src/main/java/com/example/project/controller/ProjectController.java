package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.Dealer;
import com.example.project.model.Finddealer;
import com.example.project.model.Orders;
import com.example.project.model.Product;
import com.example.project.model.User;
import com.example.project.service.AddDealer;
import com.example.project.service.LoginService;
import com.example.project.service.PlaceorderService;
import com.example.project.service.ProductService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ProjectController {
    @Autowired LoginService s;
    @Autowired ProductService sp;
    @Autowired PlaceorderService ps;
    @Autowired AddDealer ad;
//signup--implementing save()
    @PostMapping("/signup")
    public String Signup(@RequestBody User entity) {
        return s.signup(entity);
    }
//login--implement 2-@RequestParam and findById and java verfication
    @GetMapping("/login")
    public String Login(@RequestParam("empid") long empid,@RequestParam("password") String password)
    {
        return s.login(empid, password);
    }

//product
//implementing one to one bi-directional with produuct and dealer and return only product deatials as no "mapped by" is used here
    @PostMapping("/addproduct")
    public Product Addproduct(@RequestBody Product entity1)
    {
        return sp.addproduct(entity1);
    }

    //getproducts and implementing sort and paging
    @GetMapping("/getproduct/{pageno}")
    public List<Product> getProduct(@PathVariable int pageno) {
        return sp.getProducts(pageno);
    }

    //dealete product
    @DeleteMapping("/deleteproduct/{id}")
    public String Deleteproduct(@PathVariable long id)
    {
        return sp.deleteproduct(id);
    }

//placeorder
//add orders
@PostMapping("/addorder")
public String placeorder(@RequestBody Orders o)
{
    return ps.placeorder(o);
} 
//implementing page
@GetMapping("/pageorder/{pagenumber}")
public List<Orders> findallorder(@PathVariable int pagenumber)
{
    return ps.findallorder(pagenumber);
}

//dealer
//add dealer using one to one biDirectional by product and dealer and return (dealer and product)
@PostMapping("/adddealer")
public String adddealer(@RequestBody Dealer d)
{
    return ad.saveDealer(d);
}
//get list dealer and sort by the table cloumn name
@GetMapping("/getDealer/{sortdetail}")
public List<Dealer> getdealer(@PathVariable String sortdetail)
{
    return ad.findall(sortdetail);
}
//getby dealer name--implementing repo Jpa function by "FindBy"-select
@GetMapping("/getdealerbyname/{name}")
public List<Dealer> getbyname(@PathVariable String name )
{
    return ad.findbyname(name);
}
//by product name it return return dealername,price,mobilenumber bu using @query(namtive query)-jpql error,join,Object,iteration,
//userdefined function in repo,wwildcord like %name.
@GetMapping("/getdealer/{product}")
public List<Finddealer> finddealer(@PathVariable String product)
{
    return ps.finddealer(product);
}

}
