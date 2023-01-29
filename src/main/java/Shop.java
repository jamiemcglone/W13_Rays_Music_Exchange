import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;
    private String name;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public void addToStock(ISell item){
        this.stock.add(item);
    }

    public void removeFromStock(ISell item){
        int itemToRemove = this.stock.indexOf(item);
        this.stock.remove(itemToRemove);
    }

    public int getStockCount(){
        return this.stock.size();
    }

    public double calculateTotalProfit(){
        double totalProfit = 0;
        for (ISell item : this.stock){
            totalProfit += item.calculateMarkUp();
        }
        return totalProfit;
    }
}
