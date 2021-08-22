package com.example.serendipitydonationapp.money.child;

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
import com.example.serendipitydonationapp.book.Book_org;
import com.example.serendipitydonationapp.book.Book_rvAdapter;

import java.util.ArrayList;

public class Child_rvAdapter extends RecyclerView.Adapter<Child_rvAdapter.ChildViewHolder> {
    ArrayList<Child_org> child_org = new ArrayList<>();
    private Context child_context;

    public Child_rvAdapter (Context child_context){
        this.child_context = child_context;
    }

    public Child_rvAdapter() {

    }

    @NonNull
    @Override
    public Child_rvAdapter.ChildViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_org_list, parent, false);
        Child_rvAdapter.ChildViewHolder holder = new Child_rvAdapter.ChildViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Child_rvAdapter.ChildViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.food_org_name_tv.setText(child_org.get(position).getName());
        holder.food_org_site_tv.setText(child_org.get(position).getSiteURL());
        holder.food_org_list_parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(child_context, child_org.get(position).getName() + " selected", Toast.LENGTH_SHORT).show();

                gotoUrl(child_org.get(position).getSiteURL());
            }
        });

        Glide.with(child_context)
                .asBitmap()
                .load(child_org.get(position).getImgURL())
                .into(holder.food_org_img);
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        child_context.startActivity(i);
    }

    @Override
    public int getItemCount() {
        return child_org.size();
    }

    public void setChild_org(ArrayList<Child_org> child_org) {
        this.child_org = child_org;
        notifyDataSetChanged();
    }

    public class ChildViewHolder extends RecyclerView.ViewHolder{

        private TextView food_org_name_tv, food_org_site_tv;
        private ImageView food_org_img;
        private CardView food_org_list_parent;

        public ChildViewHolder(@NonNull View itemView) {
            super(itemView);

            food_org_name_tv = itemView.findViewById(R.id.food_org_name_tv);
            food_org_site_tv = itemView.findViewById(R.id.food_org_site_tv);
            food_org_img = itemView.findViewById(R.id.food_org_img);
            food_org_list_parent = itemView.findViewById(R.id.food_org_list_parent);
        }
    }
}
