package _pair_programming;
import java.util.ArrayList;

public class Artist {

    private String name;
    private ArrayList<String> collection;

    public Artist(String artistName, ArrayList<String> artistCollection){
        this.name = artistName;
        this.collection = artistCollection;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAlexCollection(ArrayList<String> collection) {
        this.collection = collection;
        collection.add("painting1");
        collection.add("painting2");
    }

    public void setJamesCollection(ArrayList<String> collection) {
        this.collection = collection;
        collection.add("painting3");
        collection.add("painting4");
    }

    public void setBankCollection(ArrayList<String> collection) {
        this.collection = collection;
        collection.add("painting5");
        collection.add("painting6");
    }


    public String getName() {
        return name;
    }

    public ArrayList<String> getCollection() {
        return collection;
    }
}
