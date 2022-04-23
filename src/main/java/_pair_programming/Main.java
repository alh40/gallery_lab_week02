package _pair_programming;
import java.util.*;

public class Main {
    private static String selectArtwork(Scanner input) {
        System.out.println("Please select the Artwork you want to purchase!");
        String artwork = input.nextLine();
        return artwork;
    }
    private static void defaultElse() {
        System.out.println("This artwork is not in stock!");
        System.out.println("Please Reselect!");
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

        ArrayList<Artwork> galleryList = Gallery.createList();

        Gallery gallery = Gallery.setGallery(galleryList);

        ArrayList<String> customerCollection = new ArrayList<>();
        HashMap<String, Double> stockTakeMap = Gallery.getStringDoubleHashMap(gallery);

        System.out.println(galleryList);

        double galleryStockTake = gallery.stockTake(stockTakeMap);
        System.out.println(galleryStockTake);

        Customer user = new Customer(name, num);

        while(galleryStockTake > 0){

            String artwork = selectArtwork(input);

            if (artwork.equals("painting1")) {

                galleryStockTake = Customer.ifPainting1(galleryList.get(0),  galleryList, gallery, customerCollection, stockTakeMap, galleryStockTake, user, artwork);

                if (artwork.equals("")) {
                break;
            }

        } else if (artwork.equals("painting2")) {

                galleryStockTake = Customer.ifPainting2(galleryList.get(1), galleryList, gallery, customerCollection, stockTakeMap, galleryStockTake, user, artwork);
                if (artwork.equals("")) {
                break;
            }

        } else if (artwork.equals("painting3")) {

                galleryStockTake = Customer.ifPainting3(galleryList.get(2), galleryList, gallery, customerCollection, stockTakeMap, galleryStockTake, user, artwork);
                if (artwork.equals("")) {
                break;
            }

        } else if (artwork.equals("painting4")) {

                galleryStockTake = Customer.ifPainting4(galleryList.get(3), galleryList, gallery, customerCollection, stockTakeMap, galleryStockTake, user, artwork);
                if (artwork.equals("")) {
                break;
            }

        } else if (artwork.equals("painting5")) {

                galleryStockTake = Customer.ifPainting5(galleryList.get(4), galleryList, gallery, customerCollection, stockTakeMap, galleryStockTake, user, artwork);
                if (artwork.equals("")) {
                    break;
            }

        } else if (artwork.equals("painting6")) {

                galleryStockTake = Customer.ifPainting6(galleryList.get(5), galleryList, gallery, customerCollection, stockTakeMap, galleryStockTake, user, artwork);
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

}





