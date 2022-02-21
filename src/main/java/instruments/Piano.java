package instruments;

import instruments.Instrument;

public class Piano extends Instrument {

    private int numberOfPedals;

    public Piano(String type, String material, double buyingPrice, int numberOfPedals) {
        super(type, material, buyingPrice);
        this.numberOfPedals = numberOfPedals;
    }

    public int getNumberOfPedals() {
        return numberOfPedals;
    }

    public String playInstrument() {
        return "Piano sound";
    }
}
