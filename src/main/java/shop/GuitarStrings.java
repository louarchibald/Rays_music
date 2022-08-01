package shop;

public class GuitarStrings extends Item {

    private String gauge;
    private String material;

    public GuitarStrings(int buyPrice, int sellPrice, String gauge, String material) {
        super(buyPrice, sellPrice);
        this.gauge = gauge;
        this.material = material;
    }

    public String getGauge() {
        return gauge;
    }

    public void setGauge(String gauge) {
        this.gauge = gauge;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
