package com.example.serendipitydonationapp.money.pod.usaPod;

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
import com.example.serendipitydonationapp.money.pod.uaePod.Pod_org;
import com.example.serendipitydonationapp.money.pod.uaePod.Pod_rvAdapter;

import java.util.ArrayList;

public class UsaPod_rvAdapter extends RecyclerView.Adapter<UsaPod_rvAdapter.PodViewHolder> {

    ArrayList<Pod_org> pod_org = new ArrayList<>();
    private Context pod_context;

    public UsaPod_rvAdapter (Context pod_context){
        this.pod_context = pod_context;
    }

    public UsaPod_rvAdapter() {

    }

    @NonNull
    @Override
    public UsaPod_rvAdapter.PodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_org_list, parent, false);
        UsaPod_rvAdapter.PodViewHolder holder = new UsaPod_rvAdapter.PodViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull UsaPod_rvAdapter.PodViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.food_org_name_tv.setText(pod_org.get(position).getName());
        holder.food_org_site_tv.setText(pod_org.get(position).getSiteURL());
        holder.food_org_list_parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(pod_context, pod_org.get(position).getName() + " selected", Toast.LENGTH_SHORT).show();

                gotoUrl(pod_org.get(position).getSiteURL());
            }
        });

        Glide.with(pod_context)
                .asBitmap()
                .load(pod_org.get(position).getImgURL())
                .into(holder.food_org_img);
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        pod_context.startActivity(i);
    }

    @Override
    public int getItemCount() {
        return pod_org.size();
    }

    public void setPod_org(ArrayList<Pod_org> pod_org) {
        this.pod_org = pod_org;
        notifyDataSetChanged();
    }

    public class PodViewHolder extends RecyclerView.ViewHolder{

        private TextView food_org_name_tv, food_org_site_tv;
        private ImageView food_org_img;
        private CardView food_org_list_parent;

        public PodViewHolder(@NonNull View itemView) {
            super(itemView);

            food_org_name_tv = itemView.findViewById(R.id.food_org_name_tv);
            food_org_site_tv = itemView.findViewById(R.id.food_org_site_tv);
            food_org_img = itemView.findViewById(R.id.food_org_img);
            food_org_list_parent = itemView.findViewById(R.id.food_org_list_parent);
        }
    }
}
