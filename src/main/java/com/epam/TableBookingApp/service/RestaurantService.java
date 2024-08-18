package com.epam.TableBookingApp.service;

import com.epam.TableBookingApp.model.Restaurant;
import com.epam.TableBookingApp.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RestaurantService {
    @Autowired
    RestaurantRepository restaurantRepository;
    public List<Restaurant> getRestaurants(){
        return  restaurantRepository.findAll();
    }
}
