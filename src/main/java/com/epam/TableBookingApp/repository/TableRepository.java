package com.epam.TableBookingApp.repository;

import com.epam.TableBookingApp.model.RestaurantTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TableRepository extends JpaRepository<RestaurantTable,Long> {

    List<RestaurantTable> findByRestaurantId(Long id);
}
