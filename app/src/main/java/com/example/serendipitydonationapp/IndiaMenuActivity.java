package com.example.serendipitydonationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.serendipitydonationapp.book.indiaBook.IndiaBookActivity;
import com.example.serendipitydonationapp.book.uaeBook.BookActivity;
import com.example.serendipitydonationapp.cloth.indiaCloth.IndiaClothActivity;
import com.example.serendipitydonationapp.cloth.uaeCloth.ClothActivity;
import com.example.serendipitydonationapp.food.indiaFood.IndiaFoodActivity;
import com.example.serendipitydonationapp.money.IndiaMoneyActivity;
import com.example.serendipitydonationapp.toy.indiaToy.IndiaToyActivity;

public class IndiaMenuActivity extends AppCompatActivity {

    private TextView donationOptionsText, foodText, toyText, clothText, bookText, moneyText;
    private ImageButton food, cloth, toy, book, money;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_india_menu);

        // for find view by id of all elements
        initViews();

        // setting on click listener for all buttons
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(IndiaMenuActivity.this, "Food option selected!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(IndiaMenuActivity.this, IndiaFoodActivity.class);
                startActivity(intent);
            }
        });

        toy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(IndiaMenuActivity.this, "Toys option selected!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(IndiaMenuActivity.this, IndiaToyActivity.class);
                startActivity(intent);
            }
        });

        cloth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(IndiaMenuActivity.this, "Clothes option selected!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(IndiaMenuActivity.this, IndiaClothActivity.class);
                startActivity(intent);
            }
        });

        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(IndiaMenuActivity.this, "Books option selected!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(IndiaMenuActivity.this, IndiaBookActivity.class);
                startActivity(intent);
            }
        });

        money.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(IndiaMenuActivity.this, "Money option selected!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(IndiaMenuActivity.this, IndiaMoneyActivity.class);
                startActivity(intent);
            }
        });
    }

    public void initViews(){
        // find view by id for all text views
        donationOptionsText= findViewById(R.id.donationOptionsText);
        foodText= findViewById(R.id.foodText);
        clothText= findViewById(R.id.clothText);
        toyText= findViewById(R.id.toyText);
        bookText= findViewById(R.id.bookText);
        moneyText= findViewById(R.id.moneyText);

        // find view by id for image buttons
        food = (ImageButton) findViewById(R.id.food);
        toy = (ImageButton) findViewById(R.id.toy);
        cloth = (ImageButton) findViewById(R.id.cloth);
        book = (ImageButton) findViewById(R.id.book);
        money = (ImageButton) findViewById(R.id.money);
    }
}