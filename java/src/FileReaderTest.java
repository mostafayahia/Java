import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReaderTest {
    public static void main(String[] args) {
        Path filePath = Path.of("../../java-00.md"); // Replace with your file path
        try {
            String content = Files.readString(filePath);
            System.out.println("File Content:\n" + content);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}