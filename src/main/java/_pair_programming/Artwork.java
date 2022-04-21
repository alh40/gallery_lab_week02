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











    //
//    A Gallery should have a name, a till and a collection of Artwork.
//    A piece of Artwork should have a title, an artist, a price and an nft.
//    An Artist should have a name and a collection of artwork (i.e a list of artwork they have personally made).
//    A Customer should have a name and a wallet.
//    A Customer should be able to buy an Artwork from the Gallery, reducing the money in their wallet and increasing the money in the Gallery till.
//



}
