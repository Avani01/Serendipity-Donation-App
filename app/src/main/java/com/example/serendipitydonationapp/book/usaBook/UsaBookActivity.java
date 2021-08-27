package com.example.serendipitydonationapp.book.usaBook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.serendipitydonationapp.R;
import com.example.serendipitydonationapp.book.uaeBook.Book_org;
import com.example.serendipitydonationapp.book.uaeBook.Book_rvAdapter;

import java.util.ArrayList;

public class UsaBookActivity extends AppCompatActivity {

    private RecyclerView book_rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usa_book);

        book_rv = findViewById(R.id.book_rv);

        ArrayList<Book_org> book_org = new ArrayList<>();
        book_org.add(new Book_org("Discover Books",
                "https://www.discoverbooks.com/v/vspfiles/templates/255/images/template/COMBO_LOGO3.png",
                "https://www.discoverbooks.com/Default.asp"));

        book_org.add(new Book_org("Better World Books",
                "https://responsiblenomad.files.wordpress.com/2011/02/betterworldbooks-gif.png",
                "https://www.betterworldbooks.com/go/donatebooks"));

        book_org.add(new Book_org("Books for Kids",
                "https://www.seekpng.com/png/detail/422-4221741_better-world-books-better-world-books-logo.png",
                "https://www.booksforkids.org/get-involved/book-donations"));

        book_org.add(new Book_org("Bridge of Books Foundation",
                "https://bridgeofbooksfoundation.org/wp-content/uploads/2015/10/Bridge-of-Books-LOGO-web.png",
                "https://bridgeofbooksfoundation.org/"));

        book_org.add(new Book_org("Kids Need To Read",
                "https://www.kidsneedtoread.org/images/kntr_promote001.jpg",
                "http://www.kidsneedtoread.org/"));

        book_org.add(new Book_org("MagLiteracy",
                "https://i2.wp.com/magliteracy.org/wp-content/uploads/2020/09/cropped-cropped-img_2883-e1611702297621.jpg",
                "https://magliteracy.org/"));

        UsaBook_rvAdapter adapter = new UsaBook_rvAdapter(this);
        adapter.setBook_org(book_org);

        book_rv.setAdapter(adapter);
        book_rv.setLayoutManager(new GridLayoutManager(this, 2));
    }
}