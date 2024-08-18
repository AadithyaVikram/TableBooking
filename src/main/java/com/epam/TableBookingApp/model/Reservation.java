package com.epam.TableBookingApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ReservationID")
    Long reservationId;
    @Column(name = "UserID")
    Long userId;
    @Column(name = "TableID")
    Long tableId;
    @Column(name = "RestaurantID")
    Long restaurantId;
    @Column(name = "ReservationDate")
    Date reservationDate;
    @Column(name = "ReservationTime")
    @JsonProperty("reservationTime")
    Time reservatrionTime;
    @Column(name = "PartySize")
    Integer partySize;

    public Long getReservationId() {
        return reservationId;
    }

    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

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

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public Time getReservatrionTime() {
        return reservatrionTime;
    }

    public void setReservatrionTime(Time reservatrionTime) {
        this.reservatrionTime = reservatrionTime;
    }

    public Integer getPartySize() {
        return partySize;
    }

    public void setPartySize(Integer partySize) {
        this.partySize = partySize;
    }
    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", userId=" + userId +
                ", tableId=" + tableId +
                ", restaurantId=" + restaurantId +
                ", reservationDate=" + reservationDate +
                ", reservatrionTime=" + reservatrionTime +
                ", partySize=" + partySize +
                '}';
    }
}
