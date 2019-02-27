package fr.istef.cw1719.androidbooks.activities;

import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;

import fr.istef.cw1719.androidbooks.R;
import fr.istef.cw1719.androidbooks.adapters.BookAdapter;
import fr.istef.cw1719.androidbooks.models.Book;

public class BookDetailActivity extends AppCompatActivity {

    private void loadBook(Book book){
        setContentView(R.layout.activity_book_detail);
        // Construct the data source
        ArrayList<Book> myArray = new ArrayList<Book>();

        myArray.add(book);
        BookAdapter bookAdapter = new BookAdapter(this,android.R.layout.activity_list_item, myArray);

        ListView lvBooks = (ListView) findViewById(R.id.lvItems);
        lvBooks.setAdapter(bookAdapter);
    }
}
