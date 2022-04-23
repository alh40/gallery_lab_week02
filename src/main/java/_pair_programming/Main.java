package _pair_programming;
import java.util.*;

public class Main {
    private static String selectArtwork(Scanner input) {
        System.out.println("Please select the Artwork you want to purchase!");
        String artwork = input.nextLine();
        return artwork;
    }
    private static int getNum(Scanner input, String name) {
        System.out.println("Hi " + name + " please enter balance here!");
        int num = Integer.valueOf(input.nextLine());
        System.out.println("Artwork available: ");
        return num;
    }
    private static String getString(Scanner input) {
        System.out.println("Enter Name here!");
        String name = input.nextLine();
        return name;
    }
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        String name = getString(input);
        int num = getNum(input, name);

        ArrayList<Integer> nftList = Artwork.setNft();
        ArrayList<String> alexCollection = new ArrayList<>();
        ArrayList<String> jamesCollection = new ArrayList<>();
        ArrayList<String> bankCollection = new ArrayList<>();

        Artist painter1 = Artist.setArtist(alexCollection);
        Artist painter2 = Artist.setArtist1(jamesCollection);
        Artist painter3 = Artist.setArtist2(bankCollection);

        Artwork Artwork1 = Artwork.getArtwork1(nftList, alexCollection, painter1);
        Artwork Artwork2 = Artwork.getArtwork2(nftList, alexCollection, painter1);
        Artwork Artwork3 = Artwork.getArtwork3(nftList, jamesCollection, painter2);
        Artwork Artwork4 = Artwork.getArtwork4(nftList, jamesCollection, painter2);
        Artwork Artwork5 = Artwork.getArtwork5(nftList, bankCollection, painter3);
        Artwork Artwork6 = Artwork.getArtwork6(nftList, bankCollection, painter3);


        
        ArrayList<String> galleryCollection = new ArrayList<>();
        Gallery.galleryCollectionExtracted(Artwork1, Artwork2, Artwork3, Artwork4, Artwork5, Artwork6, galleryCollection);
        Gallery gallery = Gallery.setGallery(galleryCollection);

        ArrayList<String> customerCollection = new ArrayList<>();

        HashMap<String, Double> stockTakeMap = Gallery.getStringDoubleHashMap(gallery);

        System.out.println(galleryCollection);
        double galleryStockTake = gallery.stockTake(stockTakeMap);
        System.out.println(galleryStockTake);

        Customer user = new Customer(name, num);

        while(galleryCollection.size() > 0){

            String artwork = selectArtwork(input);

            if(galleryCollection.size() <= 0){
                System.out.println("Gallery is out of Art! Thank you for shopping!");
             break;
            }

            if (artwork.equals("painting1")) {

                galleryStockTake = Customer.ifPainting1(Artwork1, galleryCollection, gallery, customerCollection, stockTakeMap, galleryStockTake, user, artwork);
                if (artwork.equals("")) {
                break;
            }

        } else if (artwork.equals("painting2")) {

                galleryStockTake = Customer.ifPainting2(Artwork2, galleryCollection, gallery, customerCollection, stockTakeMap, galleryStockTake, user, artwork);
                if (artwork.equals("")) {
                break;
            }

        } else if (artwork.equals("painting3")) {

                galleryStockTake = Customer.ifPainting3(Artwork3, galleryCollection, gallery, customerCollection, stockTakeMap, galleryStockTake, user, artwork);
                if (artwork.equals("")) {
                break;
            }

        } else if (artwork.equals("painting4")) {

                galleryStockTake = Customer.ifPainting4(Artwork4, galleryCollection, gallery, customerCollection, stockTakeMap, galleryStockTake, user, artwork);
                if (artwork.equals("")) {
                break;
            }

        } else if (artwork.equals("painting5")) {

                galleryStockTake = Customer.ifPainting5(Artwork5, galleryCollection, gallery, customerCollection, stockTakeMap, galleryStockTake, user, artwork);
                if (artwork.equals("")) {
                    break;
            }

        } else if (artwork.equals("painting6")) {

                galleryStockTake = Customer.ifPainting6(Artwork6, galleryCollection, gallery, customerCollection, stockTakeMap, galleryStockTake, user, artwork);
                if (artwork.equals("")) {
                break;
            }

        } else {
                Artwork.defaultElse();
                if (artwork.equals("")) {
                break;
            }
        }
    }

    }

}





