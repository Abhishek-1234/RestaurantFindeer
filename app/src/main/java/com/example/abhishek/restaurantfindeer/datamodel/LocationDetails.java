package com.example.abhishek.restaurantfindeer.datamodel;

import java.util.List;

/**
 * Created by ABHISHEK on 20-08-2017.
 */

public class LocationDetails {

    /**
     * location_suggestions : [{"entity_type":"city","entity_id":8,"title":"Lucknow","latitude":26.864,"longitude":80.95,"city_id":8,"city_name":"Lucknow","country_id":1,"country_name":"India"}]
     * status : success
     * has_more : 0
     * has_total : 0
     */

    private String status;
    private int has_more;
    private int has_total;
    private List<LocationSuggestionsBean> location_suggestions;




    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getHas_more() {
        return has_more;
    }

    public void setHas_more(int has_more) {
        this.has_more = has_more;
    }

    public int getHas_total() {
        return has_total;
    }

    public void setHas_total(int has_total) {
        this.has_total = has_total;
    }

    public List<LocationSuggestionsBean> getLocation_suggestions() {
        return location_suggestions;
    }

    public void setLocation_suggestions(List<LocationSuggestionsBean> location_suggestions) {
        this.location_suggestions = location_suggestions;
    }


}
