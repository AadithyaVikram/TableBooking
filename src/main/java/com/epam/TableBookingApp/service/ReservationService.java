package com.epam.TableBookingApp.service;

import com.epam.TableBookingApp.model.Reservation;
import com.epam.TableBookingApp.model.RestaurantTable;
import com.epam.TableBookingApp.repository.ReservationRepository;
import com.epam.TableBookingApp.repository.RestaurantRepository;
import com.epam.TableBookingApp.repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReservationService {


    @Autowired
    TableRepository tableRepository;
    public List<RestaurantTable> getTables(Long id){

        return tableRepository.findByRestaurantId(id);
    }
    @Autowired
    ReservationRepository reservationRepository;

    public Reservation createReservation(Reservation reservation) {

        return reservationRepository.save(reservation);
    }
}
