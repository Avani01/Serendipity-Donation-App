package com.example.serendipitydonationapp.food.usaFood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.serendipitydonationapp.R;
import com.example.serendipitydonationapp.food.uaeFood.Food_org;
import com.example.serendipitydonationapp.food.uaeFood.Food_rvAdapter;

import java.util.ArrayList;

public class UsaFoodActivity extends AppCompatActivity {

    private RecyclerView food_rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usa_food);

        food_rv = findViewById(R.id.food_rv);

        ArrayList<Food_org> food_org = new ArrayList<>();

        food_org.add(new Food_org("Meals on Wheels America",
                "https://www.westlakemealsonwheels.org/wp-content/uploads/2017/02/meals-on-wheels-logo.png",
                "https://give.mealsonwheelsamerica.org/page/30078/donate/1"));

        food_org.add(new Food_org("Feeding America",
                "https://pbs.twimg.com/profile_images/601748346143805442/lSuoN0Hk_400x400.png",
                "https://www.feedingamerica.org/"));

        food_org.add(new Food_org("Food Bank for New York City",
                "https://1giqgs400j4830k22r3m4wqg-wpengine.netdna-ssl.com/wp-content/uploads/fbnyc_secondary_retina-01.png",
                "https://www.foodbanknyc.org/"));

        food_org.add(new Food_org("The Greater Chicago Food Depository",
                "https://www.chicagosfoodbank.org/wp-content/themes/orbit-media/images/footer-logo.png",
                "https://www.chicagosfoodbank.org/"));

        food_org.add(new Food_org("Feed the Children",
                "https://secure.feedthechildren.org/assets/general_wrapper/images/FTC-Logo-Color.png",
                "https://www.feedthechildren.org/"));

        food_org.add(new Food_org("Edible Schoolyard",
                "https://edibleschoolyard.org/sites/all/themes/edible/logo.png",
                "https://edibleschoolyard.org/"));

        UsaFood_rvAdapter adapter = new UsaFood_rvAdapter(this);
        adapter.setFood_org(food_org);

        food_rv.setAdapter(adapter);
        food_rv.setLayoutManager(new GridLayoutManager(this, 2));
    }
}