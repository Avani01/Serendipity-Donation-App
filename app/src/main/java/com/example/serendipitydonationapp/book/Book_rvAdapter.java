package com.example.serendipitydonationapp.book;

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

public class Book_rvAdapter extends RecyclerView.Adapter<Book_rvAdapter.BookViewHolder> {
    ArrayList<Book_org> book_org = new ArrayList<>();
    private Context book_context;

    public Book_rvAdapter (Context book_context){
        this.book_context = book_context;
    }

    public Book_rvAdapter() {

    }

    @NonNull
    @Override
    public Book_rvAdapter.BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_org_list, parent, false);
        Book_rvAdapter.BookViewHolder holder = new Book_rvAdapter.BookViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Book_rvAdapter.BookViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.food_org_name_tv.setText(book_org.get(position).getName());
        holder.food_org_site_tv.setText(book_org.get(position).getSiteURL());
        holder.food_org_list_parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(book_context, book_org.get(position).getName() + " selected", Toast.LENGTH_SHORT).show();

                gotoUrl(book_org.get(position).getSiteURL());
            }
        });

        Glide.with(book_context)
                .asBitmap()
                .load(book_org.get(position).getImgURL())
                .into(holder.food_org_img);
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        book_context.startActivity(i);
    }

    @Override
    public int getItemCount() {
        return book_org.size();
    }

    public void setBook_org(ArrayList<Book_org> book_org) {
        this.book_org = book_org;
        notifyDataSetChanged();
    }

    public class BookViewHolder extends RecyclerView.ViewHolder{

        private TextView food_org_name_tv, food_org_site_tv;
        private ImageView food_org_img;
        private CardView food_org_list_parent;

        public BookViewHolder(@NonNull View itemView) {
            super(itemView);

            food_org_name_tv = itemView.findViewById(R.id.food_org_name_tv);
            food_org_site_tv = itemView.findViewById(R.id.food_org_site_tv);
            food_org_img = itemView.findViewById(R.id.food_org_img);
            food_org_list_parent = itemView.findViewById(R.id.food_org_list_parent);
        }
    }
}
