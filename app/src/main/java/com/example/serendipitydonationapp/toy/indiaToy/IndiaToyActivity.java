package com.example.serendipitydonationapp.toy.indiaToy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.serendipitydonationapp.R;
import com.example.serendipitydonationapp.toy.uaeToy.Toy_org;
import com.example.serendipitydonationapp.toy.usaToy.UsaToy_rvAdapter;

import java.util.ArrayList;

public class IndiaToyActivity extends AppCompatActivity {

    private RecyclerView toy_rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_india_toy);

        toy_rv = findViewById(R.id.toy_rv);

        ArrayList<Toy_org> toy_org = new ArrayList<>();
        toy_org.add(new Toy_org("The Toy Bank",
                "https://letzchangefiles.s3.ap-southeast-1.amazonaws.com/52467aeb-e1ac-41b0-a0be-0070e0eaba8f.jpg",
                "https://toybank.in/"));

        toy_org.add(new Toy_org("Share At Door Step",
                "https://sadsindia.org/wp-content/uploads/2018/12/sads_logo_1200x1200-1.jpg",
                "https://sadsindia.org/"));

        toy_org.add(new Toy_org("Nanhi Jaan",
                "https://res.cloudinary.com/roundglass/image/upload/v1557130878/roundglass/rise/NJ-logo-Small-RoundGlass-Rise_x6ghlb_omndg0.png",
                "https://nanhijaan.com/"));

        toy_org.add(new Toy_org("Lakshyam Toy Libraries",
                "https://img.over-blog-kiwi.com/2/16/57/97/20161012/ob_7c8007_logo.png",
                "https://www.lakshyam.co.in/lakshyam-program/toy-library/#"));

        toy_org.add(new Toy_org("Asha Kuteer Orphanage",
                "https://content.jdmagicbox.com/comp/hyderabad/b6/040pxx40.xx40.160531172854.v7b6/catalogue/asha-kuteer-orphanage-uppal-hyderabad-orphanages-2znld.jpg",
                "https://ashakuteer.org/"));

        toy_org.add(new Toy_org("Children Toy Foundation",
                "https://letzchangefiles.s3.ap-southeast-1.amazonaws.com/cf7c09fe-cb90-4305-9093-6d61142591d6.jpg",
                "http://www.childrentoyfoundation.org/"));

        IndiaToy_rvAdapter adapter = new IndiaToy_rvAdapter(this);
        adapter.setToy_org(toy_org);

        toy_rv.setAdapter(adapter);
        toy_rv.setLayoutManager(new GridLayoutManager(this, 2));
    }
}