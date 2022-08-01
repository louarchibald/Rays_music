package instruments;

import enums.InstrumentType;

public class Tuba extends Instrument {

    private int noOfValves;

    public Tuba(String material, String colour, int buyPrice, int sellPrice, InstrumentType type, int noOfValves) {
        super(material, colour, buyPrice, sellPrice, type);
        this.noOfValves = noOfValves;
    }

    public int getNoOfValves() {
        return noOfValves;
    }

    public void setNoOfValves(int noOfValves) {
        this.noOfValves = noOfValves;
    }
}
