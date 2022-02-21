package instruments;

import instruments.Instrument;

public class Piano extends Instrument {

    private int numberOfPedals;

    public Piano(String type, String material, double buyingPrice, double sellingPrice, int numberOfPedals) {
        super(type, material, buyingPrice, sellingPrice);
        this.numberOfPedals = numberOfPedals;
    }

    public int getNumberOfPedals() {
        return numberOfPedals;
    }

    public String playInstrument() {
        return "Piano sound";
    }
}
