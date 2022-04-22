package _pair_programming;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.println("Enter Name here!");
        String name = input.nextLine();

        System.out.println("Hi " + name + " please enter balance here!");
        int num = Integer.valueOf(input.nextLine());
        System.out.println("Artwork available: ");

        ArrayList<Integer> nftList = setNft();

        ArrayList<String> alexCollection = new ArrayList<>();
        ArrayList<String> jamesCollection = new ArrayList<>();
        ArrayList<String> bankCollection = new ArrayList<>();

        Artist painter1 = new Artist("Alex", alexCollection);
        Artist painter2 = new Artist("James", jamesCollection);
        Artist painter3 = new Artist("Bank", bankCollection);

        painter1.setAlexCollection(alexCollection);
        painter2.setJamesCollection(jamesCollection);
        painter3.setBankCollection(bankCollection);

        Artwork Artwork1 = new Artwork(alexCollection.get(0), painter1.getName(), 100.0, nftList.get(0));
        Artwork Artwork2 = new Artwork(alexCollection.get(1), painter1.getName(), 200.0, nftList.get(1));
        Artwork Artwork3 = new Artwork(jamesCollection.get(0), painter2.getName(), 300.0, nftList.get(2));
        Artwork Artwork4 = new Artwork(jamesCollection.get(1), painter2.getName(), 400.0, nftList.get(3));
        Artwork Artwork5 = new Artwork(bankCollection.get(0), painter3.getName(), 500.0, nftList.get(4));
        Artwork Artwork6 = new Artwork(bankCollection.get(1), painter3.getName(), 600.0, nftList.get(5));


        ArrayList<String> galleryCollection = new ArrayList<>();
        galleryCollection.add(String.valueOf(Artwork1));
        galleryCollection.add(String.valueOf(Artwork2));
        galleryCollection.add(String.valueOf(Artwork3));
        galleryCollection.add(String.valueOf(Artwork4));
        galleryCollection.add(String.valueOf(Artwork5));
        galleryCollection.add(String.valueOf(Artwork6));

        Gallery gallery = new Gallery("gallery", 500.0, galleryCollection);
        gallery.setCollection(galleryCollection);

        ArrayList<String> customerCollection = new ArrayList<>();

        HashMap<String, Double> stockTakeMap = new HashMap<>();
        gallery.setHashMap(stockTakeMap);

        System.out.println(gallery.getHashMap(stockTakeMap));

        System.out.println(galleryCollection);

        double galleryStockTake = gallery.stockTake(stockTakeMap);

        System.out.println(galleryStockTake);

        Customer user = new Customer(name, num);

        while(true){

        System.out.println("Please select the Artwork you want to purchase!");
        String artwork = input.nextLine();



        if (artwork.equals("painting1")) {


            user.purchaseArtwork(Artwork1.getPrice());

            gallery.soldArtwork(Artwork1.getPrice());

            System.out.println(user.getName() + " has " + user.getWallet() + " left in their wallet.");
            System.out.println("Money in till: " + gallery.getTill());
            String temp = String.valueOf(Artwork1);
            customerCollection.add(temp);
            galleryCollection.remove(String.valueOf(Artwork1));
            System.out.println("Remaining in Gallery Collection: ");
            System.out.println(galleryCollection);

//            double galleryStockTake = gallery.stockTake(stockTakeMap);

            galleryStockTake = galleryStockTake - stockTakeMap.get(artwork);
            System.out.println("Gallery Stock = " +  galleryStockTake);

            System.out.println("Customer Collection: ");
            System.out.println(customerCollection);
            System.out.println("Thank you for shopping with us! Would you like to purchase another?");


            if (artwork.equals("")) {
                break;
            }

        } else if (artwork.equals("painting2")) {

            user.purchaseArtwork(Artwork2.getPrice());
            gallery.soldArtwork(Artwork2.getPrice());
            System.out.println(user.getName() + " has " + user.getWallet() + " left in their wallet.");
            System.out.println("Money in till: " + gallery.getTill());
            String temp = String.valueOf(Artwork2);
            customerCollection.add(temp);
            galleryCollection.remove(String.valueOf(Artwork2));
            System.out.println("Remaining in Gallery Collection: ");
            System.out.println(galleryCollection);
            galleryStockTake = galleryStockTake - stockTakeMap.get(artwork);
            System.out.println("Gallery Stock = " +  galleryStockTake);
            System.out.println("Customer Collection: ");
            System.out.println(customerCollection);
            System.out.println("Thank you for shopping with us! Would you like to purchase another?");

          

            if (artwork.equals("")) {
                break;
            }

        } else if (artwork.equals("painting3")) {

            user.purchaseArtwork(Artwork3.getPrice());

            gallery.soldArtwork(Artwork3.getPrice());

            System.out.println(user.getName() + " has " + user.getWallet() + " left in their wallet.");
            System.out.println("Money in till: " + gallery.getTill());
            String temp = String.valueOf(Artwork3);
            customerCollection.add(temp);
            galleryCollection.remove(Artwork3);
            System.out.println("Remaining in Gallery Collection: ");
            System.out.println(galleryCollection);
            galleryStockTake = galleryStockTake - stockTakeMap.get(artwork);
            System.out.println("Gallery Stock = " +  galleryStockTake);
            System.out.println("Customer Collection: ");
            System.out.println(customerCollection);
            System.out.println("Thank you for shopping with us! Would you like to purchase another?");

            if (artwork.equals("")) {
                break;
            }

        } else if (artwork.equals("painting4")) {


            user.purchaseArtwork(Artwork4.getPrice());
            gallery.soldArtwork(Artwork4.getPrice());
            System.out.println(user.getName() + " has " + user.getWallet() + " left in their wallet.");
            System.out.println("Money in till: " + gallery.getTill());

            String temp = String.valueOf(Artwork4);
            customerCollection.add(temp);
            galleryCollection.remove(Artwork4);
            System.out.println("Remaining in Gallery Collection: ");
            System.out.println(galleryCollection);
            galleryStockTake = galleryStockTake - stockTakeMap.get(artwork);
            System.out.println("Gallery Stock = " +  galleryStockTake);
            System.out.println("Customer Collection: ");
            System.out.println(customerCollection);
            System.out.println("Thank you for shopping with us! Would you like to purchase another?");

            if (artwork.equals("")) {
                break;
            }

        } else if (artwork.equals("painting5")) {
            user.purchaseArtwork(Artwork5.getPrice());
            gallery.soldArtwork(Artwork5.getPrice());
            System.out.println(user.getName() + " has " + user.getWallet() + " left in their wallet.");
            System.out.println("Money in till: " + gallery.getTill());

            String temp = String.valueOf(Artwork5);
            customerCollection.add(temp);
            galleryCollection.remove(Artwork5);
            System.out.println("Remaining in Gallery Collection: ");
            System.out.println(galleryCollection);
            galleryStockTake = galleryStockTake - stockTakeMap.get(artwork);
            System.out.println("Gallery Stock = " +  galleryStockTake);
            System.out.println("Customer Collection: ");
            System.out.println(customerCollection);
            System.out.println("Thank you for shopping with us! Would you like to purchase another?");

            if (artwork.equals("")) {
                break;
            }

        } else if (artwork.equals("painting6")) {

            user.purchaseArtwork(Artwork6.getPrice());
            gallery.soldArtwork(Artwork6.getPrice());
            System.out.println(user.getName() + " has " + user.getWallet() + " left in their wallet.");
            System.out.println("Money in till: " + gallery.getTill());

            String temp = String.valueOf(Artwork6);
            customerCollection.add(temp);
            galleryCollection.remove(Artwork6);
            System.out.println("Remaining in Gallery Collection: ");
            System.out.println(galleryCollection);
            galleryStockTake = galleryStockTake - stockTakeMap.get(artwork);
            System.out.println("Gallery Stock = " +  galleryStockTake);
            System.out.println("Customer Collection: ");
            System.out.println(customerCollection);
            System.out.println("Thank you for shopping with us! Would you like to purchase another?");

            if (artwork.equals("")) {
                break;
            }

        } else {
            System.out.println("This artwork is not in stock!");

            System.out.println("Please Reselect!");

            if (artwork.equals("")) {
                break;
            }
        }
    }

    }

    private static ArrayList<Integer> setNft() {
        LinkedHashSet<Integer> nftSet = new LinkedHashSet<>();
        Random nft = new Random();
        while (nftSet.size() < 6) {
            nftSet.add(nft.nextInt(1000 - 0 + 1));
        }

        ArrayList<Integer> nftList = new ArrayList<>();
        nftList.addAll(nftSet);
        return nftList;
    }

}

//    A Gallery should have a name, a till and a collection of Artwork.
//    A piece of Artwork should have a title, an artist, a price and an nft.
//    An Artist should have a name and a collection of artwork (i.e a list of artwork they have personally made).
//    A Customer should have a name and a wallet.
//    A Customer should be able to buy an Artwork from the Gallery, reducing the money in their wallet and increasing the money in the Gallery till.
//





