package com.example.serendipitydonationapp.cloth;

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

public class Cloth_rvAdapter extends RecyclerView.Adapter<Cloth_rvAdapter.ClothViewHolder> {
    ArrayList<Cloth_org> cloth_org = new ArrayList<>();
    private Context cloth_context;

    public Cloth_rvAdapter (Context cloth_context){
        this.cloth_context = cloth_context;
    }

    public Cloth_rvAdapter() {

    }

    @NonNull
    @Override
    public Cloth_rvAdapter.ClothViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_org_list, parent, false);
        Cloth_rvAdapter.ClothViewHolder holder = new Cloth_rvAdapter.ClothViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Cloth_rvAdapter.ClothViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.food_org_name_tv.setText(cloth_org.get(position).getName());
        holder.food_org_site_tv.setText(cloth_org.get(position).getSiteURL());
        holder.food_org_list_parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(cloth_context, cloth_org.get(position).getName() + " selected", Toast.LENGTH_SHORT).show();

                gotoUrl(cloth_org.get(position).getSiteURL());
            }
        });

        Glide.with(cloth_context)
                .asBitmap()
                .load(cloth_org.get(position).getImgURL())
                .into(holder.food_org_img);
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        cloth_context.startActivity(i);
    }

    @Override
    public int getItemCount() {
        return cloth_org.size();
    }

    public void setCloth_org(ArrayList<Cloth_org> cloth_org) {
        this.cloth_org = cloth_org;
        notifyDataSetChanged();
    }

    public class ClothViewHolder extends RecyclerView.ViewHolder{

        private TextView food_org_name_tv, food_org_site_tv;
        private ImageView food_org_img;
        private CardView food_org_list_parent;

        public ClothViewHolder(@NonNull View itemView) {
            super(itemView);

            food_org_name_tv = itemView.findViewById(R.id.food_org_name_tv);
            food_org_site_tv = itemView.findViewById(R.id.food_org_site_tv);
            food_org_img = itemView.findViewById(R.id.food_org_img);
            food_org_list_parent = itemView.findViewById(R.id.food_org_list_parent);
        }
    }
}
