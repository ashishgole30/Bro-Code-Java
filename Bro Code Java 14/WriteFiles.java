import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {
    public static void main(String[] args) {
        // How to write a file using java ( 4 Popular options)

        // FileWriter = Good for small or medium sized text files
        // BUfferedWriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data , like reports or logs
        // FiledOutputStream = Best for binary files (eg images , audio files)

        // FileWriter
        // If no path is mentioned the file goes to source folder
        // You can also use an Absolute path

        try (FileWriter writer = new FileWriter("testone.txt");) {
            writer.write("Hello");
            System.out.println("File one has been written");
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate file location");
        } catch (IOException e) {
            System.out.println("Could not write file");
        }

        // Another way of doing this is:
        String filename = "testtwo.txt";
        String textContent = "File two has been written";
        try (
                FileWriter writer = new FileWriter(filename);) {
            writer.write("Hello");
            System.out.println(textContent);
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate file location");
        } catch (IOException e) {
            System.out.println("Could not write file");
        }
    }
}