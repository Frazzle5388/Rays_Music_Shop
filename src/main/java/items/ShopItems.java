package items;

import behaviours.ISell;

public abstract class ShopItems implements ISell {

    private String type;
    private double buyingPrice;
    private double sellingPrice;

    public ShopItems(String type, double buyingPrice, double sellingPrice) {
        this.type = type;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public double calculateMarkUp() {
        return this.buyingPrice - this.sellingPrice;
    }
}
