package _pair_programming;

import java.util.ArrayList;

//   A Gallery should have a name, a till and a collection of Artwork.
//    A piece of Artwork should have a title, an artist, a price and an nft.
//    An Artist should have a name and a collection of artwork (i.e a list of artwork they have personally made).
//    A Customer should have a name and a wallet.
//    A Customer should be able to buy an Artwork from the Gallery, reducing the money in their wallet and increasing the money in the Gallery till.
//
public class Gallery {

    private String name;
    private double till;
    private ArrayList<String> collection;

    public Gallery(String galleryName, double galleryTill, ArrayList<String> galleryCollection){
        this.name = galleryName;
        this.till = galleryTill;
        this.collection = galleryCollection;
    }

    public void soldArtwork(double amount){
        this.till += amount;
    }

    public String getName() {
        return name;
    }

    public double getTill() {

        return till;
    }

    public ArrayList<String> getCollection() {
        return collection;
    }

}
