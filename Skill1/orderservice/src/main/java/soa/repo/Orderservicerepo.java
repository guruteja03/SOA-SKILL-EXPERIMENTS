package soa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import soa.models.Order;


public interface Orderservicerepo extends JpaRepository<Order, Long> {

}
