package com.example.serendipitydonationapp.money.child.usaChild;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.serendipitydonationapp.R;
import com.example.serendipitydonationapp.money.child.uaeChild.Child_org;
import com.example.serendipitydonationapp.money.child.uaeChild.Child_rvAdapter;

import java.util.ArrayList;

public class UsaChildActivity extends AppCompatActivity {

    private RecyclerView child_rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usa_child);

        child_rv = findViewById(R.id.child_rv);

        ArrayList<Child_org> child_org = new ArrayList<>();
        child_org.add(new Child_org("Feed the Children",
                "https://secure.feedthechildren.org/assets/general_wrapper/images/FTC-Logo-Color.png",
                "https://www.feedthechildren.org/"));

        child_org.add(new Child_org("Save the Children",
                "https://dig.watch/sites/default/files/styles/max_325x325/public/SaveTheChildren_5.jpeg",
                "https://www.savethechildren.org/"));

        child_org.add(new Child_org("Smile Train",
                "https://yallagive.com/public/avatar/1548577503.png",
                "https://www.smiletrain.org/"));

        child_org.add(new Child_org("Starlight Children's Foundation",
                "https://seeklogo.com/images/S/starlight-children-s-foundation-logo-2874A1BB87-seeklogo.com.png",
                "https://www.starlight.org/"));

        child_org.add(new Child_org("Ronald McDonald House",
                "https://upload.wikimedia.org/wikipedia/en/3/3b/Ronald_McDonald_House_Charities_Logo.jpg",
                "https://www.rmhc.org/find-a-chapter"));

        child_org.add(new Child_org("Children's Health Fund",
                "https://www.wheelsforwishes.org/wp-content/uploads/2020/12/CHF.png",
                "https://www.childrenshealthfund.org/"));

        UsaChild_rvAdapter adapter = new UsaChild_rvAdapter(this);
        adapter.setChild_org(child_org);

        child_rv.setAdapter(adapter);
        child_rv.setLayoutManager(new GridLayoutManager(this, 2));
    }
}