package JavaTNI.LabSheet.LabSheet09.src;

import javax.swing.JOptionPane;

public class BookMain2 {
    private static Author author;

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter the author's name:");
        int choice = JOptionPane.showConfirmDialog(null,
                "Do you prefer to publish your nationality and birth year?",
                "Select an option",
                JOptionPane.YES_NO_CANCEL_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            String nationality = JOptionPane.showInputDialog("Enter the author's nationality:");
            int birthYear = Integer.parseInt(JOptionPane.showInputDialog("Enter the author's birth year:"));
            author = new Author(name, nationality, birthYear);
        } else {
            author = new Author(name);
        }
        JOptionPane.showMessageDialog(null,
                "Author's info: " + author.showAuthorInfo());
        String title = JOptionPane.showInputDialog("Enter the book's title:");
        String category = JOptionPane.showInputDialog("Enter the book's category:");
        double price = Double.parseDouble(JOptionPane.showInputDialog("Enter the book's price:"));
        Book book = new Book(title, category, price, author);
        JOptionPane.showMessageDialog(null, book.showBookInfo());
    }
}
