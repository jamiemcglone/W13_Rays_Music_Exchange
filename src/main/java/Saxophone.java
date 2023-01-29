public class Saxophone extends Instrument{

    int valves;
    String key;
    String name;

    public Saxophone(int valves, String key, String name, String brand, String materials, double buyingPrice, double sellingPrice) {
        super(brand, materials, buyingPrice, sellingPrice);
        this.valves = valves;
        this.key = key;
        this.name = name;
    }

    public String playInstrument() {
        return "Beep boop I am a saxophone";
    }
}
