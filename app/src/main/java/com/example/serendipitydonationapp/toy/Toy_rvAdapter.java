package com.example.serendipitydonationapp.toy;

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

public class Toy_rvAdapter extends RecyclerView.Adapter<Toy_rvAdapter.ToyViewHolder> {
    ArrayList<Toy_org> toy_org = new ArrayList<>();
    private Context toy_context;

    public Toy_rvAdapter(Context toy_context){
        this.toy_context = toy_context;
    }

    public Toy_rvAdapter() {

    }

    @NonNull
    @Override
    public Toy_rvAdapter.ToyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_org_list, parent, false);
        Toy_rvAdapter.ToyViewHolder holder = new Toy_rvAdapter.ToyViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Toy_rvAdapter.ToyViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.food_org_name_tv.setText(toy_org.get(position).getName());
        holder.food_org_site_tv.setText(toy_org.get(position).getSiteURL());
        holder.food_org_list_parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(toy_context, toy_org.get(position).getName() + " selected", Toast.LENGTH_SHORT).show();

                gotoUrl(toy_org.get(position).getSiteURL());
            }
        });

        Glide.with(toy_context)
                .asBitmap()
                .load(toy_org.get(position).getImgURL())
                .into(holder.food_org_img);
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        toy_context.startActivity(i);
    }

    @Override
    public int getItemCount() {
        return toy_org.size();
    }

    public void setToy_org(ArrayList<Toy_org> toy_org) {
        this.toy_org = toy_org;
        notifyDataSetChanged();
    }

    public class ToyViewHolder extends RecyclerView.ViewHolder{

        private TextView food_org_name_tv, food_org_site_tv;
        private ImageView food_org_img;
        private CardView food_org_list_parent;

        public ToyViewHolder(@NonNull View itemView) {
            super(itemView);

            food_org_name_tv = itemView.findViewById(R.id.food_org_name_tv);
            food_org_site_tv = itemView.findViewById(R.id.food_org_site_tv);
            food_org_img = itemView.findViewById(R.id.food_org_img);
            food_org_list_parent = itemView.findViewById(R.id.food_org_list_parent);
        }
    }
}
