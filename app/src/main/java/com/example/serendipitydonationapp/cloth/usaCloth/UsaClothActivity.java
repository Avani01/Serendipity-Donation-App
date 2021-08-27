package com.example.serendipitydonationapp.cloth.usaCloth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.serendipitydonationapp.R;
import com.example.serendipitydonationapp.cloth.uaeCloth.Cloth_org;

import java.util.ArrayList;

public class UsaClothActivity extends AppCompatActivity {

    private RecyclerView cloth_rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usa_cloth);

        cloth_rv = findViewById(R.id.cloth_rv);

        ArrayList<Cloth_org> cloth_org = new ArrayList<>();
        cloth_org.add(new Cloth_org("Goodwill",
                "https://www.goodwill.org/wp-content/uploads/2019/06/cropped-Goodwill-Industries-International-Logo-1.jpg",
                "https://www.goodwill.org/about-us/"));

        cloth_org.add(new Cloth_org("Salvation Army",
                "https://caringmagazine.org/wp-content/uploads/2018/02/salvationarmy.jpg",
                "https://www.salvationarmyusa.org/usn/home/#whatwedo"));

        cloth_org.add(new Cloth_org("Vietnam Veterans of America",
                "https://2aq7jk4ewh5w1c73nf21m4mu-wpengine.netdna-ssl.com/wp-content/uploads/2016/06/vva-logo-250x250.png",
                "https://vva.org/"));

        cloth_org.add(new Cloth_org("Soles4Souls",
                "https://soles4souls.org/wp-content/uploads/Shortened@4x-100.jpg",
                "https://soles4souls.org/"));

        cloth_org.add(new Cloth_org("Room to Grow",
                "https://cdn.greatnonprofits.org/images/logos/RTG_Stacked_RGBSQUARE-013.jpg",
                "https://www.roomtogrow.org/"));

        cloth_org.add(new Cloth_org("WGirls",
                "https://assets.classy.org/434331/a96cf0b8-6f17-11ea-b45a-0e0c11758269.jpg",
                "https://wgirls.org/"));

        UsaCloth_rvAdapter adapter = new UsaCloth_rvAdapter(this);
        adapter.setCloth_org(cloth_org);

        cloth_rv.setAdapter(adapter);
        cloth_rv.setLayoutManager(new GridLayoutManager(this, 2));
    }
}