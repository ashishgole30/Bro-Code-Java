import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles {
    public static void main(String[] args) {

        // How to read a file using java (3 Popular options)

        // BufferedReader + FileReader: Best for reading text files line by line
        // FileInputStream: Best for binary files (Deg images , audio files)
        // RandomAccessFile : Best for read/write specific portions of a large file

        String filepath = "D:\\Computer Science\\Java\\Bro Code Java\\Bro Code Java 14\\testthree.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filepath));) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not located");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
    }
}
