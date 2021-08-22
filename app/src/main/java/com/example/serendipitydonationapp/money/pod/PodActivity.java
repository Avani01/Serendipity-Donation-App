package com.example.serendipitydonationapp.money.pod;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.serendipitydonationapp.R;
import com.example.serendipitydonationapp.book.Book_org;
import com.example.serendipitydonationapp.book.Book_rvAdapter;

import java.util.ArrayList;

public class PodActivity extends AppCompatActivity {

    private RecyclerView pod_rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pod);

        pod_rv = findViewById(R.id.pod_rv);

        ArrayList<Pod_org> pod_org = new ArrayList<>();
        pod_org.add(new Pod_org("Noor Dubai",
                "https://pbs.twimg.com/profile_images/754573256665997312/T4ATpb5Q.jpg",
                "https://www.noordubai.ae/"));

        pod_org.add(new Pod_org("Al Jalila Foundation",
                "https://arab.org/wp-content/uploads/2016/06/16496_492698897563549_840111881414480475_n-500x500.jpg",
                "https://www.aljalilafoundation.ae/get-involved/make-a-donation/"));

        pod_org.add(new Pod_org("Dubai Cares",
                "https://upload.wikimedia.org/wikipedia/commons/6/6f/Dubai_Cares%27_logo.jpg",
                "http://www.dubaicares.ae/"));

        pod_org.add(new Pod_org("Sharjah City For Humanitarian Services",
                "https://www.schs.ae/themes/schs/assets/img/logo.png",
                "https://www.schs.ae/en/support-us"));

        pod_org.add(new Pod_org("Emirates Red Crescent",
                "https://arab.org/wp-content/uploads/2021/03/erc-300x300.jpg",
                "https://www.emiratesrc.ae/en/"));

        pod_org.add(new Pod_org("Zakat Fund",
                "https://assets.wam.ae/uploads/2018/07/15089573067520.jpg",
                "https://www.zakatfund.gov.ae/zfp/web/Payment/PaymentForm.aspx"));

        Pod_rvAdapter adapter = new Pod_rvAdapter(this);
        adapter.setPod_org(pod_org);

        pod_rv.setAdapter(adapter);
        pod_rv.setLayoutManager(new GridLayoutManager(this, 2));
    }
}