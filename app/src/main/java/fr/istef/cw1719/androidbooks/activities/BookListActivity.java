package fr.istef.cw1719.androidbooks.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;

import fr.istef.cw1719.androidbooks.R;
import fr.istef.cw1719.androidbooks.adapters.BookAdapter;
import fr.istef.cw1719.androidbooks.models.Book;

public class BookListActivity extends AppCompatActivity {
ListView lvBooks;
BookAdapter bookAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Construct the data source
        ArrayList<Book> myArray = new ArrayList<Book>();
        Book mybook = new Book("Jackie & Michel", "Guillaume Seateun", new Date(), 589, "https://upload.wikimedia.org/wikipedia/fr/c/cc/Jacquie_et_Michel_logo.png", 1);

        myArray.add(mybook);
        BookAdapter bookAdapter = new BookAdapter(this,android.R.layout.activity_list_item, myArray);

        ListView lvBooks = (ListView) findViewById(R.id.lvItems);
        lvBooks.setAdapter(bookAdapter);
    }


}
