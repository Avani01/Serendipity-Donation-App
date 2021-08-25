package com.example.serendipitydonationapp.money.women.usaWomen;

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
import com.example.serendipitydonationapp.money.women.uaeWomen.Women_org;
import com.example.serendipitydonationapp.money.women.uaeWomen.Women_rvAdapter;

import java.util.ArrayList;

public class UsaWomen_rvAdapter extends RecyclerView.Adapter<UsaWomen_rvAdapter.WomenViewHolder> {

    ArrayList<Women_org> women_org = new ArrayList<>();
    private Context women_context;

    public UsaWomen_rvAdapter (Context women_context){
        this.women_context = women_context;
    }

    public UsaWomen_rvAdapter() {

    }

    @NonNull
    @Override
    public UsaWomen_rvAdapter.WomenViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_org_list, parent, false);
        UsaWomen_rvAdapter.WomenViewHolder holder = new UsaWomen_rvAdapter.WomenViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull UsaWomen_rvAdapter.WomenViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.food_org_name_tv.setText(women_org.get(position).getName());
        holder.food_org_site_tv.setText(women_org.get(position).getSiteURL());
        holder.food_org_list_parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(women_context, women_org.get(position).getName() + " selected", Toast.LENGTH_SHORT).show();

                gotoUrl(women_org.get(position).getSiteURL());
            }
        });

        Glide.with(women_context)
                .asBitmap()
                .load(women_org.get(position).getImgURL())
                .into(holder.food_org_img);
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        women_context.startActivity(i);
    }

    @Override
    public int getItemCount() {
        return women_org.size();
    }

    public void setWomen_org(ArrayList<Women_org> women_org) {
        this.women_org = women_org;
        notifyDataSetChanged();
    }

    public class WomenViewHolder extends RecyclerView.ViewHolder{

        private TextView food_org_name_tv, food_org_site_tv;
        private ImageView food_org_img;
        private CardView food_org_list_parent;

        public WomenViewHolder(@NonNull View itemView) {
            super(itemView);

            food_org_name_tv = itemView.findViewById(R.id.food_org_name_tv);
            food_org_site_tv = itemView.findViewById(R.id.food_org_site_tv);
            food_org_img = itemView.findViewById(R.id.food_org_img);
            food_org_list_parent = itemView.findViewById(R.id.food_org_list_parent);
        }
    }
}
