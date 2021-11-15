/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;


import java.util.ArrayList;
/**
 *
 * @author harold
 */
public class RestaurantDirectory {
   ArrayList<Restaurant> restaurants;
public  RestaurantDirectory()
{
    this.restaurants=new ArrayList<>();
}
    public ArrayList<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(Restaurant restaurant) {
        this.restaurants.add(restaurant);
    }
}
