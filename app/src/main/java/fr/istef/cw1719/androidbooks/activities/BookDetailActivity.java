package fr.istef.cw1719.androidbooks.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;

import fr.istef.cw1719.androidbooks.R;
import fr.istef.cw1719.androidbooks.adapters.BookAdapter;
import fr.istef.cw1719.androidbooks.models.Book;

public class BookDetailActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Book mybook = new Book("Jack & Mitchel", "Guillaume Seateun", new Date(), 589, "https://www.journaldugeek.com/content/uploads/2019/02/yoda.png", 1);
        loadBook(mybook);
    }

    private void loadBook(Book book){
        // Construct the data source
        ArrayList<Book> myArray = new ArrayList<Book>();

        myArray.add(book);
        BookAdapter bookAdapter = new BookAdapter(this,android.R.layout.activity_list_item, myArray);

        ListView lvBooks = (ListView) findViewById(R.id.lvItems);
        lvBooks.setAdapter(bookAdapter);
    }
}
