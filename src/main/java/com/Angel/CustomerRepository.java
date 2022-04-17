package com.Angel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Angel.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
