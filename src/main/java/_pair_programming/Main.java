package _pair_programming;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    while(true) {
        System.out.println("Enter Name here!, to break enter nothing");
        String name = input.nextLine();

        if (name.equals("")) {
            System.out.println("Thank you for shopping!");
            break;
        }

        System.out.println("Hi " + name + " please enter balance here!");
        int num = Integer.valueOf(input.nextLine());

        System.out.println("Artwork available: ");


        LinkedHashSet<Integer> nftSet = new LinkedHashSet<>();
        Random nft = new Random();
        while (nftSet.size() < 6) {
            nftSet.add(nft.nextInt());
        }

        ArrayList<Integer> nftList = new ArrayList<>();
        nftList.addAll(nftSet);


        ArrayList<String> alexCollection = new ArrayList<>();
        alexCollection.add("painting1");
        alexCollection.add("painting2");

        ArrayList<String> jamesCollection = new ArrayList<>();
        jamesCollection.add("painting2");
        jamesCollection.add("painting3");

        ArrayList<String> bankCollection = new ArrayList<>();
        bankCollection.add("painting3");
        bankCollection.add("painting4");

        Artist painter1 = new Artist("Alex", alexCollection);
        Artist painter2 = new Artist("James", jamesCollection);
        Artist painter3 = new Artist("Colin", bankCollection);

        Artwork Artwork1 = new Artwork(alexCollection.get(0), "Alex", 100.0, nftList.get(0));
        Artwork Artwork2 = new Artwork(alexCollection.get(1), "Alex", 200.0, nftList.get(1));
        Artwork Artwork3 = new Artwork(jamesCollection.get(0), "James", 300.0, nftList.get(2));
        Artwork Artwork4 = new Artwork(jamesCollection.get(1), "James", 400.0, nftList.get(3));
        Artwork Artwork5 = new Artwork(bankCollection.get(0), "Bank", 500.0, nftList.get(4));
        Artwork Artwork6 = new Artwork(bankCollection.get(1), "Bank", 600.0, nftList.get(5));

        ArrayList<String> galleryCollection = new ArrayList<>();
        galleryCollection.add(String.valueOf(Artwork1));
        galleryCollection.add(String.valueOf(Artwork2));
        galleryCollection.add(String.valueOf(Artwork3));
        galleryCollection.add(String.valueOf(Artwork4));
        galleryCollection.add(String.valueOf(Artwork5));
        galleryCollection.add(String.valueOf(Artwork6));

        Gallery gallery = new Gallery("gallery", 500.0, galleryCollection);

        ArrayList<String> customerCollection = new ArrayList<>();

        System.out.println(galleryCollection);

        while(true){

        System.out.println("Please select the Artwork you want to purchase!");
        String artwork = input.nextLine();


        Customer user = new Customer(name, num);

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

            String temp = String.valueOf(Artwork3);
            customerCollection.add(temp);
            galleryCollection.remove(String.valueOf(Artwork3));
            System.out.println("Remaining in Gallery Collection: ");
            System.out.println(galleryCollection);
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
            galleryCollection.remove(String.valueOf(Artwork4));
            System.out.println("Remaining in Gallery Collection: ");
            System.out.println(galleryCollection);
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
            galleryCollection.remove(String.valueOf(Artwork5));
            System.out.println("Remaining in Gallery Collection: ");
            System.out.println(galleryCollection);
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
            galleryCollection.remove(String.valueOf(Artwork6));
            System.out.println("Remaining in Gallery Collection: ");
            System.out.println(galleryCollection);
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

        }

//    A Gallery should have a name, a till and a collection of Artwork.
//    A piece of Artwork should have a title, an artist, a price and an nft.
//    An Artist should have a name and a collection of artwork (i.e a list of artwork they have personally made).
//    A Customer should have a name and a wallet.
//    A Customer should be able to buy an Artwork from the Gallery, reducing the money in their wallet and increasing the money in the Gallery till.
//




}
