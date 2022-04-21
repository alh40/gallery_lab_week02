package _pair_programming;
import org.testng.annotations.Test;

import java.util.ArrayList;
import static org.testng.Assert.*;


public class GalleryTest {

    private String galleryName;
    private double galleryTill;
    private ArrayList<String> galleryCollection;

    Gallery gallery = new Gallery("gallery", 500.0, galleryCollection);
    @Test
        void soldArtwork(double amount){
        double galleryTill = 500.0;
        double actualValue = gallery.getTill() + amount;
        double expectedValue = 600;
        assertEquals(actualValue, expectedValue);
    }

//    given

//    when

//    then



}