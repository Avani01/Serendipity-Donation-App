package com.example.serendipitydonationapp.money.covid.usaCovid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.serendipitydonationapp.R;
import com.example.serendipitydonationapp.money.covid.uaeCovid.Covid_org;
import com.example.serendipitydonationapp.money.covid.uaeCovid.Covid_rvAdapter;

import java.util.ArrayList;

public class UsaCovidActivity extends AppCompatActivity {

    private RecyclerView covid_rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usa_covid);

        covid_rv = findViewById(R.id.covid_rv);

        ArrayList<Covid_org> covid_org = new ArrayList<>();
        covid_org.add(new Covid_org("Direct Relief",
                "https://upload.wikimedia.org/wikipedia/commons/d/d3/Direct-Relief-Square.png",
                "https://www.directrelief.org/\n"));

        covid_org.add(new Covid_org("World Health Organisation",
                "https://www.who.int/Images/SchemaOrg/schemaOrgLogo.jpg",
                "https://covid19responsefund.org/"));

        covid_org.add(new Covid_org("GlobalGiving",
                "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/GlobalGiving.svg/435px-GlobalGiving.svg.png",
                "https://www.globalgiving.org/projects/coronavirus-relief-fund/"));

        covid_org.add(new Covid_org("Anera",
                "https://www.globalgiving.org/pfil/organ/72677/orglogo.jpg",
                "https://www.anera.org/"));

        covid_org.add(new Covid_org("Convoy of Hope",
                "http://ww1.prweb.com/prfiles/2018/10/12/15837223/COH_Primary%20-%20Stacked.png",
                "https://convoyofhope.org/"));

        covid_org.add(new Covid_org("Alight",
                "https://images.fastcompany.net/image/upload/w_596,c_limit,q_auto:best,f_auto/wp-cms/uploads/2020/03/i-1-90475107-how-the-former-american-refugee-committee-transformed-its-brand.png",
                "https://wearealight.org/"));

        UsaCovid_rvAdapter adapter = new UsaCovid_rvAdapter(this);
        adapter.setCovid_org(covid_org);

        covid_rv.setAdapter(adapter);
        covid_rv.setLayoutManager(new GridLayoutManager(this, 2));
    }
}