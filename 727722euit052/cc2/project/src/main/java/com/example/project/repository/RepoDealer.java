package com.example.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.project.model.Dealer;

@Repository
public interface RepoDealer extends JpaRepository<Dealer,Integer> {
    @Query(value="select deeler_name,market_price,mobile_number from dealer d join product p on d.dealer_id=p.dealerforgrin_id where p.product_name like ?1%",nativeQuery = true)
    public List<Object[]> finddeal(String productname);


    public List<Dealer> findByDeelerName(String deelerName);
}
