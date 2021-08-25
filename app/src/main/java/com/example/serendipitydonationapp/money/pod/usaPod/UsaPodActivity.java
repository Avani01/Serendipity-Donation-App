package com.example.serendipitydonationapp.money.pod.usaPod;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.serendipitydonationapp.R;
import com.example.serendipitydonationapp.money.pod.uaePod.Pod_org;
import com.example.serendipitydonationapp.money.pod.uaePod.Pod_rvAdapter;

import java.util.ArrayList;

public class UsaPodActivity extends AppCompatActivity {

    private RecyclerView pod_rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usa_pod);

        pod_rv = findViewById(R.id.pod_rv);

        ArrayList<Pod_org> pod_org = new ArrayList<>();
        pod_org.add(new Pod_org("Easter Seals",
                "https://www.easterseals.com/shared-library/images/easterseals-abilities-logo.png",
                "https://www.easterseals.com/"));

        pod_org.add(new Pod_org("Special Olympics",
                "https://www.friendshipcircle.org/blog/wp-content/uploads/2016/01/Special_Olympics_logo.svg_-e1452718038386.png",
                "https://www.specialolympics.org/"));

        pod_org.add(new Pod_org("United Cerebral Palsy",
                "https://www.friendshipcircle.org/blog/wp-content/uploads/2016/01/UCP-logo.jpg",
                "https://ucp.org/"));

        pod_org.add(new Pod_org("The Arc",
                "https://www.friendshipcircle.org/blog/wp-content/uploads/2016/01/the-arc-logo.jpg",
                "https://thearc.org/"));

        pod_org.add(new Pod_org("Federation for Children with Special Needs",
                "https://www.friendshipcircle.org/blog/wp-content/uploads/2016/01/Federation-logo.jpg",
                "https://fcsn.org/"));

        pod_org.add(new Pod_org("Special Needs Alliance",
                "https://www.friendshipcircle.org/blog/wp-content/uploads/2016/01/special-needs-alliance-logo-300x135.jpg",
                "https://www.specialneedsalliance.org/"));

        UsaPod_rvAdapter adapter = new UsaPod_rvAdapter(this);
        adapter.setPod_org(pod_org);

        pod_rv.setAdapter(adapter);
        pod_rv.setLayoutManager(new GridLayoutManager(this, 2));
    }
}