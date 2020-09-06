package com.example.abhishek.restaurantfindeer.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.abhishek.restaurantfindeer.R;
import com.example.abhishek.restaurantfindeer.datamodel.ReviewsModel;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class ReviewsAdapter extends RecyclerView.Adapter<ReviewsAdapter.MyViewHolder> {

    Context context;
    List<ReviewsModel.UserReviewsBean> mList;
    public ReviewsAdapter(Context context, List<ReviewsModel.UserReviewsBean> mList){
        this.context=context;
        this.mList=mList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.user_image)
        ImageView userImage;
        @BindView(R.id.user_name)
        TextView userName;
        @BindView(R.id.foodie_level)
        TextView userFoodieLevel;
        @BindView(R.id.user_rating)
        TextView userRating;
        @BindView(R.id.user_review)
        TextView userReview;
        @BindView(R.id.review_days_ago)
        TextView reviewHistory;

        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }

    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.review_item_layout,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        ReviewsModel.UserReviewsBean.ReviewBean review=mList.get(position).getReview();
        Picasso.with(context).load(review.getUser().getProfile_image()).placeholder(R.mipmap.ic_launcher_round).into(holder.userImage);
        holder.reviewHistory.append(review.getReview_time_friendly());
        holder.userName.append(review.getUser().getName());
        holder.userFoodieLevel.append(review.getUser().getFoodie_level());
        holder.userRating.append(review.getRating_text());
        holder.userReview.append(review.getReview_text());

    }



    @Override
    public int getItemCount() {
        if (mList.size()!=0)
        return mList.size();
        else
            return 0;
    }
}
