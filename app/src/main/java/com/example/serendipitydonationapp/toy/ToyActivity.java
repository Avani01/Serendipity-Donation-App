package com.example.serendipitydonationapp.toy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.serendipitydonationapp.R;
import com.example.serendipitydonationapp.cloth.Cloth_org;
import com.example.serendipitydonationapp.cloth.Cloth_rvAdapter;

import java.util.ArrayList;

public class ToyActivity extends AppCompatActivity {

    private RecyclerView toy_rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toy);

        toy_rv = findViewById(R.id.toy_rv);

        ArrayList<Toy_org> toy_org = new ArrayList<>();
        toy_org.add(new Toy_org("Toys with Wings",
                "https://www.toyswithwings.org/assets/img/logo.png",
                "https://www.toyswithwings.org/donate-a-toy"));

        toy_org.add(new Toy_org("Emirates Red Crescent",
                "https://arab.org/wp-content/uploads/2021/03/erc-300x300.jpg",
                "https://www.emiratesrc.ae/en/"));

        toy_org.add(new Toy_org("Al Noor",
                "https://www.emirates247.com/polopoly_fs/1.589244.1452257928!/image/image.jpg",
                "https://alnoorspneeds.ae/"));

        toy_org.add(new Toy_org("Beit Al Khair Society",
                "http://beitalkhair.org/m/images/logo-new.png",
                "http://beitalkhair.org/en/"));

        toy_org.add(new Toy_org("Dubai Center for Special Needs",
                "https://www.dcsneeds.com/wp-content/uploads/2020/05/DCSN_LOGO_ENG.png",
                "https://www.dcsneeds.com/"));

        toy_org.add(new Toy_org("Dubai Cares",
                "https://upload.wikimedia.org/wikipedia/commons/6/6f/Dubai_Cares%27_logo.jpg",
                "http://www.dubaicares.ae/"));

        Toy_rvAdapter adapter = new Toy_rvAdapter(this);
        adapter.setToy_org(toy_org);

        toy_rv.setAdapter(adapter);
        toy_rv.setLayoutManager(new GridLayoutManager(this, 2));
    }
}