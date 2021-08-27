package com.example.serendipitydonationapp.money.women.indiaWomen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.serendipitydonationapp.R;
import com.example.serendipitydonationapp.money.women.uaeWomen.Women_org;
import com.example.serendipitydonationapp.money.women.usaWomen.UsaWomen_rvAdapter;

import java.util.ArrayList;

public class IndiaWomenActivity extends AppCompatActivity {

    private RecyclerView women_rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_india_women);

        women_rv = findViewById(R.id.women_rv);

        ArrayList<Women_org> women_org = new ArrayList<>();
        women_org.add(new Women_org("Women’s India Trust",
                "https://wit.org.in/wp-content/uploads/2018/03/logo.png",
                "https://www.wit.org.in/donate-online-indian-foreign/"));

        women_org.add(new Women_org("Indian Women and Child Welfare Trust",
                "https://www.iwcwtministry.org/wp-content/uploads/2017/06/iwcwtlogo.jpg",
                "https://www.iwcwtministry.org/make-a-donation/ "));

        women_org.add(new Women_org("Apne Aap Women’s Collective ",
                "https://pbs.twimg.com/profile_images/532071812666908673/wy_TQBy3.jpeg",
                "https://www.aawc.in/#"));

        women_org.add(new Women_org("Myna Mahila",
                "https://upload.wikimedia.org/wikipedia/en/b/bf/Mynah_Mahila_Foundation_logo_2018.png",
                "https://mynamahila.com/get-involved/donate/"));

        women_org.add(new Women_org("Oxfam India",
                "https://pbs.twimg.com/profile_images/1152100823259729920/aQ-zx0kT_400x400.png",
                "https://www.oxfamindia.org/donate"));

        women_org.add(new Women_org("Invisible Girl Project",
                "https://invisiblegirlproject.org/wp-content/uploads/2021/02/HORIZONTAL-LOGO-2021-BLACK.png",
                "https://invisiblegirlproject.givecloud.co/"));


        IndiaWomen_rvAdapter adapter = new IndiaWomen_rvAdapter(this);
        adapter.setWomen_org(women_org);

        women_rv.setAdapter(adapter);
        women_rv.setLayoutManager(new GridLayoutManager(this, 2));
    }
}