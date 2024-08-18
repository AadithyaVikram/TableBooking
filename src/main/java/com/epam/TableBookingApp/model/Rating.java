package com.epam.TableBookingApp.model;
import jakarta.persistence.*;

@Entity
@Table(name = "rating_reviews")
public class Rating {
    @Id
    @Column(name = "RatingID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long ratingId;
    @Column(name = "RestaurantID")
    Long restaurantId;
    @Column(name = "UserID")
    Long userId;
    @Column(name = "Rating")
    Float rating;
    @Column(name = "Reviews")
    String review;

    @Override
    public String toString() {
        return "Rating{" +
                "ratingId=" + ratingId +
                ", restaurantId=" + restaurantId +
                ", userId=" + userId +
                ", rating=" + rating +
                ", review='" + review + '\'' +
                '}';
    }

    public Long getRatingId() {
        return ratingId;
    }

    public void setRatingId(Long ratingId) {
        this.ratingId = ratingId;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
