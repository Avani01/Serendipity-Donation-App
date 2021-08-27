package com.example.serendipitydonationapp.money.up.usaUp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.serendipitydonationapp.R;
import com.example.serendipitydonationapp.money.up.uaeUp.Up_org;
import com.example.serendipitydonationapp.money.up.uaeUp.Up_rvAdapter;

import java.util.ArrayList;

public class UsaUpActivity extends AppCompatActivity {

    private RecyclerView up_rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usa_up);

        up_rv = findViewById(R.id.up_rv);

        ArrayList<Up_org> up_org = new ArrayList<>();
        up_org.add(new Up_org("United Way",
                "https://img.favpng.com/15/23/8/united-way-worldwide-donation-symbol-investment-clip-art-png-favpng-y789M5r0BnJ6DERMpZV4kGP9y.jpg",
                "https://www.unitedway.org/"));

        up_org.add(new Up_org("Feeding America",
                "https://pbs.twimg.com/profile_images/601748346143805442/lSuoN0Hk_400x400.png",
                "https://www.feedingamerica.org/"));

        up_org.add(new Up_org("Direct Relief",
                "https://upload.wikimedia.org/wikipedia/commons/d/d3/Direct-Relief-Square.png",
                "https://www.directrelief.org/"));

        up_org.add(new Up_org("Compassion International",
                "https://res.cloudinary.com/crunchbase-production/image/upload/c_lpad,h_256,w_256,f_auto,q_auto:eco,dpr_1/v1430901051/ba7v8wsmin0c72sdqgdq.png",
                "https://www.compassion.com/"));

        up_org.add(new Up_org("Americares Foundation",
                "https://www.americares.org/wp-content/uploads/2019/07/cropped-americares-logomark.png",
                "https://www.americares.org/"));

        up_org.add(new Up_org("American National Red Cross",
                "https://www.redcross.org/content/dam/redcross/imported-images/redcross-logo.png.img.png",
                "https://www.redcross.org/"));

        UsaUp_rvAdapter adapter = new UsaUp_rvAdapter(this);
        adapter.setUp_org(up_org);

        up_rv.setAdapter(adapter);
        up_rv.setLayoutManager(new GridLayoutManager(this, 2));
    }
}