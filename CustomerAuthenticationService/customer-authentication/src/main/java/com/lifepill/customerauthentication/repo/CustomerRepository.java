package com.lifepill.customerauthentication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lifepill.customerauthentication.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
