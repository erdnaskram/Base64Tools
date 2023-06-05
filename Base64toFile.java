import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class Base64toFile {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println("Usage: java Base64Decoder <file>");
            System.exit(1);
        }

        String filePath = args[0];
        String base64String = new String(Files.readAllBytes(Paths.get(filePath)));
        byte[] decodedBytes = Base64.getDecoder().decode(base64String);
        Files.write(Paths.get(filePath + ".zip"), decodedBytes);
    }
}