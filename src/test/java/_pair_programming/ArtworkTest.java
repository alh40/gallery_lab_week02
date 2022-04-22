package _pair_programming;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArtworkTest {
    private String title;
    private String artist;
    private double price;
    private int nft;

    Artwork Artwork1 = new Artwork("Painting1", "Painter1", 100.0, 1);

    @Test
    public void getPrice1() {

        double actualValue = Artwork1.getPrice();
        double expectedValue = 100.0;
        assertEquals(actualValue, expectedValue);
    }
    Artwork Artwork2 = new Artwork("Painting1", "Painter1", 600.0, 1);
    @Test
    public void getPrice2() {

        double actualValue = Artwork2.getPrice();
        double expectedValue = 600.0;
        assertEquals(actualValue, expectedValue);
    }
}