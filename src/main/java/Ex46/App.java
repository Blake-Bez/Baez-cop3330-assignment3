package Ex46;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import static Ex46.wordScan.frequency;
import static Ex46.fileConverter.readFile;



public class App {
    public static void main(String[] args) {

        String filePath = "src/main/java/Ex42/Ex42_input.txt";

        String file = null;

        try {
            file = readFile(filePath, StandardCharsets.UTF_8);
            file = file.replaceAll("(\\r\\n\\t)", " ");
            file = file.replaceAll("\\s+"," ").trim();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        assert file != null;

        frequency(file);
    }

}