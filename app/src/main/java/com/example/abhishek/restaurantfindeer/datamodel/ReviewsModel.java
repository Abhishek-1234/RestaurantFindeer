package com.example.abhishek.restaurantfindeer.datamodel;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ABHISHEK on 22-08-2017.
 */

public class ReviewsModel implements Serializable{


    /**
     * reviews_count : 19
     * reviews_start : 0
     * reviews_shown : 5
     * user_reviews : [{"review":{"rating":3,"review_text":"Had the buffet and sweet tea.  Tea was not overly sweet which is how I like it.  Fried chicken was crunchy and vegetable were good and not o...","id":"31324662","rating_color":"CDD614","review_time_friendly":"13 days ago","rating_text":"Average","timestamp":1502284251,"likes":0,"user":{"name":"Dkanasazi","foodie_level":"Big Foodie","foodie_level_num":4,"foodie_color":"ffae4f","profile_url":"https://www.zomato.com/users/dkanasazi-32616373?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","profile_image":"https://b.zmtcdn.com/data/user_profile_pictures/e89/2143e1b73fe73ac6ab43e968024c5e89.jpg?fit=around%7C100%3A100&crop=100%3A100%3B%2A%2C%2A","profile_deeplink":"zomato://u/32616373"},"comments_count":0}},{"review":{"rating":4.5,"review_text":"The most well-known restaurant in Columbus Texas. They recently remodeled the inside and redid the parking lot. There is a lunch buffet ever...","id":"31266329","rating_color":"3F7E00","review_time_friendly":"18 days ago","rating_text":"Loved it!","timestamp":1501851728,"likes":0,"user":{"name":"Robert Smith","foodie_level":"Big Foodie","foodie_level_num":4,"foodie_color":"ffae4f","profile_url":"https://www.zomato.com/users/robert-smith-21549843?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","profile_image":"https://b.zmtcdn.com/images/user_avatars/wine_2x.png?fit=around%7C200%3A200&crop=200%3A200%3B%2A%2C%2A","profile_deeplink":"zomato://u/21549843"},"comments_count":0}},{"review":{"rating":3.5,"review_text":"Buffet menu is better and economical, a good place for family dine in Columbus. Nothing spectacular but not bad as well. I guess I liked the...","id":"30092690","rating_color":"9ACD32","review_time_friendly":"4 months ago","rating_text":"Good Enough","timestamp":1492582201,"likes":0,"user":{"name":"Tina Johnson","foodie_level":"Big Foodie","foodie_level_num":5,"foodie_color":"ffae4f","profile_url":"https://www.zomato.com/users/tina-johnson-2260310?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","profile_image":"https://b.zmtcdn.com/data/user_profile_pictures/4db/d26f1f30b70d2835e7b60292dae604db.jpg?fit=around%7C100%3A100&crop=100%3A100%3B%2A%2C%2A","profile_deeplink":"zomato://u/2260310"},"comments_count":0}},{"review":{"rating":0,"review_text":"Regular stop for family. Good service and good food. Not super fancy nor the cheapest, but we always leave sated nd satisfied. Try the schni...","id":"22563253","rating_color":"CBCBC8","review_time_friendly":"Aug 04, 2014","rating_text":"Not rated","timestamp":1407096636,"likes":0,"user":{"name":"Kgc","foodie_level":"Foodie","foodie_level_num":3,"foodie_color":"ffd35d","profile_url":"https://www.zomato.com/users/kgc-21366205?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","profile_image":"https://b.zmtcdn.com/images/user_avatars/cupcake.png?fit=around%7C200%3A200&crop=200%3A200%3B%2A%2C%2A","profile_deeplink":"zomato://u/21366205"},"comments_count":0}},{"review":{"rating":0,"review_text":"Pricey for quality of food.. Very disappointed and regret choosing Schobals for our rare dinner out. The services was the best part of the m...","id":"22563250","rating_color":"CBCBC8","review_time_friendly":"Aug 01, 2014","rating_text":"Not rated","timestamp":1406846086,"likes":0,"user":{"name":"Jschuman","foodie_level":"Foodie","foodie_level_num":2,"foodie_color":"ffd35d","profile_url":"https://www.zomato.com/users/jschuman-24814128?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","profile_image":"https://b.zmtcdn.com/images/user_avatars/mug_2x.png?fit=around%7C200%3A200&crop=200%3A200%3B%2A%2C%2A","profile_deeplink":"zomato://u/24814128"},"comments_count":0}}]
     * Respond to reviews via Zomato Dashboard : https://www.zomato.com/business/claim?ref=rpg&resid=17649424#claim
     */

    private int reviews_count;
    private int reviews_start;
    private int reviews_shown;
    @SerializedName("Respond to reviews via Zomato Dashboard")
    private String _$RespondToReviewsViaZomatoDashboard213; // FIXME check this code
    private List<UserReviewsBean> user_reviews;


    public int getReviews_count() {
        return reviews_count;
    }

    public void setReviews_count(int reviews_count) {
        this.reviews_count = reviews_count;
    }

    public int getReviews_start() {
        return reviews_start;
    }

