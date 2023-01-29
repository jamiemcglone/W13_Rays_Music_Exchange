public abstract class Instrument implements IPlay, ISell {

    String brand;
    String materials;

    double buyingPrice;
    double sellingPrice;


    public Instrument(String brand, String materials, double buyingPrice, double sellingPrice) {
        this.brand = brand;
        this.materials = materials;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    @Override
    public double calculateMarkUp() {
        return sellingPrice - buyingPrice;
    }
    public String getBrand() {
        return this.brand;
    }

    public String getMaterials() {
        return this.materials;
    }

    public double getBuyingPrice() {
        return this.buyingPrice;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
}
