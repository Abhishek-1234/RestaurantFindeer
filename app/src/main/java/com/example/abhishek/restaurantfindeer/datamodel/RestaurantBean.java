package com.example.abhishek.restaurantfindeer.datamodel;

import com.google.gson.Gson;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ABHISHEK on 22-08-2017.
 */
public  class RestaurantBean implements Serializable{
    /**
     * R : {"res_id":16613127}
     * apikey : 9d2944162894f32711911d556083025a
     * id : 16613127
     * name : Spirit House
     * url : https://www.zomato.com/yandina-qld/spirit-house-yandina?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1
     * location : {"address":"20 Ninderry Rd, Yandina","locality":"Yandina","city":"Yandina","city_id":2613,"latitude":"-26.5508040000","longitude":"152.9584960000","zipcode":"4561","country_id":14,"locality_verbose":"Yandina, Yandina"}
     * switch_to_order_menu : 0
     * cuisines : Asian, Thai
     * average_cost_for_two : 25000017
     * price_range : 4
     * currency : $
     * offers : []
     * thumb :
     * user_rating : {"aggregate_rating":"4.6","rating_text":"Excellent","rating_color":"3F7E00","votes":"693"}
     * photos_url : https://www.zomato.com/yandina-qld/spirit-house-yandina/photos?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1#tabtop
     * menu_url : https://www.zomato.com/yandina-qld/spirit-house-yandina/menu?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1&openSwipeBox=menu&showMinimal=1#tabtop
     * featured_image :
     * has_online_delivery : 0
     * is_delivering_now : 0
     * deeplink : zomato://restaurant/16613127
     * has_table_booking : 0
     * events_url : https://www.zomato.com/yandina-qld/spirit-house-yandina/events#tabtop?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1
     * establishment_types : []
     */

    private RBean R;
    private String apikey;
    private String id;
    private String name;
    private String url;
    private LocationBean location;
    private int switch_to_order_menu;
    private String cuisines;
    private int average_cost_for_two;
    private int price_range;
    private String currency;
    private String thumb;
    private UserRatingBean user_rating;
    private String photos_url;
    private String menu_url;
    private String featured_image;
    private int has_online_delivery;
    private int is_delivering_now;
    private String deeplink;
    private int has_table_booking;
    private String events_url;
    private List<?> offers;
    private List<?> establishment_types;


    public RBean getR() {
        return R;
    }

    public void setR(RBean R) {
        this.R = R;
    }

    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocationBean getLocation() {
        return location;
    }

    public void setLocation(LocationBean location) {
        this.location = location;
    }

    public int getSwitch_to_order_menu() {
        return switch_to_order_menu;
    }

    public void setSwitch_to_order_menu(int switch_to_order_menu) {
        this.switch_to_order_menu = switch_to_order_menu;
    }

    public String getCuisines() {
        return cuisines;
    }

    public void setCuisines(String cuisines) {
        this.cuisines = cuisines;
    }

    public int getAverage_cost_for_two() {
        return average_cost_for_two;
    }

    public void setAverage_cost_for_two(int average_cost_for_two) {
        this.average_cost_for_two = average_cost_for_two;
    }

    public int getPrice_range() {
        return price_range;
    }

    public void setPrice_range(int price_range) {
        this.price_range = price_range;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public UserRatingBean getUser_rating() {
        return user_rating;
    }

    public void setUser_rating(UserRatingBean user_rating) {
        this.user_rating = user_rating;
    }

    public String getPhotos_url() {
        return photos_url;
    }

    public void setPhotos_url(String photos_url) {
        this.photos_url = photos_url;
    }

    public String getMenu_url() {
        return menu_url;
    }

    public void setMenu_url(String menu_url) {
        this.menu_url = menu_url;
    }

    public String getFeatured_image() {
        return featured_image;
    }

    public void setFeatured_image(String featured_image) {
        this.featured_image = featured_image;
    }

    public int getHas_online_delivery() {
        return has_online_delivery;
    }

    public void setHas_online_delivery(int has_online_delivery) {
        this.has_online_delivery = has_online_delivery;
    }

    public int getIs_delivering_now() {
        return is_delivering_now;
    }

    public void setIs_delivering_now(int is_delivering_now) {
        this.is_delivering_now = is_delivering_now;
    }

    public String getDeeplink() {
        return deeplink;
    }

    public void setDeeplink(String deeplink) {
        this.deeplink = deeplink;
    }

    public int getHas_table_booking() {
        return has_table_booking;
    }

    public void setHas_table_booking(int has_table_booking) {
        this.has_table_booking = has_table_booking;
    }

    public String getEvents_url() {
        return events_url;
    }

    public void setEvents_url(String events_url) {
        this.events_url = events_url;
    }

    public List<?> getOffers() {
        return offers;
    }

    public void setOffers(List<?> offers) {
        this.offers = offers;
    }

    public List<?> getEstablishment_types() {
        return establishment_types;
    }

    public void setEstablishment_types(List<?> establishment_types) {
        this.establishment_types = establishment_types;
    }

    public static class RBean {
        /**
         * res_id : 16613127
         */

        private int res_id;


        public int getRes_id() {
            return res_id;
        }

        public void setRes_id(int res_id) {
            this.res_id = res_id;
        }
    }

    public static class LocationBean {
        /**
         * address : 20 Ninderry Rd, Yandina
         * locality : Yandina
         * city : Yandina
         * city_id : 2613
         * latitude : -26.5508040000
         * longitude : 152.9584960000
         * zipcode : 4561
         * country_id : 14
         * locality_verbose : Yandina, Yandina
         */

        private String address;
        private String locality;
        private String city;
        private int city_id;
        private String latitude;
        private String longitude;
        private String zipcode;
        private int country_id;
        private String locality_verbose;


        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getLocality() {
            return locality;
        }

        public void setLocality(String locality) {
            this.locality = locality;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public int getCity_id() {
            return city_id;
        }

        public void setCity_id(int city_id) {
            this.city_id = city_id;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

        public String getZipcode() {
            return zipcode;
        }

        public void setZipcode(String zipcode) {
            this.zipcode = zipcode;
        }

        public int getCountry_id() {
            return country_id;
        }

        public void setCountry_id(int country_id) {
            this.country_id = country_id;
        }

        public String getLocality_verbose() {
            return locality_verbose;
        }

        public void setLocality_verbose(String locality_verbose) {
            this.locality_verbose = locality_verbose;
        }
    }

    public static class UserRatingBean {
        /**
         * aggregate_rating : 4.6
         * rating_text : Excellent
         * rating_color : 3F7E00
         * votes : 693
         */

        private String aggregate_rating;
        private String rating_text;
        private String rating_color;
        private String votes;

        public static UserRatingBean objectFromData(String str) {

            return new Gson().fromJson(str, UserRatingBean.class);
        }


        public String getAggregate_rating() {
            return aggregate_rating;
        }

        public void setAggregate_rating(String aggregate_rating) {
            this.aggregate_rating = aggregate_rating;
        }

        public String getRating_text() {
            return rating_text;
        }

        public void setRating_text(String rating_text) {
            this.rating_text = rating_text;
        }

        public String getRating_color() {
            return rating_color;
        }

        public void setRating_color(String rating_color) {
            this.rating_color = rating_color;
        }

        public String getVotes() {
            return votes;
        }

        public void setVotes(String votes) {
            this.votes = votes;
        }
    }
}

