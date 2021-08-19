package com.example.serendipitydonationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.serendipitydonationapp.book.BookActivity;
import com.example.serendipitydonationapp.cloth.ClothActivity;
import com.example.serendipitydonationapp.food.FoodActivity;
import com.example.serendipitydonationapp.money.MoneyActivity;
import com.example.serendipitydonationapp.toy.ToyActivity;

public class MainActivity extends AppCompatActivity {

    private TextView donationOptionsText, foodText, toyText, clothText, bookText, moneyText;
    private ImageButton food, cloth, toy, book, money;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // for find view by id of all elements
        initViews();

        // setting on click listener for all buttons
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Food option selected!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, FoodActivity.class);
                startActivity(intent);
            }
        });

        toy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Toys option selected!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, ToyActivity.class);
                startActivity(intent);
            }
        });

        cloth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clothes option selected!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, ClothActivity.class);
                startActivity(intent);
            }
        });

        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Books option selected!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, BookActivity.class);
                startActivity(intent);
            }
        });

        money.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Money option selected!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, MoneyActivity.class);
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