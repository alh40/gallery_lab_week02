package _pair_programming;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    while(true) {
        System.out.println("Enter Name here!, to break enter nothing");
        String name = input.nextLine();

        if(name.equals("")){
            System.out.println("Thank you for shopping!");
            break;
        }

        System.out.println("Hi " + name + " please enter balance here!");
        int num = Integer.valueOf(input.nextLine());


        ArrayList<String> alexCollection = new ArrayList<>();
        alexCollection.add("painting1");
        alexCollection.add("painting2");

        ArrayList<String> jamesCollection = new ArrayList<>();
        jamesCollection.add("painting2");
        jamesCollection.add("painting3");

        ArrayList<String> colinCollection = new ArrayList<>();
        colinCollection.add("painting3");
        colinCollection.add("painting4");

        Artist painter1 = new Artist("Alex", alexCollection);
        Artist painter2 = new Artist("James", jamesCollection);
        Artist painter3 = new Artist("Colin", colinCollection);

        Artwork Artwork1 = new Artwork(alexCollection.get(0), "Alex", 100.0, 1);
        Artwork Artwork2 = new Artwork(alexCollection.get(1), "Alex", 200.0, 2);
        Artwork Artwork3 = new Artwork(jamesCollection.get(0), "James", 300.0, 3);
        Artwork Artwork4 = new Artwork(jamesCollection.get(1), "James", 400.0, 4);
        Artwork Artwork5 = new Artwork(colinCollection.get(0), "Colin", 500.0, 5);
        Artwork Artwork6 = new Artwork(colinCollection.get(1), "Colin", 600.0, 6);

        ArrayList<String> galleryCollection = new ArrayList<>();
        galleryCollection.add(String.valueOf(Artwork1));
        galleryCollection.add(String.valueOf(Artwork2));
        galleryCollection.add(String.valueOf(Artwork3));
        galleryCollection.add(String.valueOf(Artwork4));
        galleryCollection.add(String.valueOf(Artwork5));
        galleryCollection.add(String.valueOf(Artwork6));

        Gallery gallery = new Gallery("gallery", 500.0, galleryCollection);

        System.out.println(gallery.getCollection());

        Customer user = new Customer(name, num);

        user.purchaseArtwork(Artwork6.getPrice());

        gallery.soldArtwork(Artwork6.getPrice());

        System.out.println(user.getName() + " has " + user.getWallet() + " left in their wallet.");

        System.out.println("Money in till: " + gallery.getTill());
    }

        }

//    A Gallery should have a name, a till and a collection of Artwork.
//    A piece of Artwork should have a title, an artist, a price and an nft.
//    An Artist should have a name and a collection of artwork (i.e a list of artwork they have personally made).
//    A Customer should have a name and a wallet.
//    A Customer should be able to buy an Artwork from the Gallery, reducing the money in their wallet and increasing the money in the Gallery till.
//




}
