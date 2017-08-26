package com.example.abhishek.restaurantfindeer.datamodel;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ABHISHEK on 23-08-2017.
 */

public class OnlyRestaurantModel {


    /**
     * id : 16774318
     * name : Otto Enoteca & Pizzeria
     * url : https://www.zomato.com/new-york-city/otto-enoteca-pizzeria-greenwich-village
     * location : {"address":"1 5th Avenue, New York, NY 10003","locality":"Greenwich Village","city":"New York City","latitude":"40.732013","longitude":"-73.996155","zipcode":"10003","country_id":"216"}
     * average_cost_for_two : 60
     * price_range : 2
     * currency : $
     * thumb : https://b.zmtcdn.com/data/pictures/chains/8/16774318/a54deb9e4dbb79dd7c8091b30c642077_featured_thumb.png
     * featured_image : https://d.zmtcdn.com/data/pictures/chains/8/16774318/a54deb9e4dbb79dd7c8091b30c642077_featured_v2.png
     * photos_url : https://www.zomato.com/new-york-city/otto-enoteca-pizzeria-greenwich-village/photos#tabtop
     * menu_url : https://www.zomato.com/new-york-city/otto-enoteca-pizzeria-greenwich-village/menu#tabtop
     * events_url : https://www.zomato.com/new-york-city/otto-enoteca-pizzeria-greenwich-village/events#tabtop
     * user_rating : {"aggregate_rating":"3.7","rating_text":"Very Good","rating_color":"5BA829","votes":"1046"}
     * has_online_delivery : 0
     * is_delivering_now : 0
     * has_table_booking : 0
     * deeplink : zomato://r/16774318
     * cuisines : Cafe
     * all_reviews_count : 15
     * photo_count : 18
     * phone_numbers : (212) 228-2930
     * photos : [{"id":"u_MjA5MjY1OTk5OT","url":"https://b.zmtcdn.com/data/reviews_photos/c15/9eb13ceaf6e90129c276ce6ff980bc15_1435111695_640_640_thumb.JPG","thumb_url":"https://b.zmtcdn.com/data/reviews_photos/c15/9eb13ceaf6e90129c276ce6ff980bc15_1435111695_200_thumb.JPG","user":{"name":"John Doe","zomato_handle":"John","foodie_level":"Super Foodie","foodie_level_num":"9","foodie_color":"f58552","profile_url":"https://www.zomato.com/john","profile_deeplink":"zoma.to/u/1170245","profile_image":"string"},"res_id":"16782899","caption":"#awesome","timestamp":"1435111770","friendly_time":"3 months ago","width":"640","height":"640","comments_count":"0","likes_count":"0"}]
     * all_reviews : [{"rating":"5","review_text":"The best latte I've ever had. It tasted a little sweet","id":"24127336","rating_color":"305D02","review_time_friendly":"2 months ago","rating_text":"Insane!","timestamp":"1435507367","likes":"0","user":{"name":"John Doe","zomato_handle":"John","foodie_level":"Super Foodie","foodie_level_num":"9","foodie_color":"f58552","profile_url":"https://www.zomato.com/john","profile_deeplink":"zoma.to/u/1170245","profile_image":"string"},"comments_count":"0"}]
     */

    private String id;
    private String name;
    private String url;
    private LocationBean location;
    private String average_cost_for_two;
    private String price_range;
    private String currency;
    private String thumb;
    private String featured_image;
    private String photos_url;
    private String menu_url;
    private String events_url;
    private UserRatingBean user_rating;
    private String has_online_delivery;
    private String is_delivering_now;
    private String has_table_booking;
    private String deeplink;
    private String cuisines;
    private String all_reviews_count;
    private String photo_count;
    private String phone_numbers;
    private List<PhotosBean> photos;
    private List<AllReviewsBean> all_reviews;


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

    public String getAverage_cost_for_two() {
        return average_cost_for_two;
    }

    public void setAverage_cost_for_two(String average_cost_for_two) {
        this.average_cost_for_two = average_cost_for_two;
    }

    public String getPrice_range() {
        return price_range;
    }

