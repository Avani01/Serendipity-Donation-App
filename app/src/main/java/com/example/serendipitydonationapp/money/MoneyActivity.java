package com.example.serendipitydonationapp.money;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.serendipitydonationapp.R;

import java.util.ArrayList;

public class MoneyActivity extends AppCompatActivity {

    private RecyclerView money_rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money);

        money_rv = findViewById(R.id.money_rv);

        ArrayList<Money_org> money_org = new ArrayList<>();
        money_org.add(new Money_org("Cancer",
                "https://image.shutterstock.com/image-vector/breast-cancer-ribbon-260nw-1025267917.jpg"));

        money_org.add(new Money_org("Children",
                "https://www.graphicsprings.com/filestorage/stencils/284d2c63f099fa9743f379155642f523.png"));

        money_org.add(new Money_org("Covid-19 Relief",
                "https://choosingwiselycanada.org/wp-content/uploads/2020/11/COVID-19_2.png"));

        money_org.add(new Money_org("People of Determination",
                "https://i2.wp.com/iins.org/iinsnew/wp-content/uploads/2021/02/3.jpg"));

        money_org.add(new Money_org("Underprivileged",
                "https://thumbs.dreamstime.com/b/helping-hands-care-hands-logo-icon-vector-designs-white-background-helping-hands-care-hands-logo-icon-vector-designs-white-154382280.jpg"));

        money_org.add(new Money_org("Women",
                "https://image.shutterstock.com/image-vector/beautiful-silhouette-hair-girl-salon-260nw-1170042505.jpg"));

        Money_rvAdapter adapter = new Money_rvAdapter(this);
        adapter.setMoney_org(money_org);

        money_rv.setAdapter(adapter);
        money_rv.setLayoutManager(new GridLayoutManager(this, 2));


    }
}