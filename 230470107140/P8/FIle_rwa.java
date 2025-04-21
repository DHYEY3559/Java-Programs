import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FIle_rwa {
    private static final String FILE_NAME = "sample.txt";

    public static void main(String[] args) {
        // Writing to the file
        writeToFile("Hello, this is the first line.\n");
        // Appending to the file
        appendToFile("This is an appended line.\n");
        // Reading from the file
        readFromFile();
        // Deleting from the file
        // deleteFile();
    }

    // Method to write to a file (overwrites existing content)
    public static void writeToFile(String content) {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            writer.write(content);
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    // Method to append data to the file
    public static void appendToFile(String content) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) { // 'true' enables appending
            writer.write(content);
            System.out.println("Data appended successfully.");
        } catch (IOException e) {
            System.err.println("Error appending to file: " + e.getMessage());
        }
    }

    // Method to read from the file
    public static void readFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("\nReading file content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    // Method to delete from the file
    /*
    public static void deleteFile() {
        try {
            File file = new File("example.txt");
            file.delete();
            Files.delete(Paths.get("sample.txt"));
            System.out.println("File deleted successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    */
}
