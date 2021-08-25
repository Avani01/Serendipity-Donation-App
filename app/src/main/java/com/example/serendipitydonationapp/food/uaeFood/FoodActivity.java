package com.example.serendipitydonationapp.food.uaeFood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.serendipitydonationapp.R;
import com.example.serendipitydonationapp.food.uaeFood.Food_org;
import com.example.serendipitydonationapp.food.uaeFood.Food_rvAdapter;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {

    private RecyclerView food_rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        food_rv = findViewById(R.id.food_rv);

        ArrayList<Food_org> food_org = new ArrayList<>();

        food_org.add(new Food_org("UAE Food Bank",
                "https://mediaoffice.ae/-/media/2021/april/17-04/07/uae-food-bank-logo-1-page-001-1-scaled.jpg",
                "https://dm.gov.ae/foodbank/"));

        food_org.add(new Food_org("100 Million Meals",
                "https://assets.wam.ae/uploads/2021/04/2642373614845212300.png",
                "https://www.100millionmeals.ae/"));

        food_org.add(new Food_org("A Meal for a Brighter Tomorrow",
                "https://mmo.aiircdn.com/265/607d446f7099c.png",
                "https://sharethemeal.org/donate?campaign=dubaiholding1."));

        food_org.add(new Food_org("Dar Al Ber Society",
                "https://arab.org/wp-content/uploads/2016/03/dar-al-ber-society-300x300.jpg",
                "https://www.daralber.ae/en/home"));

        food_org.add(new Food_org("Sharjah Charity International",
                "https://assets.wam.ae/uploads/2018/03/22392476205384.jpg",
                "https://www.shjc.sharjah.ae/RamadanProject"));

        food_org.add(new Food_org("Eat a Plate 2 Fill a Plate",
                "https://www.middleeastevents.com/blog/wp-content/uploads/2021/04/Careem-Ramadan-199x300.jpeg",
                "https://www.careem.com/"));

        Food_rvAdapter adapter = new Food_rvAdapter(this);
        adapter.setFood_org(food_org);

        food_rv.setAdapter(adapter);
        food_rv.setLayoutManager(new GridLayoutManager(this, 2));
    }
}