package instruments;

import behaviours.IPlay;

public class Saxophone extends Instrument implements IPlay {

    private int numberOfReeds;

    public Saxophone(String type, String material, double buyingPrice, double sellingPrice, int numberOfReeds) {
        super(type, material, buyingPrice, sellingPrice);
        this.numberOfReeds = numberOfReeds;
    }

    public int getNumberOfReeds() {
        return numberOfReeds;
    }

    public String playInstrument() {
        return "Doo Doo Doo";
    }
}
