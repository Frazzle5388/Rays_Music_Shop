package instruments;

import behaviours.ISell;

public abstract class Instrument implements ISell {

    private String type;
    private String material;
    private double buyingPrice;
    private double sellingPrice;


    public Instrument(String type, String material, double buyingPrice, double sellingPrice){

    this.type = type;
    this.material = material;
    this.buyingPrice = buyingPrice;
    this.sellingPrice = sellingPrice;

    }

    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double calculateMarkUp() {
        return this.sellingPrice - this.buyingPrice;
    }

}
