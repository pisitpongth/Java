public class CupCake extends Bakery {
    private int piece;

    public CupCake(int piece, String flavor, double unitPrice) {
        super(flavor, unitPrice);
        this.piece = piece;
    }

    public boolean isPackingBox() {
        if (getBoxNumber() >= 1) {
            return true;
        }
        return false;
    }

    public int getBoxNumber() {
        return this.piece / 6;
    }

    public int getBagNumber() {
        return this.piece % 6;
    }

    public String toString() {
        return super.toString() +
                "\nCupCake (" + getFlavor() + ") with " + (isPackingBox() ? getBoxNumber() + " Box " : "") + getBagNumber() + " Bag" +
                "\nTotal price of Cup Cake = " + (getUnitPrice() * piece);
    }
}
