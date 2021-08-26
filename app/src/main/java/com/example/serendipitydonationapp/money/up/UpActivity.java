package com.example.serendipitydonationapp.money.up;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.serendipitydonationapp.R;

import java.util.ArrayList;

public class UpActivity extends AppCompatActivity {

    private RecyclerView up_rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_up);

        up_rv = findViewById(R.id.up_rv);

        ArrayList<Up_org> up_org = new ArrayList<>();
        up_org.add(new Up_org("Emirates Red Crescent",
                "https://arab.org/wp-content/uploads/2021/03/erc-300x300.jpg",
                "https://www.emiratesrc.ae/en/"));

        up_org.add(new Up_org("The Ma'an",
                "https://www.libf.ac.uk/images/default-source/default-album/maan-logo.jpg",
                "https://maan.gov.ae/"));

        up_org.add(new Up_org("Dar Al Ber Society",
                "https://arab.org/wp-content/uploads/2016/03/dar-al-ber-society-300x300.jpg",
                "https://www.daralber.ae/en/home"));

        up_org.add(new Up_org("Beit Al Khair Society",
                "http://beitalkhair.org/m/images/logo-new.png",
                "http://beitalkhair.org/en/"));

        up_org.add(new Up_org("International Charity Organization",
                "https://www.ico.org.ae/Themes/HAI/Content/images/logo-en.png",
                "https://www.ico.org.ae/en/"));

        up_org.add(new Up_org("Dubai Cares",
                "https://upload.wikimedia.org/wikipedia/commons/6/6f/Dubai_Cares%27_logo.jpg",
                "http://www.dubaicares.ae/"));

        Up_rvAdapter adapter = new Up_rvAdapter(this);
        adapter.setUp_org(up_org);

        up_rv.setAdapter(adapter);
        up_rv.setLayoutManager(new GridLayoutManager(this, 2));
    }
}