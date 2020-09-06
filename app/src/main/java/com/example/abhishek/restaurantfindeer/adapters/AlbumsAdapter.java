package com.example.abhishek.restaurantfindeer.adapters;



import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.abhishek.restaurantfindeer.R;
import com.example.abhishek.restaurantfindeer.datamodel.RestaurantBean;
import com.example.abhishek.restaurantfindeer.datamodel.RestaurantsBean;

import java.util.List;

public class AlbumsAdapter extends RecyclerView.Adapter<AlbumsAdapter.MyViewHolder> {

    private Context mContext;
    //private List<JsonDummyRepresentation> albumList;
    private List<RestaurantsBean> restaurantsBeen;
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, albumid,id,city,address;
        public ImageView thumbnail;
        public RatingBar rating;

        public MyViewHolder(View view) {
            super(view);
            /*
            albumid = (TextView) view.findViewById(R.id.albumid);
            id = (TextView) view.findViewById(R.id.id);
            ;*/
            title = (TextView) view.findViewById(R.id.title_data);
            address=(TextView)view.findViewById(R.id.address);
            city=(TextView)view.findViewById(R.id.city);
            thumbnail = (ImageView) view.findViewById(R.id.list_image);
            rating=(RatingBar)view.findViewById(R.id.ratingBar);

        }
    }


    public AlbumsAdapter(Context mContext, List<RestaurantsBean> restaurantsBeen) {
        this.mContext = mContext;
        this.restaurantsBeen = restaurantsBeen;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_response, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {

        RestaurantBean restaurant=restaurantsBeen.get(position).getRestaurant();
        holder.title.setText(restaurant.getName());
        holder.city.setText(restaurant.getLocation().getCity());
        holder.address.setText(restaurant.getLocation().getAddress());
        holder.rating.setRating(Float.parseFloat(restaurant.getUser_rating().getAggregate_rating()));
        if (!restaurant.getThumb().equals(""))
        Glide.with(mContext).load(restaurant.getThumb()).into(holder.thumbnail);
        else
            holder.thumbnail.setImageResource(R.mipmap.ic_launcher);

    }



    @Override
    public int getItemCount() {
        return restaurantsBeen.size();
    }
}
