package com.example.serendipitydonationapp.money;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
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
import com.example.serendipitydonationapp.money.cancer.indiaCancer.IndiaCancerActivity;
import com.example.serendipitydonationapp.money.cancer.usaCancer.UsaCancerActivity;
import com.example.serendipitydonationapp.money.child.indiaChild.IndiaChildActivity;
import com.example.serendipitydonationapp.money.child.usaChild.UsaChildActivity;
import com.example.serendipitydonationapp.money.covid.indiaCovid.IndiaCovidActivity;
import com.example.serendipitydonationapp.money.covid.usaCovid.UsaCovidActivity;
import com.example.serendipitydonationapp.money.pod.indiaPod.IndiaPodActivity;
import com.example.serendipitydonationapp.money.pod.usaPod.UsaPodActivity;
import com.example.serendipitydonationapp.money.up.indiaUp.IndiaUpActivity;
import com.example.serendipitydonationapp.money.up.usaUp.UsaUpActivity;
import com.example.serendipitydonationapp.money.women.indiaWomen.IndiaWomenActivity;
import com.example.serendipitydonationapp.money.women.usaWomen.UsaWomenActivity;

import java.util.ArrayList;

public class IndiaMoney_rvAdapter extends RecyclerView.Adapter<IndiaMoney_rvAdapter.MoneyViewHolder> {

    ArrayList<Money_org> money_org = new ArrayList<>();
    private Context money_context;
    Intent i;

    public IndiaMoney_rvAdapter (Context money_context){
        this.money_context = money_context;
    }

    public IndiaMoney_rvAdapter() {

    }

    @NonNull
    @Override
    public IndiaMoney_rvAdapter.MoneyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.money_org_list, parent, false);
        IndiaMoney_rvAdapter.MoneyViewHolder holder = new IndiaMoney_rvAdapter.MoneyViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull IndiaMoney_rvAdapter.MoneyViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.money_org_cause_tv.setText(money_org.get(position).getName());
        holder.money_org_list_parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(money_context, money_org.get(position).getName() + " selected", Toast.LENGTH_SHORT).show();

                switch(position){
                    case 0: i = new Intent(money_context, IndiaCancerActivity.class);
                        money_context.startActivity(i);
                        break;
                    case 1: i = new Intent(money_context, IndiaChildActivity.class);
                        money_context.startActivity(i);
                        break;
                    case 2: i = new Intent(money_context, IndiaCovidActivity.class);
                        money_context.startActivity(i);
                        break;
                    case 3: i = new Intent(money_context, IndiaPodActivity.class);
                        money_context.startActivity(i);
                        break;
                    case 4: i = new Intent(money_context, IndiaUpActivity.class);
                        money_context.startActivity(i);
                        break;
                    case 5: i = new Intent(money_context, IndiaWomenActivity.class);
                        money_context.startActivity(i);
                        break;
                    default:
                        break;
                }

            }
        });

        Glide.with(money_context)
                .asBitmap()
                .load(money_org.get(position).getImgURL())
                .into(holder.money_org_cause_img);
    }

    @Override
    public int getItemCount() {
        return money_org.size();
    }

    public void setMoney_org(ArrayList<Money_org> money_org) {
        this.money_org = money_org;
        notifyDataSetChanged();
    }

    public class MoneyViewHolder extends RecyclerView.ViewHolder{

        private TextView money_org_cause_tv;
        private ImageView money_org_cause_img;
        private CardView money_org_list_parent;

        public MoneyViewHolder(@NonNull View itemView) {
            super(itemView);

            money_org_cause_tv = itemView.findViewById(R.id.money_org_cause_tv);
            money_org_cause_img = itemView.findViewById(R.id.money_org_cause_img);
            money_org_list_parent = itemView.findViewById(R.id.money_org_list_parent);
        }
    }
}
