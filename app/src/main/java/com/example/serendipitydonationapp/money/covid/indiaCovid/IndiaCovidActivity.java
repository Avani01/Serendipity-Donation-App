package com.example.serendipitydonationapp.money.covid.indiaCovid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.serendipitydonationapp.R;
import com.example.serendipitydonationapp.money.covid.uaeCovid.Covid_org;
import com.example.serendipitydonationapp.money.covid.usaCovid.UsaCovid_rvAdapter;

import java.util.ArrayList;

public class IndiaCovidActivity extends AppCompatActivity {

    private RecyclerView covid_rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_india_covid);

        covid_rv = findViewById(R.id.covid_rv);

        ArrayList<Covid_org> covid_org = new ArrayList<>();
        covid_org.add(new Covid_org("Give2Asia",
                "https://give2asia.org/wp-content/themes/give2asia/images/logo.png",
                "https://give2asia.org/donate-coronavirus-fund/"));

        covid_org.add(new Covid_org("Give India",
                "https://cdn.givind.org/static/images/sharing-banner.jpg",
                "https://covid.giveindia.org/vaccination/?utm_campaign=&utm_medium=&utm_term=&utm_content= "));

        covid_org.add(new Covid_org("PM Cares",
                "https://img.dtnext.in/Articles/2020/Dec/202012161636295156_Cong-questions-govt-over-foreign-donations-to-PM-CARES-Fund_SECVPF.gif",
                "https://www.pmcares.gov.in/en/web/contribution/donate_india"));

        covid_org.add(new Covid_org("Akshaya Patra",
                "https://pbs.twimg.com/profile_images/1074995644383678464/aBdy_9zC_400x400.jpg",
                "https://www.akshayapatra.org/covid-relief-services"));

        covid_org.add(new Covid_org("Prime Minister’s National Relief Found",
                "https://content.jdmagicbox.com/comp/delhi/22/011p70522/catalogue/prime-ministers-national-relief-fund-defence-headquarter-delhi-government-organisations-lf0qt.jpg",
                "https://pmnrf.gov.in/en/online-donation"));

        covid_org.add(new Covid_org("Oxygen for India",
                "https://oxygenforindia.org/images/OXYGEN-Final-Logo.png",
                "https://www.oxygenforindia.org/faqs.html#donate"));

        IndiaCovid_rvAdapter adapter = new IndiaCovid_rvAdapter(this);
        adapter.setCovid_org(covid_org);

        covid_rv.setAdapter(adapter);
        covid_rv.setLayoutManager(new GridLayoutManager(this, 2));
    }
}