    public void setPrice_range(String price_range) {
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

    public String getFeatured_image() {
        return featured_image;
    }

    public void setFeatured_image(String featured_image) {
        this.featured_image = featured_image;
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

    public String getEvents_url() {
        return events_url;
    }

    public void setEvents_url(String events_url) {
        this.events_url = events_url;
    }

    public UserRatingBean getUser_rating() {
        return user_rating;
    }

    public void setUser_rating(UserRatingBean user_rating) {
        this.user_rating = user_rating;
    }

    public String getHas_online_delivery() {
        return has_online_delivery;
    }

    public void setHas_online_delivery(String has_online_delivery) {
        this.has_online_delivery = has_online_delivery;
    }

    public String getIs_delivering_now() {
        return is_delivering_now;
    }

    public void setIs_delivering_now(String is_delivering_now) {
        this.is_delivering_now = is_delivering_now;
    }

    public String getHas_table_booking() {
        return has_table_booking;
    }

    public void setHas_table_booking(String has_table_booking) {
        this.has_table_booking = has_table_booking;
    }

    public String getDeeplink() {
        return deeplink;
    }

    public void setDeeplink(String deeplink) {
        this.deeplink = deeplink;
    }

    public String getCuisines() {
        return cuisines;
    }

    public void setCuisines(String cuisines) {
        this.cuisines = cuisines;
    }

    public String getAll_reviews_count() {
        return all_reviews_count;
    }

    public void setAll_reviews_count(String all_reviews_count) {
        this.all_reviews_count = all_reviews_count;
    }

    public String getPhoto_count() {
        return photo_count;
    }

    public void setPhoto_count(String photo_count) {
        this.photo_count = photo_count;
    }

    public String getPhone_numbers() {
        return phone_numbers;
    }

    public void setPhone_numbers(String phone_numbers) {
        this.phone_numbers = phone_numbers;
    }

    public List<PhotosBean> getPhotos() {
        return photos;
    }

    public void setPhotos(List<PhotosBean> photos) {
        this.photos = photos;
    }

    public List<AllReviewsBean> getAll_reviews() {
        return all_reviews;
    }

    public void setAll_reviews(List<AllReviewsBean> all_reviews) {
        this.all_reviews = all_reviews;
    }

    public static class LocationBean {
        /**
         * address : 1 5th Avenue, New York, NY 10003
         * locality : Greenwich Village
         * city : New York City
         * latitude : 40.732013
         * longitude : -73.996155
         * zipcode : 10003
         * country_id : 216
         */

        private String address;
        private String locality;
        private String city;
        private String latitude;
        private String longitude;
        private String zipcode;
        private String country_id;


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

        public String getCountry_id() {
            return country_id;
        }

        public void setCountry_id(String country_id) {
            this.country_id = country_id;
        }
    }

    public static class UserRatingBean {
        /**
         * aggregate_rating : 3.7
         * rating_text : Very Good
         * rating_color : 5BA829
         * votes : 1046
         */

        private String aggregate_rating;
        private String rating_text;
        private String rating_color;
        private String votes;

        public static UserRatingBean objectFromData(String str) {

            return new Gson().fromJson(str, UserRatingBean.class);
        }

        public static UserRatingBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), UserRatingBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static List<UserRatingBean> arrayUserRatingBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<UserRatingBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public static List<UserRatingBean> arrayUserRatingBeanFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new TypeToken<ArrayList<UserRatingBean>>() {
                }.getType();

                return new Gson().fromJson(jsonObject.getString(str), listType);

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return new ArrayList();


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

    public static class PhotosBean {
        /**
         * id : u_MjA5MjY1OTk5OT
         * url : https://b.zmtcdn.com/data/reviews_photos/c15/9eb13ceaf6e90129c276ce6ff980bc15_1435111695_640_640_thumb.JPG
         * thumb_url : https://b.zmtcdn.com/data/reviews_photos/c15/9eb13ceaf6e90129c276ce6ff980bc15_1435111695_200_thumb.JPG
         * user : {"name":"John Doe","zomato_handle":"John","foodie_level":"Super Foodie","foodie_level_num":"9","foodie_color":"f58552","profile_url":"https://www.zomato.com/john","profile_deeplink":"zoma.to/u/1170245","profile_image":"string"}
         * res_id : 16782899
         * caption : #awesome
         * timestamp : 1435111770
         * friendly_time : 3 months ago
         * width : 640
         * height : 640
         * comments_count : 0
         * likes_count : 0
         */

        private String id;
        private String url;
        private String thumb_url;
        private UserBean user;
        private String res_id;
        private String caption;
        private String timestamp;
        private String friendly_time;
        private String width;
        private String height;
        private String comments_count;
        private String likes_count;

        public static PhotosBean objectFromData(String str) {

            return new Gson().fromJson(str, PhotosBean.class);
        }

        public static PhotosBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), PhotosBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static List<PhotosBean> arrayPhotosBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<PhotosBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public static List<PhotosBean> arrayPhotosBeanFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new TypeToken<ArrayList<PhotosBean>>() {
                }.getType();

                return new Gson().fromJson(jsonObject.getString(str), listType);

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return new ArrayList();


        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getThumb_url() {
            return thumb_url;
        }

        public void setThumb_url(String thumb_url) {
            this.thumb_url = thumb_url;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public String getRes_id() {
            return res_id;
        }

        public void setRes_id(String res_id) {
            this.res_id = res_id;
        }

        public String getCaption() {
            return caption;
        }

        public void setCaption(String caption) {
            this.caption = caption;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public String getFriendly_time() {
            return friendly_time;
        }

        public void setFriendly_time(String friendly_time) {
            this.friendly_time = friendly_time;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getComments_count() {
            return comments_count;
        }

        public void setComments_count(String comments_count) {
            this.comments_count = comments_count;
        }

        public String getLikes_count() {
            return likes_count;
        }

        public void setLikes_count(String likes_count) {
            this.likes_count = likes_count;
        }

        public static class UserBean {
            /**
             * name : John Doe
             * zomato_handle : John
             * foodie_level : Super Foodie
             * foodie_level_num : 9
             * foodie_color : f58552
             * profile_url : https://www.zomato.com/john
             * profile_deeplink : zoma.to/u/1170245
             * profile_image : string
             */

            private String name;
            private String zomato_handle;
            private String foodie_level;
            private String foodie_level_num;
            private String foodie_color;
            private String profile_url;
            private String profile_deeplink;
            private String profile_image;

            public static UserBean objectFromData(String str) {

                return new Gson().fromJson(str, UserBean.class);
            }

            public static UserBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), UserBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<UserBean> arrayUserBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<UserBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<UserBean> arrayUserBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<UserBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getZomato_handle() {
                return zomato_handle;
            }

            public void setZomato_handle(String zomato_handle) {
                this.zomato_handle = zomato_handle;
            }

            public String getFoodie_level() {
                return foodie_level;
            }

            public void setFoodie_level(String foodie_level) {
                this.foodie_level = foodie_level;
            }

            public String getFoodie_level_num() {
                return foodie_level_num;
            }

            public void setFoodie_level_num(String foodie_level_num) {
                this.foodie_level_num = foodie_level_num;
            }

            public String getFoodie_color() {
                return foodie_color;
            }

            public void setFoodie_color(String foodie_color) {
                this.foodie_color = foodie_color;
            }

            public String getProfile_url() {
                return profile_url;
            }

            public void setProfile_url(String profile_url) {
                this.profile_url = profile_url;
            }

            public String getProfile_deeplink() {
                return profile_deeplink;
            }

            public void setProfile_deeplink(String profile_deeplink) {
                this.profile_deeplink = profile_deeplink;
            }

            public String getProfile_image() {
                return profile_image;
            }

            public void setProfile_image(String profile_image) {
                this.profile_image = profile_image;
            }
        }
    }

    public static class AllReviewsBean {
        /**
         * rating : 5
         * review_text : The best latte I've ever had. It tasted a little sweet
         * id : 24127336
         * rating_color : 305D02
         * review_time_friendly : 2 months ago
         * rating_text : Insane!
         * timestamp : 1435507367
         * likes : 0
         * user : {"name":"John Doe","zomato_handle":"John","foodie_level":"Super Foodie","foodie_level_num":"9","foodie_color":"f58552","profile_url":"https://www.zomato.com/john","profile_deeplink":"zoma.to/u/1170245","profile_image":"string"}
         * comments_count : 0
         */

        private String rating;
        private String review_text;
        private String id;
        private String rating_color;
        private String review_time_friendly;
        private String rating_text;
        private String timestamp;
        private String likes;
  //      private UserBean user;
        private String comments_count;

        public static AllReviewsBean objectFromData(String str) {

            return new Gson().fromJson(str, AllReviewsBean.class);
        }

        public static AllReviewsBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), AllReviewsBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static List<AllReviewsBean> arrayAllReviewsBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<AllReviewsBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public static List<AllReviewsBean> arrayAllReviewsBeanFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new TypeToken<ArrayList<AllReviewsBean>>() {
                }.getType();

                return new Gson().fromJson(jsonObject.getString(str), listType);

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return new ArrayList();


        }

        public String getRating() {
            return rating;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }

        public String getReview_text() {
            return review_text;
        }

        public void setReview_text(String review_text) {
            this.review_text = review_text;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getRating_color() {
            return rating_color;
        }

        public void setRating_color(String rating_color) {
            this.rating_color = rating_color;
        }

        public String getReview_time_friendly() {
            return review_time_friendly;
        }

        public void setReview_time_friendly(String review_time_friendly) {
            this.review_time_friendly = review_time_friendly;
        }

        public String getRating_text() {
            return rating_text;
        }

        public void setRating_text(String rating_text) {
            this.rating_text = rating_text;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public String getLikes() {
            return likes;
        }

        public void setLikes(String likes) {
            this.likes = likes;
        }

      /*  public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }*/

        public String getComments_count() {
            return comments_count;
        }

        public void setComments_count(String comments_count) {
            this.comments_count = comments_count;
        }
    }
}
