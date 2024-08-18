package com.epam.TableBookingApp.controller;

import com.epam.TableBookingApp.model.Reservation;
import com.epam.TableBookingApp.model.RestaurantTable;
import com.epam.TableBookingApp.repository.ReservationRepository;
import com.epam.TableBookingApp.service.ReservationService;
import com.epam.TableBookingApp.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
    @Autowired
    ReservationService reservationService;

    @GetMapping("/tables/{restaurantId}")
    public List<RestaurantTable> getAvailableTables(@PathVariable Long restaurantId) {
        return reservationService.getTables(restaurantId);
    }

    @PostMapping()
    public ResponseEntity<Reservation> make(@RequestBody Reservation reservation){
        Reservation reservation1=reservationService.createReservation(reservation);
        return ResponseEntity.ok(reservation1);
    }
}
