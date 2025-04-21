import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String toCSV() {
        return String.format("%s,%s,%.2f", title, author, price);
    }
}

public class BookCSVExporter {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99));
        books.add(new Book("1984", "George Orwell", 8.99));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 12.49));

        String filePath = "books.csv";
        exportToCSV(books, filePath);
    }

    public static void exportToCSV(List<Book> books, String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.append("Title,Author,Price\n"); // CSV Header
            for (Book book : books) {
                writer.append(book.toCSV()).append("\n");
            }
            System.out.println("Book data exported successfully to: " + filePath);
        } catch (IOException e) {
            System.err.println("Error writing to CSV file: " + e.getMessage());
        }
    }
}
