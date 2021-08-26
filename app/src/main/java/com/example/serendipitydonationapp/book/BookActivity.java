package com.example.serendipitydonationapp.book;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.serendipitydonationapp.R;
import com.example.serendipitydonationapp.book.Book_org;
import com.example.serendipitydonationapp.book.Book_rvAdapter;

import java.util.ArrayList;

public class BookActivity extends AppCompatActivity {

    private RecyclerView book_rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        book_rv = findViewById(R.id.book_rv);

        ArrayList<Book_org> book_org = new ArrayList<>();
        book_org.add(new Book_org("Dubai Cares",
                "https://upload.wikimedia.org/wikipedia/commons/6/6f/Dubai_Cares%27_logo.jpg",
                "http://www.dubaicares.ae/"));

        book_org.add(new Book_org("Beit Al Khair Society",
                "http://beitalkhair.org/m/images/logo-new.png",
                "http://beitalkhair.org/en/"));

        book_org.add(new Book_org("The Old Library",
                "https://www.theoldlibrary.ae/wp-content/uploads/2019/09/New-Logo_2019-thumb.png",
                "https://www.theoldlibrary.ae/"));

        book_org.add(new Book_org("House of Prose",
                "https://timessquarecenter.ae/wp-content/uploads/2017/10/Times_Square_Center__House_Of_Prose.jpg",
                "https://www.houseofprose.ae/"));

        book_org.add(new Book_org("Maria Cristina Foundation",
                "https://mariacristinafoundation.org/MCFoundation/wp-content/uploads/2017/11/MCF-Logo-300x161.png",
                "http://mariacristinafoundation.org/"));

        book_org.add(new Book_org("Dar Al Ber Society",
                "https://arab.org/wp-content/uploads/2016/03/dar-al-ber-society-300x300.jpg",
                "https://www.daralber.ae/en/home"));

        Book_rvAdapter adapter = new Book_rvAdapter(this);
        adapter.setBook_org(book_org);

        book_rv.setAdapter(adapter);
        book_rv.setLayoutManager(new GridLayoutManager(this, 2));
    }
}