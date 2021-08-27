package com.example.serendipitydonationapp.money.child.uaeChild;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.serendipitydonationapp.R;
import com.example.serendipitydonationapp.money.child.uaeChild.Child_org;
import com.example.serendipitydonationapp.money.child.uaeChild.Child_rvAdapter;

import java.util.ArrayList;

public class ChildActivity extends AppCompatActivity {

    private RecyclerView child_rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        child_rv = findViewById(R.id.child_rv);

        ArrayList<Child_org> child_org = new ArrayList<>();
        child_org.add(new Child_org("Dubai Cares",
                "https://upload.wikimedia.org/wikipedia/commons/6/6f/Dubai_Cares%27_logo.jpg",
                "http://www.dubaicares.ae/"));

        child_org.add(new Child_org("Beit Al Kheir Society",
                "http://beitalkhair.org/m/images/logo-new.png",
                "http://beitalkhair.org/en/"));

        child_org.add(new Child_org("Dubai Charity Association",
                "https://assets.wam.ae/uploads/2017/06/28602235808658.jpg",
                "https://www.dubaicharity.ae/"));

        child_org.add(new Child_org("Gulf For Good",
                "https://www.ihc.ae/wp-content/uploads/2017/11/16-5.jpg",
                "https://www.gulf4good.org/"));

        child_org.add(new Child_org("Dubai Foundation for Women and Children",
                "https://www.dfwac.ae/sites/default/files/dfwac_logo_1.png",
                "https://www.dfwac.ae/"));

        child_org.add(new Child_org("Emirates Red Crescent",
                "https://arab.org/wp-content/uploads/2021/03/erc-300x300.jpg",
                "https://www.emiratesrc.ae/en/"));

        Child_rvAdapter adapter = new Child_rvAdapter(this);
        adapter.setChild_org(child_org);

        child_rv.setAdapter(adapter);
        child_rv.setLayoutManager(new GridLayoutManager(this, 2));
    }
}