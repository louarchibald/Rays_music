package instruments;

import enums.InstrumentType;
import enums.SaxVariant;

public class Saxophone extends Instrument {

    private int noOfValves;
    private SaxVariant saxVariant;

    public Saxophone(String material, String colour, int buyPrice, int sellPrice, InstrumentType type, int noOfValves, SaxVariant saxVariant) {
        super(material, colour, buyPrice, sellPrice, type);
        this.noOfValves = noOfValves;
        this.saxVariant = saxVariant;
    }

    public int getNoOfValves() {
        return noOfValves;
    }

    public void setNoOfValves(int noOfValves) {
        this.noOfValves = noOfValves;
    }

    public SaxVariant getSaxVariant() {
        return saxVariant;
    }

    public void setSaxVariant(SaxVariant saxVariant) {
        this.saxVariant = saxVariant;
    }

}
