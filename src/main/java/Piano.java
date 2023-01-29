public class Piano extends Instrument{

    int keys;
    String size;

    public Piano(int keys, String size, String brand, String materials, double buyingPrice, double sellingPrice) {
        super(brand, materials, buyingPrice, sellingPrice);
        this.keys = keys;
        this.size = size;
    }

    public String playInstrument() {
        return "Ding ding I have keys";
    }
}
