package com.example.serendipitydonationapp.money.cancer.usaCancer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.serendipitydonationapp.R;
import com.example.serendipitydonationapp.money.cancer.uaeCancer.Cancer_org;
import com.example.serendipitydonationapp.money.cancer.uaeCancer.Cancer_rvAdapter;

import java.util.ArrayList;

public class UsaCancer_rvAdapter extends RecyclerView.Adapter<UsaCancer_rvAdapter.CancerViewHolder> {

    ArrayList<Cancer_org> cancer_org = new ArrayList<>();
    private Context cancer_context;

    public UsaCancer_rvAdapter (Context cancer_context){
        this.cancer_context = cancer_context;
    }

    public UsaCancer_rvAdapter() {

    }

    @NonNull
    @Override
    public UsaCancer_rvAdapter.CancerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_org_list, parent, false);
        UsaCancer_rvAdapter.CancerViewHolder holder = new UsaCancer_rvAdapter.CancerViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull UsaCancer_rvAdapter.CancerViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.food_org_name_tv.setText(cancer_org.get(position).getName());
        holder.food_org_site_tv.setText(cancer_org.get(position).getSiteURL());
        holder.food_org_list_parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(cancer_context, cancer_org.get(position).getName() + " selected", Toast.LENGTH_SHORT).show();

                gotoUrl(cancer_org.get(position).getSiteURL());
            }
        });

        Glide.with(cancer_context)
                .asBitmap()
                .load(cancer_org.get(position).getImgURL())
                .into(holder.food_org_img);
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        cancer_context.startActivity(i);
    }

    @Override
    public int getItemCount() {
        return cancer_org.size();
    }

    public void setCancer_org(ArrayList<Cancer_org> cancer_org) {
        this.cancer_org = cancer_org;
        notifyDataSetChanged();
    }

    public class CancerViewHolder extends RecyclerView.ViewHolder{

        private TextView food_org_name_tv, food_org_site_tv;
        private ImageView food_org_img;
        private CardView food_org_list_parent;

        public CancerViewHolder(@NonNull View itemView) {
            super(itemView);

            food_org_name_tv = itemView.findViewById(R.id.food_org_name_tv);
            food_org_site_tv = itemView.findViewById(R.id.food_org_site_tv);
            food_org_img = itemView.findViewById(R.id.food_org_img);
            food_org_list_parent = itemView.findViewById(R.id.food_org_list_parent);
        }
    }
}
