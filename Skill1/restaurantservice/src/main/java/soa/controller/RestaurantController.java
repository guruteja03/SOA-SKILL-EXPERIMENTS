package soa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soa.service.RestuarantService;

@RestController
@RequestMapping("/api")
public class RestaurantController {

    private final RestuarantService RS;

    public RestaurantController(RestuarantService RS) {
        this.RS = RS;
    }

    @GetMapping("/restaurants")
    public Object restaurant() {
        return RS.getAllRestaurants();
    }
}