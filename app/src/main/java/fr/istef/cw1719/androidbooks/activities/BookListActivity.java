package fr.istef.cw1719.androidbooks.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;

import fr.istef.cw1719.androidbooks.R;
import fr.istef.cw1719.androidbooks.adapters.BookAdapter;
import fr.istef.cw1719.androidbooks.models.Book;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class BookListActivity extends AppCompatActivity {
ListView lvBooks;
BookAdapter bookAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Construct the data source
        ArrayList<Book> myArray = new ArrayList<Book>();
        Book mybook = new Book("Jack & Mitchel", "Guillaume Seateun", new Date(), 589, "https://www.journaldugeek.com/content/uploads/2019/02/yoda.png", 1);


        myArray.add(mybook);
        BookAdapter bookAdapter = new BookAdapter(this,android.R.layout.activity_list_item, myArray);

        ListView lvBooks = (ListView) findViewById(R.id.lvItems);
        lvBooks.setAdapter(bookAdapter);
    }

    public void setupBookSelectedListener(){
        lvBooks.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
// Lancer l’intent ici dans le onclick
                Intent intent = new Intent(BookListActivity . this, BookDetailActivity.class);
                //Book mybook = R.layout.item_book.getAdapter().getItem(position);
                String message = "";
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
            }
        });
    }
}
