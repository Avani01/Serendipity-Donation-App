package com.example.serendipitydonationapp.money.cancer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.serendipitydonationapp.R;
import com.example.serendipitydonationapp.money.cancer.Cancer_org;
import com.example.serendipitydonationapp.money.cancer.Cancer_rvAdapter;

import java.util.ArrayList;

public class CancerActivity extends AppCompatActivity {

    private RecyclerView cancer_rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancer);

        cancer_rv = findViewById(R.id.cancer_rv);

        ArrayList<Cancer_org> cancer_org = new ArrayList<>();
        cancer_org.add(new Cancer_org("Brest Friends",
                "https://www.aljalilafoundation.ae/wp-content/uploads/2015/04/breast-cancer-research-in-the-UAE.jpg",
                "https://www.brestfriends.org/"));

        cancer_org.add(new Cancer_org("Friends of Cancer Patients",
                "https://focp.ae/wp-content/uploads/2017/03/focp-vertical-logo.png",
                "https://focp.ae/"));

        cancer_org.add(new Cancer_org("Pink Caravan",
                "https://www.pinkcaravan.ae/wp-content/uploads/2019/09/logo.png",
                "https://www.pinkcaravan.ae/about-us/#"));

        cancer_org.add(new Cancer_org("Pure Heart Programe",
                "http://www.pureheart-foundation.org/public/assets/images/logopng.png",
                "https://www.facebook.com/PureHeartToday/"));

        cancer_org.add(new Cancer_org("Bosom Buddies",
                "http://www.bosombuddiesad.org/wp-content/uploads/2014/10/BBLogoWebsite.png",
                "https://www.bosombuddiesad.org/"));

        cancer_org.add(new Cancer_org("Moazzara",
                "http://www.moazzara.ae/upload/02-2018/system/Untitled-1.png",
                "http://www.moazzara.ae/"));

        Cancer_rvAdapter adapter = new Cancer_rvAdapter(this);
        adapter.setCancer_org(cancer_org);

        cancer_rv.setAdapter(adapter);
        cancer_rv.setLayoutManager(new GridLayoutManager(this, 2));
    }
}