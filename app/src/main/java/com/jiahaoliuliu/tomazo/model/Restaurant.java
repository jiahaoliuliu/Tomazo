package com.jiahaoliuliu.tomazo.model;

/**
 * Created by jiahaoliuliu on 5/13/16.
 */
public class Restaurant {

    private String restaurantName;
    private int restaurantImageId;

    public Restaurant(String restaurantName, int restaurantImageId) {
        this.restaurantName = restaurantName;
        this.restaurantImageId = restaurantImageId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public int getRestaurantImageId() {
        return restaurantImageId;
    }

    public void setRestaurantImageId(int restaurantImageId) {
        this.restaurantImageId = restaurantImageId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Restaurant that = (Restaurant) o;

        if (getRestaurantImageId() != that.getRestaurantImageId()) return false;
        return getRestaurantName() != null ? getRestaurantName().equals(that.getRestaurantName()) : that.getRestaurantName() == null;

    }

    @Override
    public int hashCode() {
        int result = getRestaurantName() != null ? getRestaurantName().hashCode() : 0;
        result = 31 * result + getRestaurantImageId();
        return result;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantName='" + restaurantName + '\'' +
                ", restaurantImageId=" + restaurantImageId +
                '}';
    }
}
