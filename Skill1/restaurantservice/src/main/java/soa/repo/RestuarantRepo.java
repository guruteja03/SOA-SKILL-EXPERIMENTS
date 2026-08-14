package soa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soa.models.Restaurant;

@Repository
public interface RestuarantRepo extends JpaRepository<Restaurant, Integer> {

}