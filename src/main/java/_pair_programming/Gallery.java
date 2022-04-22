package _pair_programming;

import java.util.ArrayList;
import java.util.HashMap;

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
    private double stockTake;
    private String input;

    public Gallery(String galleryName, double galleryTill, ArrayList<String> galleryCollection){
        this.name = galleryName;
        this.till = galleryTill;
        this.collection = galleryCollection;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public void setCollection(ArrayList<String> collection) {

    }
    public void setHashMap(HashMap<String, Double> stockTakeMap){
        stockTakeMap.put("painting1", 100.0);
        stockTakeMap.put("painting2", 200.0);
        stockTakeMap.put("painting3", 300.0);
        stockTakeMap.put("painting4", 400.0);
        stockTakeMap.put("painting5", 500.0);
        stockTakeMap.put("painting6", 600.0);
    }

    public double stockTake(){
        double sum = 0;
        HashMap<String, Double> stockTakeMap = new HashMap<>();

        Gallery gallery1 = new Gallery( this.name, this.till, this.collection);

        gallery1.setHashMap(stockTakeMap);

        for(double item: stockTakeMap.values()){
            sum += item;
        }
       return sum;

    }


    public HashMap<String, Double> getHashMap(HashMap<String, Double> stockTakeMap){
        return stockTakeMap;
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
