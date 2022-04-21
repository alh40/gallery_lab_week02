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



    //    public static void main(String[] args){
//
//        String galleryName = "Art Shop";
//        double galleryTill = 100.0;
//        ArrayList<String> galleryCollection = new ArrayList<>();
//
//        ArrayList<String> alexCollection = new ArrayList<>();
//        alexCollection.add("paint");
//        alexCollection.add("paint1");
//        alexCollection.add("paint2");
//
//        ArrayList<String> artistCollection2 = new ArrayList<>();
//        artistCollection2.add("paint123");
//        artistCollection2.add("paint1123");
//        artistCollection2.add("paint2123");
//
//        Artist alex = new Artist("alex", alexCollection);
//
//
//
//        Customer becca = new Customer("becca", 100.50);
//
//        Artwork painting1 = new Artwork(alexCollection.get(0), "alex", 300.50, 123);
//
//        System.out.println(painting1.toString());

//        ArrayList<String> galleryCollection = new ArrayList<>();
//        galleryCollection.add();
//
//        Gallery input = new Gallery("tree", 200.50, galleryCollection);
//

        //
//

//    }

}
