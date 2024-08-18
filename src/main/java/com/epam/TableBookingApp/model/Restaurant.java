package com.epam.TableBookingApp.model;

import jakarta.persistence.*;
import jakarta.persistence.Table;

@Entity
@Table(name = "restaurant")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restaurantid")
    Long restaurantId;
    @Column(name = "RestaurantName")
    String name;
    @Column(name = "RestaurantLocation")
    String location;
    @Column(name = "RestaurantTotalTableCount")
    Integer totalTableCount;
    @Column(name ="RestaurantDescription")
    String description;
    @Column(name = "RestaurantCity")
    String city;

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantId=" + restaurantId +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", totalTableCount=" + totalTableCount +
                ", description='" + description + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getTotalTableCount() {
        return totalTableCount;
    }

    public void setTotalTableCount(Integer totalTableCount) {
        this.totalTableCount = totalTableCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
