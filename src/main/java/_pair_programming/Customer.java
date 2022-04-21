package _pair_programming;
import java.util.ArrayList;
public class Customer {

//    private means that the variable can only be used within the Customer class ONLY.
    private String name;
    private double wallet;

//    Constructor
    public Customer(String customerName, double customerWallet){
        this.name = customerName;
        this.wallet = customerWallet;
    }

    public String getName() {
        return name;
    }

    public double getWallet() {
        return wallet;
    }

    public void purchaseArtwork(double amount){

        if(this.wallet <= 0){
            System.out.println("Insufficient funds, go get a job!");
        }
        this.wallet -= amount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", wallet=" + wallet +
                '}';
    }
//    A Customer should have a name and a wallet.
//    A Customer should be able to buy an Artwork from the Gallery, reducing the money in their wallet and increasing the money in the Gallery till.
//

}
