package com.example.serendipitydonationapp.food.indiaFood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.serendipitydonationapp.R;
import com.example.serendipitydonationapp.food.uaeFood.Food_org;
import com.example.serendipitydonationapp.food.usaFood.UsaFood_rvAdapter;

import java.util.ArrayList;

public class IndiaFoodActivity extends AppCompatActivity {

    private RecyclerView food_rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_india_food);

        food_rv = findViewById(R.id.food_rv);

        ArrayList<Food_org> food_org = new ArrayList<>();

        food_org.add(new Food_org("Akshaya Patra",
                "https://www.akshayapatrausa.org//wp-content/uploads/2019/04/ffe-logo7.png",
                "https://www.akshayapatra.org/"));

        food_org.add(new Food_org("Uday Foundation",
                "https://i0.wp.com/www.udayfoundation.org/wp-content/uploads/2020/03/JPG-File.jpg?ssl=1",
                "https://www.udayfoundation.org/donatefood/"));

        food_org.add(new Food_org("Delhi Foodbanking Network",
                "https://pbs.twimg.com/profile_images/1186524451971551232/zMdTzqCp.jpg",
                "https://www.delhifoodbanking.org/"));

        food_org.add(new Food_org("Feeding India",
                "https://static.wixstatic.com/media/cf68b4_a0626332625d4a2fac97f262af26293a~mv2.png/v1/fill/w_2550,h_960,al_c/cf68b4_a0626332625d4a2fac97f262af26293a~mv2.png",
                "https://www.feedingindia.org/donate/feedingindia#donate-section"));

        food_org.add(new Food_org("Rise Against Hunger India",
                "https://www.riseagainsthungerindia.org/wp-content/uploads/2020/03/RAHlogo_india-01-scaled-e1593010950565.jpg",
                "https://www.riseagainsthungerindia.org/"));

        food_org.add(new Food_org("India Foodbanking Network",
                "https://www.indiafoodbanking.org/sites/default/files/india-food-banking-network-logo.png",
                "https://www.indiafoodbanking.org/get-involved/contributors/individuals"));

        IndiaFood_rvAdapter adapter = new IndiaFood_rvAdapter(this);
        adapter.setFood_org(food_org);

        food_rv.setAdapter(adapter);
        food_rv.setLayoutManager(new GridLayoutManager(this, 2));
    }
}