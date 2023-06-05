import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

public class FiletoBase64 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Geben Sie den Dateipfad und -namen ein: ");
        String filePath = reader.readLine().trim();
        if (filePath.startsWith("\"") && filePath.endsWith("\"")) {
            filePath = filePath.substring(1, filePath.length() - 1);
        }

        byte[] fileBytes = Files.readAllBytes(Paths.get(filePath));
        String base64String = Base64.getEncoder().encodeToString(fileBytes);

        String txtFileName = filePath.endsWith(".zip") ? filePath.substring(0, filePath.length() - 4) : filePath;
        Path txtFilePath = Paths.get(txtFileName + ".txt");
        int count = 1;
        while (Files.exists(txtFilePath)) {
            txtFilePath = Paths.get(txtFileName + "_" + count + ".txt");
            count++;
        }

        Files.write(txtFilePath, base64String.getBytes());
        System.out.println("Die Datei wurde erfolgreich kodiert und als \u001B[34m" + txtFilePath + "\u001B[0m gespeichert.");
    }
}