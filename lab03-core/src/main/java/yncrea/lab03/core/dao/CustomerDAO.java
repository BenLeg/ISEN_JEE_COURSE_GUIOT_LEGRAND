package yncrea.lab03.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import yncrea.lab03.core.entity.Customer;

public interface CustomerDAO extends JpaRepository<Customer, Long> {

}
