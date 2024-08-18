package com.epam.TableBookingApp.controller;

import com.epam.TableBookingApp.model.Restaurant;
import com.epam.TableBookingApp.service.DbTestService;
import com.epam.TableBookingApp.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    DbTestService dbTestService;
    @GetMapping("/alltables")
    List<String> getTables(){
        try {
            return dbTestService.getAllTableNames();
        }
        catch (Exception e){
            return null;
        }
    }

    @GetMapping("/check")
    public String check(){
        return "Checking app successfully";
    }
    @Autowired
    RestaurantService restaurantService;
    @GetMapping("/")
    public String welcome(){
        return "Welcome to Table Reservation App";

    }
    @GetMapping("/restaurants")
    public List<Restaurant> restaurantList(){
        System.out.println(restaurantService.getRestaurants().toString());
        return restaurantService.getRestaurants();
    }
}
