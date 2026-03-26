public class Bakery {
    private String flavor;
    private double unitPrice;

    public Bakery(String flavor, double unitPrice) {
        this.flavor = flavor;
        this.unitPrice = unitPrice;
    }

    public Bakery() {
        this.flavor = "";
        this.unitPrice = 0;
    }

    public String getFlavor() {
        return flavor;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public String toString() {
        return "Thank you for your order!";
    }
}
