package _pair_programming;

import java.util.ArrayList;
import java.util.HashMap;

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


    public double stockTake(HashMap<String, Double> stockTakeMap){
        double sum = 0;
        for(double item: stockTakeMap.values()){
            sum += item;
        }
       return sum;

    }
    public static Gallery setGallery(ArrayList<String> galleryCollection) {
        Gallery gallery = new Gallery("gallery", 500.0, galleryCollection);
        gallery.setCollection(galleryCollection);
        return gallery;
    }

    public static void galleryCollectionExtracted(Artwork Artwork1, Artwork Artwork2, Artwork Artwork3, Artwork Artwork4, Artwork Artwork5, Artwork Artwork6, ArrayList<String> galleryCollection) {
        galleryCollection.add(String.valueOf(Artwork1));
        galleryCollection.add(String.valueOf(Artwork2));
        galleryCollection.add(String.valueOf(Artwork3));
        galleryCollection.add(String.valueOf(Artwork4));
        galleryCollection.add(String.valueOf(Artwork5));
        galleryCollection.add(String.valueOf(Artwork6));
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
    public static double getGalleryStockTake(ArrayList<String> customerCollection, HashMap<String, Double> stockTakeMap, double galleryStockTake, String artwork) {
        galleryStockTake = getStockTake(customerCollection, stockTakeMap, galleryStockTake, artwork);
        return galleryStockTake;
    }

    public static double getStockTake(ArrayList<String> customerCollection, HashMap<String, Double> stockTakeMap, double galleryStockTake, String artwork) {
        galleryStockTake = galleryStockTake - stockTakeMap.get(artwork);
        System.out.println("Gallery Stock = " + galleryStockTake);
        System.out.println("Customer Collection: ");
        System.out.println(customerCollection);
        System.out.println("Thank you for shopping with us! Would you like to purchase another?");
        return galleryStockTake;
    }
    public static void printCurrentGallery(ArrayList<String> galleryCollection) {
        System.out.println("Current Gallery Collection: ");
        System.out.println(galleryCollection);
    }


}
