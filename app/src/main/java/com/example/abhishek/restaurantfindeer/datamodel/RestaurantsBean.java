package com.example.abhishek.restaurantfindeer.datamodel;

import com.google.gson.Gson;

import java.util.List;

public  class RestaurantsBean {
    /**
     * restaurant : {"R":{"res_id":16613127},"apikey":"9d2944162894f32711911d556083025a","id":"16613127","name":"Spirit House","url":"https://www.zomato.com/yandina-qld/spirit-house-yandina?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","location":{"address":"20 Ninderry Rd, Yandina","locality":"Yandina","city":"Yandina","city_id":2613,"latitude":"-26.5508040000","longitude":"152.9584960000","zipcode":"4561","country_id":14,"locality_verbose":"Yandina, Yandina"},"switch_to_order_menu":0,"cuisines":"Asian, Thai","average_cost_for_two":25000017,"price_range":4,"currency":"$","offers":[],"thumb":"","user_rating":{"aggregate_rating":"4.6","rating_text":"Excellent","rating_color":"3F7E00","votes":"693"},"photos_url":"https://www.zomato.com/yandina-qld/spirit-house-yandina/photos?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1#tabtop","menu_url":"https://www.zomato.com/yandina-qld/spirit-house-yandina/menu?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1&openSwipeBox=menu&showMinimal=1#tabtop","featured_image":"","has_online_delivery":0,"is_delivering_now":0,"deeplink":"zomato://restaurant/16613127","has_table_booking":0,"events_url":"https://www.zomato.com/yandina-qld/spirit-house-yandina/events#tabtop?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","establishment_types":[]}
     */

    private RestaurantBean restaurant;


    public RestaurantBean getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(RestaurantBean restaurant) {
        this.restaurant = restaurant;
    }

    }
