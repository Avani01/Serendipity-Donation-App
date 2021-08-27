package com.example.serendipitydonationapp.book.indiaBook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.serendipitydonationapp.R;
import com.example.serendipitydonationapp.book.uaeBook.Book_org;
import com.example.serendipitydonationapp.book.uaeBook.Book_rvAdapter;
import com.example.serendipitydonationapp.book.usaBook.UsaBook_rvAdapter;

import java.util.ArrayList;

public class IndiaBookActivity extends AppCompatActivity {

    private RecyclerView book_rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_india_book);

        book_rv = findViewById(R.id.book_rv);

        ArrayList<Book_org> book_org = new ArrayList<>();
        book_org.add(new Book_org("The Book Fairies",
                "https://ibelieveinbookfairies.com/wp-content/uploads/2017/02/ibelieveinbookfairies2.jpg",
                "https://www.instagram.com/sistersofthepeople/?hl=en"));

        book_org.add(new Book_org("MyPustak",
                "https://upload.wikimedia.org/wikipedia/commons/4/43/Logo-My-Pustak-2x1.png",
                "https://www.mypustak.com/donate-books"));

        book_org.add(new Book_org("India Literacy Project",
                "https://www.ilpnet.org/wp-content/uploads/2019/01/ILP-High-Res-Logo-2017.jpg",
                "https://www.ilpnet.org/"));

        book_org.add(new Book_org("Ratna Nidhi Charitable Trust",
                "https://www.kgvmtrust.org/wp-content/uploads/2018/12/RatnaNidhi.jpg",
                "https://ratnanidhi.org/book-donation/MISSION-MILLION-BOOKS"));

        book_org.add(new Book_org("Katha",
                "https://www.katha.org/wp-content/uploads/2017/07/ka-logo-red-2.png",
                "https://www.katha.org/donate-books/"));

        book_org.add(new Book_org("Books For All",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQtj5teHW2NtFI7We7J6--PQ-Z0zRWkFddbKg&usqp=CAU",
                "http://www.booksforall.org.in/"));


        IndiaBook_rvAdapter adapter = new IndiaBook_rvAdapter(this);
        adapter.setBook_org(book_org);

        book_rv.setAdapter(adapter);
        book_rv.setLayoutManager(new GridLayoutManager(this, 2));
    }
}