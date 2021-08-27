package com.example.serendipitydonationapp.money.covid.uaeCovid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.serendipitydonationapp.R;
import com.example.serendipitydonationapp.money.covid.uaeCovid.Covid_org;
import com.example.serendipitydonationapp.money.covid.uaeCovid.Covid_rvAdapter;

import java.util.ArrayList;

public class CovidActivity extends AppCompatActivity {

    private RecyclerView covid_rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid);

        covid_rv = findViewById(R.id.covid_rv);

        ArrayList<Covid_org> covid_org = new ArrayList<>();
        covid_org.add(new Covid_org("Ma'an",
                "https://www.libf.ac.uk/images/default-source/default-album/maan-logo.jpg",
                "https://maan.gov.ae/"));

        covid_org.add(new Covid_org("Dubai Cares",
                "https://upload.wikimedia.org/wikipedia/commons/6/6f/Dubai_Cares%27_logo.jpg",
                "http://www.dubaicares.ae/"));

        covid_org.add(new Covid_org("YallaGive",
                "https://www.ihc.ae/wp-content/uploads/2018/12/1_YallaGive-Primary-Logo.png",
                "https://yallagive.com//charitycampaign/coronavirus-relief"));

        covid_org.add(new Covid_org("GlobalGiving",
                "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/GlobalGiving.svg/435px-GlobalGiving.svg.png",
                "https://www.globalgiving.org/projects/coronavirus-relief-fund/"));

        covid_org.add(new Covid_org("World Health Organisation",
                "https://www.who.int/Images/SchemaOrg/schemaOrgLogo.jpg",
                "https://covid19responsefund.org/"));

        covid_org.add(new Covid_org("Penny Appeal Middle East",
                "https://pbs.twimg.com/profile_images/1214539608660336641/z7W_GKi3_400x400.jpg",
                "https://www.pennyappealme.org/covid19-relief"));

        Covid_rvAdapter adapter = new Covid_rvAdapter(this);
        adapter.setCovid_org(covid_org);

        covid_rv.setAdapter(adapter);
        covid_rv.setLayoutManager(new GridLayoutManager(this, 2));
    }
}