public class SheetMusic implements ISell {

    String artist;
    String album;
    double buyingPrice;
    double sellingPrice;

    public SheetMusic(String artist, String album, double buyingPrice, double sellingPrice) {
        this.artist = artist;
        this.album = album;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public double calculateMarkUp(){
        return sellingPrice - buyingPrice;
    }

}
