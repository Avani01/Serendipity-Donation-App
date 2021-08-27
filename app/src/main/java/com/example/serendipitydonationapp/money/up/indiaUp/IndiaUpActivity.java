package com.example.serendipitydonationapp.money.up.indiaUp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.serendipitydonationapp.R;
import com.example.serendipitydonationapp.money.up.uaeUp.Up_org;
import com.example.serendipitydonationapp.money.up.usaUp.UsaUp_rvAdapter;

import java.util.ArrayList;

public class IndiaUpActivity extends AppCompatActivity {

    private RecyclerView up_rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_india_up);

        up_rv = findViewById(R.id.up_rv);

        ArrayList<Up_org> up_org = new ArrayList<>();
        up_org.add(new Up_org("Smile Foundation India",
                "https://pbs.twimg.com/profile_images/717281826335629312/sm-e_TTy_400x400.jpg",
                "https://www.smilefoundationindia.org/register.asp"));

        up_org.add(new Up_org("Udaan India Foundation",
                "https://static.wixstatic.com/media/d5fc3f_5fba80a914494dd8afc88def6e803b02.png/v1/fit/w_2500,h_1330,al_c/d5fc3f_5fba80a914494dd8afc88def6e803b02.png",
                "https://www.giveindia.org/program/Support-underprivileged-children-begin-their-educational-journey"));

        up_org.add(new Up_org("St. Jude India Child Care Center",
                "https://www.stjudechild.org/images/logo.png",
                "https://www.stjudechild.org/donate.aspx"));

        up_org.add(new Up_org("Akanksha Foundation",
                "https://www.consultavalon.com/wp-content/uploads/2019/02/community-akanksha.jpg",
                "https://www.billdesk.com/pgmerc/akanksha/AKANKSHADetails.htm"));

        up_org.add(new Up_org("Neptune Foundation",
                "https://pbs.twimg.com/profile_images/439304639742095360/Y3YUEDf8.jpeg",
                "https://gi.giveindia.org/m-1530-neptune-foundation.aspx"));

        up_org.add(new Up_org("Global Giving",
                "https://www.globalgiving.org/share/dfltpict.jpg",
                "https://www.globalgiving.org/search/?size=25&nextPage=1&sortField=sortorder&selectedCountries=00india&loadAllResults=true"));

        IndiaUp_rvAdapter adapter = new IndiaUp_rvAdapter(this);
        adapter.setUp_org(up_org);

        up_rv.setAdapter(adapter);
        up_rv.setLayoutManager(new GridLayoutManager(this, 2));
    }
}