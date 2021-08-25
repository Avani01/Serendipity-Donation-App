package com.example.serendipitydonationapp.cloth.uaeCloth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.serendipitydonationapp.R;
import com.example.serendipitydonationapp.cloth.uaeCloth.Cloth_org;
import com.example.serendipitydonationapp.cloth.uaeCloth.Cloth_rvAdapter;

import java.util.ArrayList;

public class ClothActivity extends AppCompatActivity {

    private RecyclerView cloth_rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cloth);

        cloth_rv = findViewById(R.id.cloth_rv);

        ArrayList<Cloth_org> cloth_org = new ArrayList<>();
        cloth_org.add(new Cloth_org("Dubai Cares",
                "https://upload.wikimedia.org/wikipedia/commons/6/6f/Dubai_Cares%27_logo.jpg",
                "http://www.dubaicares.ae/"));

        cloth_org.add(new Cloth_org("Beit Al Khair Society",
                "http://beitalkhair.org/m/images/logo-new.png",
                "http://beitalkhair.org/en/"));

        cloth_org.add(new Cloth_org("Emirates Red Crescent",
                "https://arab.org/wp-content/uploads/2021/03/erc-300x300.jpg",
                "https://www.emiratesrc.ae/en/"));

        cloth_org.add(new Cloth_org("Rags to Riches",
                "https://images.squarespace-cdn.com/content/v1/54c218ede4b05e6378bf6e05/1429102679731-34WPBRQP0JTWON8CDY9H/logo1.jpg",
                "https://www.facebook.com/Rags2RichesUAE/"));

        cloth_org.add(new Cloth_org("Maria Christina Foundation",
                "https://mariacristinafoundation.org/MCFoundation/wp-content/uploads/2017/11/MCF-Logo-300x161.png",
                "http://mariacristinafoundation.org/"));

        cloth_org.add(new Cloth_org("Al Ihsan Charity",
                "https://alihsan.ae/Content/Generated/Thumbnails/728e6d4b_12c1x1680wTransparent.jpg",
                "https://alihsan.ae/default.aspx"));

        Cloth_rvAdapter adapter = new Cloth_rvAdapter(this);
        adapter.setCloth_org(cloth_org);

        cloth_rv.setAdapter(adapter);
        cloth_rv.setLayoutManager(new GridLayoutManager(this, 2));
    }
}