package instruments;

public abstract class Instrument {

    private String type;
    private String material;
    private double buyingPrice;

    public Instrument(String type, String material, double buyingPrice){

    this.type = type;
    this.material = material;
    this.buyingPrice = buyingPrice;

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

}
