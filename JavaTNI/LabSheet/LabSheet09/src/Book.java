package JavaTNI.LabSheet.LabSheet09.src;

public class Book {
    private String title;
    private String category;
    private double price;
    private int discount_percent;
    private Author author;

    public Book(String title, String category, double price, Author author) {
        this.title = title;
        this.category = category;
        this.price = price;
        this.author = author;
    }

    public Book(String title, String category, double price) {
        this.title = title;
        this.category = category;
        this.price = price;
        this.author = new Author();
    }

    public Book() {
        this.title = "Unknown";
        this.category = "Unknown";
        this.price = 0.0;
        this.author = new Author();
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setDiscountPercent(int discount_percent) {
        this.discount_percent = discount_percent;
    }

    public int getDiscountPercent() {
        return discount_percent;
    }

    public boolean isDiscounted() {
        if (this.price == 500) {
            return true;
        }
        return false;
    }

    public double calculateDiscountedPrice() {
        if (isDiscounted()) {
            return price - (price * discount_percent / 100);
        }
        return price;
    }

    public String showBookInfo() {
        return "Title       : " + title +
                "\nCategory    : " + category +
                "\nPrice       : " + (isDiscounted() ? calculateDiscountedPrice() : price) +
                "\nAuthor      : " + author.showAuthorInfo();
    }
}