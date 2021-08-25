package com.example.serendipitydonationapp.money.cancer.usaCancer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.serendipitydonationapp.R;
import com.example.serendipitydonationapp.money.cancer.uaeCancer.Cancer_org;
import com.example.serendipitydonationapp.money.cancer.uaeCancer.Cancer_rvAdapter;

import java.util.ArrayList;

public class UsaCancerActivity extends AppCompatActivity {

    private RecyclerView cancer_rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usa_cancer);

        cancer_rv = findViewById(R.id.cancer_rv);

        ArrayList<Cancer_org> cancer_org = new ArrayList<>();
        cancer_org.add(new Cancer_org("Alex's Lemonade Stand",
                "https://www.alexslemonade.org/sites/all/themes/alsf_adaptive/images/alsf-logo.png",
                "https://www.alexslemonade.org/user/login?destination=node/1608540"));

        cancer_org.add(new Cancer_org("American Childhood Cancer Organization",
                "https://montgomerycountymd.galaxydigital.com/content/montgomerycountymd.galaxydigital.com/agency/75884.jpg",
                "https://www.acco.org/"));

        cancer_org.add(new Cancer_org("Prevent Cancer Foundation",
                "https://i2p4a4i8.rocketcdn.me/wp-content/themes/prevent-cancer/library/images/pcf35logotall.jpg",
                "https://www.preventcancer.org/"));

        cancer_org.add(new Cancer_org("Hats Off for Cancer",
                "http://www.hatsoff4cancer.com/images/hatsoff4cancerLOGO.jpg",
                "http://www.hatsoff4cancer.com/"));

        cancer_org.add(new Cancer_org("Breast Cancer Alliance",
                "https://breastcanceralliance.org/images/BCA_logofinal_notag.png",
                "https://breastcanceralliance.org/"));

        cancer_org.add(new Cancer_org("Take a Swing at Cancer",
                "http://www.takeaswingatcancer.com/wp-content/uploads/2020/04/Take-a-Drive-at-Cancer-300x160.png",
                "http://www.takeaswingatcancer.com/"));

        UsaCancer_rvAdapter adapter = new UsaCancer_rvAdapter(this);
        adapter.setCancer_org(cancer_org);

        cancer_rv.setAdapter(adapter);
        cancer_rv.setLayoutManager(new GridLayoutManager(this, 2));
    }
}