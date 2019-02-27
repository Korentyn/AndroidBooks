package fr.istef.cw1719.androidbooks.models;

import java.util.Date;

public class Book {
    public String titre;
    public String auteur;
    public Date datePublication;
    public Integer nbPages;
    public String urlImage;
    public Integer id;

    public Book(String titre, String auteur, Date datePublication, Integer nbPages, String urlImage, Integer id) {
        this.titre = titre;
        this.auteur = auteur;
        this.datePublication = datePublication;
        this.nbPages = nbPages;
        this.urlImage = urlImage;
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public Date getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
    }

    public Integer getNbPages() {
        return nbPages;
    }

    public void setNbPages(Integer nbPages) {
        this.nbPages = nbPages;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
