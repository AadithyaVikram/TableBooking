package com.epam.TableBookingApp.model;

import jakarta.persistence.*;

@Entity
@jakarta.persistence.Table(name = "tableinfo")
public class RestaurantTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TableID")
    Long tableId;
    @Column(name = "restaurantid")
    Long restaurantId;
    @Column(name = "Table_Number")
    Integer tableNumber;
    @Column(name = "Total_Seats")
    Integer totalSeats;

    public Long getTableId() {
        return tableId;
    }

    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public Integer getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(Integer tableNumber) {
        this.tableNumber = tableNumber;
    }

    @Override
    public String toString() {
        return "Table{" +
                "tableId=" + tableId +
                ", restaurantId='" + restaurantId + '\'' +
                ", tableNumber=" + tableNumber +
                ", totalSeats=" + totalSeats +
                '}';
    }

    public Integer getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(Integer totalSeats) {
        this.totalSeats = totalSeats;
    }


}
