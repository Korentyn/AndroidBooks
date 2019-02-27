package fr.istef.cw1719.androidbooks.adapters;

        import android.widget.ArrayAdapter;
        import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;
        import com.squareup.picasso.Picasso;
        import java.util.List;

        import fr.istef.cw1719.androidbooks.R;
        import fr.istef.cw1719.androidbooks.models.Book;

/**
 * Created by Boris on 12/05/2016.
 */
public class BookAdapter extends ArrayAdapter<Book> {
    // On récupère le constructeur qui nous permet d'initialiser le ArrayAdapter avec une List (ex: ArrayList<Book>)
    public BookAdapter(Context context, int resource, List<Book> objects) {
        super(context, resource, objects);
    }

    // Le Array Adatper permet de convertir des objets JAVA, dans leur représentation graphique dans une list view
    // cela se fait grâce à getView()
    // on redéfinit notre propre getView
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // récupérer l'objet Book à l'index position
        Book book = getItem(position);

        // vérifier si l'objet View, ici convertView est bien initialisé
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_book, parent, false);
        }

        // affecter les données à la vue
        // dans un premier temps, récupérer les composants de la vue
        ImageView imgV = (ImageView) convertView.findViewById(R.id.bookListImageView);
        TextView title = (TextView) convertView.findViewById(R.id.bookListTitle);
        TextView author = (TextView) convertView.findViewById(R.id.bookListAuthor);

        // assigner les valeurs
        title.setText(book.getTitre());
        author.setText(book.getAuteur());

        // pour assigner l'image nous utilisons la librairie Picasso
        Picasso.with(getContext()).load(book.getUrlImage()).into(imgV);

        // on renvoie la ligne avec les bonnes données
        return convertView;
    }
}