package com.example.serendipitydonationapp.money.child.indiaChild;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.serendipitydonationapp.R;
import com.example.serendipitydonationapp.money.child.uaeChild.Child_org;
import com.example.serendipitydonationapp.money.child.usaChild.UsaChild_rvAdapter;

import java.util.ArrayList;

public class IndiaChildActivity extends AppCompatActivity {

    private RecyclerView child_rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_india_child);

        child_rv = findViewById(R.id.child_rv);

        ArrayList<Child_org> child_org = new ArrayList<>();
        child_org.add(new Child_org("Smile Foundation India",
                "https://pbs.twimg.com/profile_images/717281826335629312/sm-e_TTy_400x400.jpg",
                "https://www.smilefoundationindia.org/register.asp"));

        child_org.add(new Child_org("Save the Children",
                "https://www.nicepng.com/png/detail/87-874775_save-the-children-logo-png.png",
                "https://support.savethechildren.org/site/Donation2?df_id=5070&5070.donation=form1&mfc_pref=T "));

        child_org.add(new Child_org("Child Rights and You",
                "https://en-media.thebetterindia.com/uploads/2009/01/crylogo-wit-standup.jpg",
                "https://www.cry.org/donation/foreign-donor/"));

        child_org.add(new Child_org("Children’s Hope India",
                "https://www.childrenshopeindia.org/wp-content/uploads/2014/01/CH-LOGO-_-Color1.jpg",
                "https://www.childrenshopeindia.org/donate/"));

        child_org.add(new Child_org("Akshaya Patra",
                "https://pbs.twimg.com/profile_images/1074995644383678464/aBdy_9zC_400x400.jpg",
                "https://www.akshayapatra.org/donate-happiness-boxes?utm_source=HB&utm_medium=happiness-boxes&utm_campaign=NOV-2020 "));

        child_org.add(new Child_org("Bachpan Bachao Andolan",
                "https://bba.org.in/wp-content/uploads/2020/02/bba-logo.png",
                "https://bba.org.in/donate/"));

        IndiaChild_rvAdapter adapter = new IndiaChild_rvAdapter(this);
        adapter.setChild_org(child_org);

        child_rv.setAdapter(adapter);
        child_rv.setLayoutManager(new GridLayoutManager(this, 2));
    }
}