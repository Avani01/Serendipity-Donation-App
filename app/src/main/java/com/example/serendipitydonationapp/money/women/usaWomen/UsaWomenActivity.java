package com.example.serendipitydonationapp.money.women.usaWomen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.serendipitydonationapp.R;
import com.example.serendipitydonationapp.money.women.uaeWomen.Women_org;
import com.example.serendipitydonationapp.money.women.uaeWomen.Women_rvAdapter;

import java.util.ArrayList;

public class UsaWomenActivity extends AppCompatActivity {

    private RecyclerView women_rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usa_women);

        women_rv = findViewById(R.id.women_rv);

        ArrayList<Women_org> women_org = new ArrayList<>();
        women_org.add(new Women_org("American Association of University Women",
                "https://opportunitydesk.org/wp-content/uploads/2020/09/AAUW-Selected-Professions-Fellowships-2020-2021.png",
                "https://www.aauw.org/"));

        women_org.add(new Women_org("Women's Funding Network",
                "https://pbs.twimg.com/profile_images/1310658361898102784/QCmJygQI.jpg",
                "https://www.womensfundingnetwork.org/"));

        women_org.add(new Women_org("Wisconsin Women's Health Foundation",
                "https://pbs.twimg.com/profile_images/2702159552/fa5221a1ce8a302590bb6c4d2231fa2e_400x400.png",
                "https://wwhf.org/"));

        women_org.add(new Women_org("PATH",
                "https://www.ghtcoalition.org/member-logos/PATH.png",
                "https://www.path.org/"));

        women_org.add(new Women_org("Catholic Medical Mission Board",
                "https://upload.wikimedia.org/wikipedia/commons/8/8f/Logo_CMMB.jpg",
                "https://cmmb.org/"));

        women_org.add(new Women_org("Girls Educational & Mentoring Services",
                "https://alchetron.com/cdn/girls-educational-and-mentoring-services-2bdaa8a3-f443-44e2-9fa9-7da680f9e47-resize-750.jpg",
                "https://www.gems-girls.org/"));

        UsaWomen_rvAdapter adapter = new UsaWomen_rvAdapter(this);
        adapter.setWomen_org(women_org);

        women_rv.setAdapter(adapter);
        women_rv.setLayoutManager(new GridLayoutManager(this, 2));
    }
}