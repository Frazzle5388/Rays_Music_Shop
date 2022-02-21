package instruments;

import behaviours.IPlay;

public class Guitar extends Instrument implements IPlay {

    private int numberOfStrings;

    public Guitar(String type, String material, double buyingPrice, double sellingPrice, int numberOfStrings) {
        super(type, material, buyingPrice, sellingPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String playInstrument() {
        return "Pluck";
    }
}
