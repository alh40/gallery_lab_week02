package _pair_programming;

public class Artwork {

    private String title;
    private String artist;
    private double price;
    private int nft;

    public Artwork(String artworkTitle, String artworkArtist, double artworkPrice, int artworkNft){
        this.title = artworkTitle;
        this.artist = artworkArtist;
        this.price = artworkPrice;
        this.nft = artworkNft;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public double getPrice() {
        return price;
    }

    public int getNft() {
        return nft;
    }

    @Override
    public String toString() {
        return "Artwork{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", price=" + price +
                ", nft=" + nft +
                '}';
    }



}
