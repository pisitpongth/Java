package JavaTNI.LabSheet.LabSheet09.src;

public class BookMain {
    public static void main(String[] args) {
        Author author = new Author("Malee Aroina", "Thai");
        Book book = new Book("Java Programming", "Programming Language", 375.25, author);

        System.out.println("Author info: " + author.getName() + " (" + author.getNationality() + ")");
        System.out.println();
        System.out.println(book.showBookInfo());
    }
}
