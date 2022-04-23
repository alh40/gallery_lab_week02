package _pair_programming;
import java.util.*;



public class Main {

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

        HashMap<String, Double> stockTakeMap = getStringDoubleHashMap(gallery);

        System.out.println(galleryCollection);
        double galleryStockTake = gallery.stockTake(stockTakeMap);
        System.out.println(galleryStockTake);

        Customer user = new Customer(name, num);

        while(galleryCollection.size() > 0){

            String artwork = getArtwork(input);

            if(galleryCollection.size() <= 0){
                System.out.println("Gallery is out of Art! Thank you for shopping!");
             break;
            }

            if (artwork.equals("painting1")) {

                galleryStockTake = ifPainting1(Artwork1, galleryCollection, gallery, customerCollection, stockTakeMap, galleryStockTake, user, artwork);
                if (artwork.equals("")) {
                break;
            }

        } else if (artwork.equals("painting2")) {

                galleryStockTake = ifPainting2(Artwork2, galleryCollection, gallery, customerCollection, stockTakeMap, galleryStockTake, user, artwork);
                if (artwork.equals("")) {
                break;
            }

        } else if (artwork.equals("painting3")) {

                galleryStockTake = ifPainting3(Artwork3, galleryCollection, gallery, customerCollection, stockTakeMap, galleryStockTake, user, artwork);
                if (artwork.equals("")) {
                break;
            }

        } else if (artwork.equals("painting4")) {

                galleryStockTake = ifPainting4(Artwork4, galleryCollection, gallery, customerCollection, stockTakeMap, galleryStockTake, user, artwork);
                if (artwork.equals("")) {
                break;
            }

        } else if (artwork.equals("painting5")) {

                galleryStockTake = ifPainting5(Artwork5, galleryCollection, gallery, customerCollection, stockTakeMap, galleryStockTake, user, artwork);
                if (artwork.equals("")) {
                    break;
            }

        } else if (artwork.equals("painting6")) {

                galleryStockTake = ifPainting6(Artwork6, galleryCollection, gallery, customerCollection, stockTakeMap, galleryStockTake, user, artwork);
                if (artwork.equals("")) {
                break;
            }

        } else {
                defaultElse();
                if (artwork.equals("")) {
                break;
            }
        }
    }

    }

    private static double ifPainting1(Artwork Artwork1, ArrayList<String> galleryCollection, Gallery gallery, ArrayList<String> customerCollection, HashMap<String, Double> stockTakeMap, double galleryStockTake, Customer user, String artwork) {
        user.purchaseArtwork(Artwork1.getPrice());
        gallery.soldArtwork(Artwork1.getPrice());
        painting1Method1(Artwork1, galleryCollection, gallery, customerCollection, user);
        galleryStockTake = Gallery.getGalleryStockTake(customerCollection, stockTakeMap, galleryStockTake, artwork);
        return galleryStockTake;
    }

    private static double ifPainting2(Artwork Artwork2, ArrayList<String> galleryCollection, Gallery gallery, ArrayList<String> customerCollection, HashMap<String, Double> stockTakeMap, double galleryStockTake, Customer user, String artwork) {
        user.purchaseArtwork(Artwork2.getPrice());
        gallery.soldArtwork(Artwork2.getPrice());
        painting2method1(Artwork2, galleryCollection, gallery, customerCollection, user);
        galleryStockTake = Gallery.getStockTake(customerCollection, stockTakeMap, galleryStockTake, artwork);
        return galleryStockTake;
    }

    private static double ifPainting3(Artwork Artwork3, ArrayList<String> galleryCollection, Gallery gallery, ArrayList<String> customerCollection, HashMap<String, Double> stockTakeMap, double galleryStockTake, Customer user, String artwork) {
        user.purchaseArtwork(Artwork3.getPrice());
        gallery.soldArtwork(Artwork3.getPrice());
        painting3Method3(Artwork3, galleryCollection, gallery, customerCollection, user);
        galleryStockTake = Gallery.getStockTake(customerCollection, stockTakeMap, galleryStockTake, artwork);
        return galleryStockTake;
    }

    private static double ifPainting4(Artwork Artwork4, ArrayList<String> galleryCollection, Gallery gallery, ArrayList<String> customerCollection, HashMap<String, Double> stockTakeMap, double galleryStockTake, Customer user, String artwork) {
        user.purchaseArtwork(Artwork4.getPrice());
        gallery.soldArtwork(Artwork4.getPrice());
        painting4Method4(Artwork4, galleryCollection, gallery, customerCollection, user);
        galleryStockTake = Gallery.getStockTake(customerCollection, stockTakeMap, galleryStockTake, artwork);
        return galleryStockTake;
    }

    private static double ifPainting5(Artwork Artwork5, ArrayList<String> galleryCollection, Gallery gallery, ArrayList<String> customerCollection, HashMap<String, Double> stockTakeMap, double galleryStockTake, Customer user, String artwork) {
        user.purchaseArtwork(Artwork5.getPrice());
        gallery.soldArtwork(Artwork5.getPrice());
        painting5Method5(Artwork5, galleryCollection, gallery, customerCollection, user);
        galleryStockTake = Gallery.getStockTake(customerCollection, stockTakeMap, galleryStockTake, artwork);
        return galleryStockTake;
    }

    private static double ifPainting6(Artwork Artwork6, ArrayList<String> galleryCollection, Gallery gallery, ArrayList<String> customerCollection, HashMap<String, Double> stockTakeMap, double galleryStockTake, Customer user, String artwork) {
        user.purchaseArtwork(Artwork6.getPrice());
        gallery.soldArtwork(Artwork6.getPrice());
        painting6Method6(Artwork6, galleryCollection, gallery, customerCollection, user);
        galleryStockTake = Gallery.getStockTake(customerCollection, stockTakeMap, galleryStockTake, artwork);
        return galleryStockTake;
    }

    private static void defaultElse() {
        System.out.println("This artwork is not in stock!");
        System.out.println("Please Reselect!");
    }

    private static void painting6Method6(Artwork Artwork6, ArrayList<String> galleryCollection, Gallery gallery, ArrayList<String> customerCollection, Customer user) {
        printWalletTill(gallery, user);
        String temp = String.valueOf(Artwork6);
        customerCollection.add(temp);
        galleryCollection.remove(String.valueOf(Artwork6));
        Gallery.printCurrentGallery(galleryCollection);
    }

    private static void printWalletTill(Gallery gallery, Customer user) {
        System.out.println(user.getName() + " has " + user.getWallet() + " left in their wallet.");
        System.out.println("Money in till: " + gallery.getTill());
    }

    private static void painting5Method5(Artwork Artwork5, ArrayList<String> galleryCollection, Gallery gallery, ArrayList<String> customerCollection, Customer user) {
        printWalletTill(gallery, user);
        String temp = String.valueOf(Artwork5);
        customerCollection.add(temp);
        galleryCollection.remove(String.valueOf(Artwork5));
        Gallery.printCurrentGallery(galleryCollection);
    }



    private static void painting4Method4(Artwork Artwork4, ArrayList<String> galleryCollection, Gallery gallery, ArrayList<String> customerCollection, Customer user) {
        printWalletTill(gallery, user);
        String temp = String.valueOf(Artwork4);
        customerCollection.add(temp);
        galleryCollection.remove(String.valueOf(Artwork4));
        Gallery.printCurrentGallery(galleryCollection);
    }

    private static void painting3Method3(Artwork Artwork3, ArrayList<String> galleryCollection, Gallery gallery, ArrayList<String> customerCollection, Customer user) {
        printWalletTill(gallery, user);
        String temp = String.valueOf(Artwork3);
        customerCollection.add(temp);
        galleryCollection.remove(String.valueOf(Artwork3));
        Gallery.printCurrentGallery(galleryCollection);
    }



    private static void painting2method1(Artwork Artwork2, ArrayList<String> galleryCollection, Gallery gallery, ArrayList<String> customerCollection, Customer user) {
        printWalletTill(gallery, user);
        String temp = String.valueOf(Artwork2);
        customerCollection.add(temp);
        galleryCollection.remove(String.valueOf(Artwork2));
        Gallery.printCurrentGallery(galleryCollection);
    }



    private static void painting1Method1(Artwork Artwork1, ArrayList<String> galleryCollection, Gallery gallery, ArrayList<String> customerCollection, Customer user) {
        String temp = String.valueOf(Artwork1);
        customerCollection.add(temp);
        galleryCollection.remove(String.valueOf(Artwork1));
        printWalletTill(gallery, user);
        Gallery.printCurrentGallery(galleryCollection);
    }

    private static String getArtwork(Scanner input) {
        System.out.println("Please select the Artwork you want to purchase!");
        String artwork = input.nextLine();
        return artwork;
    }

    private static HashMap<String, Double> getStringDoubleHashMap(Gallery gallery) {
        HashMap<String, Double> stockTakeMap = new HashMap<>();
        gallery.setHashMap(stockTakeMap);
        return stockTakeMap;
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



}





