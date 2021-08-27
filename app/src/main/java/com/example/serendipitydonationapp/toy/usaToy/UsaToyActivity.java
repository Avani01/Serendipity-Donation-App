package com.example.serendipitydonationapp.toy.usaToy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.serendipitydonationapp.R;
import com.example.serendipitydonationapp.toy.uaeToy.Toy_org;
import com.example.serendipitydonationapp.toy.uaeToy.Toy_rvAdapter;

import java.util.ArrayList;

public class UsaToyActivity extends AppCompatActivity {

    private RecyclerView toy_rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usa_toy);

        toy_rv = findViewById(R.id.toy_rv);

        ArrayList<Toy_org> toy_org = new ArrayList<>();
        toy_org.add(new Toy_org("Goodwill",
                "https://www.goodwill.org/wp-content/uploads/2019/06/cropped-Goodwill-Industries-International-Logo-1.jpg",
                "https://www.goodwill.org/about-us/"));

        toy_org.add(new Toy_org("Toys for Tots",
                "https://www.weliahealth.org/wp-content/uploads/2019/12/Toys-for-Tots-430x200.jpg",
                "https://www.toysfortots.org/request_toys/Default.aspx"));

        toy_org.add(new Toy_org("Habitat for Humanity",
                "https://bloximages.chicago2.vip.townnews.com/hjnews.com/content/tncms/assets/v3/editorial/b/66/b66707d9-4202-579c-87d6-673451f8b167/5e405fd6a6331.image.jpg",
                "https://www.habitat.org/restores/donate-goods"));

        toy_org.add(new Toy_org("Vietnam Veterans of America",
                "https://2aq7jk4ewh5w1c73nf21m4mu-wpengine.netdna-ssl.com/wp-content/uploads/2016/06/vva-logo-250x250.png",
                "https://vva.org/"));

        toy_org.add(new Toy_org("Salvation Army",
                "https://caringmagazine.org/wp-content/uploads/2018/02/salvationarmy.jpg",
                "https://www.salvationarmyusa.org/usn/home/#whatwedo"));

        toy_org.add(new Toy_org("Ronald McDonald House",
                "https://upload.wikimedia.org/wikipedia/en/3/3b/Ronald_McDonald_House_Charities_Logo.jpg",
                "https://www.rmhc.org/find-a-chapter"));

        UsaToy_rvAdapter adapter = new UsaToy_rvAdapter(this);
        adapter.setToy_org(toy_org);

        toy_rv.setAdapter(adapter);
        toy_rv.setLayoutManager(new GridLayoutManager(this, 2));
    }
}