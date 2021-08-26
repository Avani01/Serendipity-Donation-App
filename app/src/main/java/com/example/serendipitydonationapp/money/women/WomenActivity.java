package com.example.serendipitydonationapp.money.women;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.serendipitydonationapp.R;

import java.util.ArrayList;

public class WomenActivity extends AppCompatActivity {

    private RecyclerView women_rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_women);

        women_rv = findViewById(R.id.women_rv);

        ArrayList<Women_org> women_org = new ArrayList<>();
        women_org.add(new Women_org("Dubai Foundation for Women & Children",
                "https://www.dfwac.ae/sites/default/files/dfwac_logo_1.png",
                "https://www.dfwac.ae/"));

        women_org.add(new Women_org("Dubai Cares",
                "https://upload.wikimedia.org/wikipedia/commons/6/6f/Dubai_Cares%27_logo.jpg",
                "http://www.dubaicares.ae/"));

        women_org.add(new Women_org("Al Jalila Foundation",
                "https://arab.org/wp-content/uploads/2016/06/16496_492698897563549_840111881414480475_n-500x500.jpg",
                "https://www.aljalilafoundation.ae/get-involved/make-a-donation/"));

        women_org.add(new Women_org("Zakat Fund",
                "https://assets.wam.ae/uploads/2018/07/15089573067520.jpg",
                "https://www.zakatfund.gov.ae/zfp/web/Payment/PaymentForm.aspx"));

        women_org.add(new Women_org("Khalifa Foundation",
                "https://assets.wam.ae/uploads/2020/04/1571001735864405000.jpg",
                "https://www.khalifafoundation.ae/en/home"));

        women_org.add(new Women_org("EWA’A",
                "https://imgcdn.pakistanpoint.com/media/2019/02/_3/730x425/pic_1550337025.jpg",
                "http://shwc.ae/default.aspx"));

        Women_rvAdapter adapter = new Women_rvAdapter(this);
        adapter.setWomen_org(women_org);

        women_rv.setAdapter(adapter);
        women_rv.setLayoutManager(new GridLayoutManager(this, 2));
    }
}