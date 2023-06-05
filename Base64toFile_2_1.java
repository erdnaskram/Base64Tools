import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

public class Base64toFile_2_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Geben Sie den Dateipfad und -namen ein: ");
        String filePath = reader.readLine().trim();
        if (filePath.startsWith("\"") && filePath.endsWith("\"")) {
            filePath = filePath.substring(1, filePath.length() - 1);
        }

        System.out.print("Geben Sie den Dateityp ein (z.B. .zip): ");
        String fileType = reader.readLine().trim();

        String base64String = new String(Files.readAllBytes(Paths.get(filePath)));
        byte[] decodedBytes = Base64.getDecoder().decode(base64String);

        String fileName = filePath.endsWith(".txt") ? filePath.substring(0, filePath.length() - 4) : filePath;
        Path decodedFilePath = Paths.get(fileName + fileType);
        int count = 1;
        while (Files.exists(decodedFilePath)) {
            decodedFilePath = Paths.get(fileName + "_" + count + fileType);
            count++;
        }

        Files.write(decodedFilePath, decodedBytes);
        System.out.println("Die Datei wurde erfolgreich dekodiert und als \u001B[34m" + decodedFilePath + "\u001B[0m gespeichert.");
    }
}