public class GuitarStrings implements ISell {

    int sets;
    int gauge;

    double buyingPrice;
    double sellingPrice;

    public GuitarStrings(int sets, int gauge, double buyingPrice, double sellingPrice) {
        this.sets = sets;
        this.gauge = gauge;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public double calculateMarkUp() {
        return sellingPrice - buyingPrice;
    }
}
