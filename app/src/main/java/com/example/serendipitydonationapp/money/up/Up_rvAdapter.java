package com.example.serendipitydonationapp.money.up;

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

public class Up_rvAdapter extends RecyclerView.Adapter<Up_rvAdapter.UpViewHolder> {
    ArrayList<Up_org> up_org = new ArrayList<>();
    private Context up_context;

    public Up_rvAdapter (Context up_context){
        this.up_context = up_context;
    }

    public Up_rvAdapter() {

    }

    @NonNull
    @Override
    public Up_rvAdapter.UpViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_org_list, parent, false);
        Up_rvAdapter.UpViewHolder holder = new Up_rvAdapter.UpViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Up_rvAdapter.UpViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.food_org_name_tv.setText(up_org.get(position).getName());
        holder.food_org_site_tv.setText(up_org.get(position).getSiteURL());
        holder.food_org_list_parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(up_context, up_org.get(position).getName() + " selected", Toast.LENGTH_SHORT).show();

                gotoUrl(up_org.get(position).getSiteURL());
            }
        });

        Glide.with(up_context)
                .asBitmap()
                .load(up_org.get(position).getImgURL())
                .into(holder.food_org_img);
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        up_context.startActivity(i);
    }

    @Override
    public int getItemCount() {
        return up_org.size();
    }

    public void setUp_org(ArrayList<Up_org> up_org) {
        this.up_org = up_org;
        notifyDataSetChanged();
    }

    public class UpViewHolder extends RecyclerView.ViewHolder{

        private TextView food_org_name_tv, food_org_site_tv;
        private ImageView food_org_img;
        private CardView food_org_list_parent;

        public UpViewHolder(@NonNull View itemView) {
            super(itemView);

            food_org_name_tv = itemView.findViewById(R.id.food_org_name_tv);
            food_org_site_tv = itemView.findViewById(R.id.food_org_site_tv);
            food_org_img = itemView.findViewById(R.id.food_org_img);
            food_org_list_parent = itemView.findViewById(R.id.food_org_list_parent);
        }
    }
}