    public void setReviews_start(int reviews_start) {
        this.reviews_start = reviews_start;
    }

    public int getReviews_shown() {
        return reviews_shown;
    }

    public void setReviews_shown(int reviews_shown) {
        this.reviews_shown = reviews_shown;
    }

    public String get_$RespondToReviewsViaZomatoDashboard213() {
        return _$RespondToReviewsViaZomatoDashboard213;
    }

    public void set_$RespondToReviewsViaZomatoDashboard213(String _$RespondToReviewsViaZomatoDashboard213) {
        this._$RespondToReviewsViaZomatoDashboard213 = _$RespondToReviewsViaZomatoDashboard213;
    }

    public List<UserReviewsBean> getUser_reviews() {
        return user_reviews;
    }

    public void setUser_reviews(List<UserReviewsBean> user_reviews) {
        this.user_reviews = user_reviews;
    }

    public static class UserReviewsBean {
        /**
         * review : {"rating":3,"review_text":"Had the buffet and sweet tea.  Tea was not overly sweet which is how I like it.  Fried chicken was crunchy and vegetable were good and not o...","id":"31324662","rating_color":"CDD614","review_time_friendly":"13 days ago","rating_text":"Average","timestamp":1502284251,"likes":0,"user":{"name":"Dkanasazi","foodie_level":"Big Foodie","foodie_level_num":4,"foodie_color":"ffae4f","profile_url":"https://www.zomato.com/users/dkanasazi-32616373?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","profile_image":"https://b.zmtcdn.com/data/user_profile_pictures/e89/2143e1b73fe73ac6ab43e968024c5e89.jpg?fit=around%7C100%3A100&crop=100%3A100%3B%2A%2C%2A","profile_deeplink":"zomato://u/32616373"},"comments_count":0}
         */

        private ReviewBean review;


        public ReviewBean getReview() {
            return review;
        }

        public void setReview(ReviewBean review) {
            this.review = review;
        }

        public static class ReviewBean {
            /**
             * rating : 3
             * review_text : Had the buffet and sweet tea.  Tea was not overly sweet which is how I like it.  Fried chicken was crunchy and vegetable were good and not o...
             * id : 31324662
             * rating_color : CDD614
             * review_time_friendly : 13 days ago
             * rating_text : Average
             * timestamp : 1502284251
             * likes : 0
             * user : {"name":"Dkanasazi","foodie_level":"Big Foodie","foodie_level_num":4,"foodie_color":"ffae4f","profile_url":"https://www.zomato.com/users/dkanasazi-32616373?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","profile_image":"https://b.zmtcdn.com/data/user_profile_pictures/e89/2143e1b73fe73ac6ab43e968024c5e89.jpg?fit=around%7C100%3A100&crop=100%3A100%3B%2A%2C%2A","profile_deeplink":"zomato://u/32616373"}
             * comments_count : 0
             */

            private int rating;
            private String review_text;
            private String id;
            private String rating_color;
            private String review_time_friendly;
            private String rating_text;
            private int timestamp;
            private int likes;
            private UserBean user;
            private int comments_count;



            public int getRating() {
                return rating;
            }

            public void setRating(int rating) {
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

            public int getTimestamp() {
                return timestamp;
            }

            public void setTimestamp(int timestamp) {
                this.timestamp = timestamp;
            }

            public int getLikes() {
                return likes;
            }

            public void setLikes(int likes) {
                this.likes = likes;
            }

            public UserBean getUser() {
                return user;
            }

            public void setUser(UserBean user) {
                this.user = user;
            }

            public int getComments_count() {
                return comments_count;
            }

            public void setComments_count(int comments_count) {
                this.comments_count = comments_count;
            }

            public static class UserBean {
                /**
                 * name : Dkanasazi
                 * foodie_level : Big Foodie
                 * foodie_level_num : 4
                 * foodie_color : ffae4f
                 * profile_url : https://www.zomato.com/users/dkanasazi-32616373?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1
                 * profile_image : https://b.zmtcdn.com/data/user_profile_pictures/e89/2143e1b73fe73ac6ab43e968024c5e89.jpg?fit=around%7C100%3A100&crop=100%3A100%3B%2A%2C%2A
                 * profile_deeplink : zomato://u/32616373
                 */

                private String name;
                private String foodie_level;
                private int foodie_level_num;
                private String foodie_color;
                private String profile_url;
                private String profile_image;
                private String profile_deeplink;



                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getFoodie_level() {
                    return foodie_level;
                }

                public void setFoodie_level(String foodie_level) {
                    this.foodie_level = foodie_level;
                }

                public int getFoodie_level_num() {
                    return foodie_level_num;
                }

                public void setFoodie_level_num(int foodie_level_num) {
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

                public String getProfile_image() {
                    return profile_image;
                }

                public void setProfile_image(String profile_image) {
                    this.profile_image = profile_image;
                }

                public String getProfile_deeplink() {
                    return profile_deeplink;
                }

                public void setProfile_deeplink(String profile_deeplink) {
                    this.profile_deeplink = profile_deeplink;
                }
            }
        }
    }
}
