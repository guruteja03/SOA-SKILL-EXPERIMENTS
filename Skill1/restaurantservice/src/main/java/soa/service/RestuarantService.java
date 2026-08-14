package soa.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import soa.models.Restaurant;
import soa.repo.RestuarantRepo;

@Service
public class RestuarantService {

    private final RestuarantRepo RR;

    public RestuarantService(RestuarantRepo RR) {
        this.RR = RR;
    }

    public Object getAllRestaurants() {

        Map<String, Object> response = new HashMap<>();

        try {

            List<Restaurant> restaurants = RR.findAll();

            response.put("code", 200);
            response.put("restaurants", restaurants);

        } catch (Exception e) {

            response.put("code", 500);
            response.put("message", e.getMessage());

        }

        return response;
    }
}