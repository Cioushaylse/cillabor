import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomAccessFileExample {
    public static void main(String[] args) {
        String filename = "data.txt";
        long initialOffset = 100; // Example initial offset

        try (RandomAccessFile raf = new RandomAccessFile(filename, "rw")) {
            // Seek to the initial offset
            raf.seek(initialOffset);

            // Write data
            String data = "New data to append\n";
            raf.writeBytes(data);
            
            System.out.println("Data appended successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
