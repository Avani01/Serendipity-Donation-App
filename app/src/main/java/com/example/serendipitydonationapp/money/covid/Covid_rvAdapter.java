package com.example.serendipitydonationapp.money.covid;

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

import java.util.ArrayList;

public class Covid_rvAdapter extends RecyclerView.Adapter<Covid_rvAdapter.CovidViewHolder> {
    ArrayList<Covid_org> covid_org = new ArrayList<>();
    private Context covid_context;

    public Covid_rvAdapter (Context covid_context){
        this.covid_context = covid_context;
    }

    public Covid_rvAdapter() {

    }

    @NonNull
    @Override
    public Covid_rvAdapter.CovidViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_org_list, parent, false);
        Covid_rvAdapter.CovidViewHolder holder = new Covid_rvAdapter.CovidViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Covid_rvAdapter.CovidViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.food_org_name_tv.setText(covid_org.get(position).getName());
        holder.food_org_site_tv.setText(covid_org.get(position).getSiteURL());
        holder.food_org_list_parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(covid_context, covid_org.get(position).getName() + " selected", Toast.LENGTH_SHORT).show();

                gotoUrl(covid_org.get(position).getSiteURL());
            }
        });

        Glide.with(covid_context)
                .asBitmap()
                .load(covid_org.get(position).getImgURL())
                .into(holder.food_org_img);
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        covid_context.startActivity(i);
    }

    @Override
    public int getItemCount() {
        return covid_org.size();
    }

    public void setCovid_org(ArrayList<Covid_org> covid_org) {
        this.covid_org = covid_org;
        notifyDataSetChanged();
    }

    public class CovidViewHolder extends RecyclerView.ViewHolder{

        private TextView food_org_name_tv, food_org_site_tv;
        private ImageView food_org_img;
        private CardView food_org_list_parent;

        public CovidViewHolder(@NonNull View itemView) {
            super(itemView);

            food_org_name_tv = itemView.findViewById(R.id.food_org_name_tv);
            food_org_site_tv = itemView.findViewById(R.id.food_org_site_tv);
            food_org_img = itemView.findViewById(R.id.food_org_img);
            food_org_list_parent = itemView.findViewById(R.id.food_org_list_parent);
        }
    }
}
