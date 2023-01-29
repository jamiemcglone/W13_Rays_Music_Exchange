import java.lang.reflect.Array;
import java.util.ArrayList;

public class Guitar extends Instrument{


    int numOfStrings;
    ArrayList<String> pickups;

    public Guitar(int numOfStrings, ArrayList<String> pickups, String brand, String materials, double buyingPrice, double sellingPrice) {
        super(brand, materials, buyingPrice, sellingPrice);
        this.numOfStrings = numOfStrings;
        this.pickups = pickups;
        this.brand = brand;
    }

    public String playInstrument(){
        return "Di di do I have strings";
    }

    public int getNumOfPickups(){
        return this.pickups.size();
    }
}
