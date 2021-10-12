package Ex45;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static Ex45.changeFile.editedFileOutput;

public class App {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner (System.in);
        System.out.print("Desired output file name: ");
        String outputFile = input.nextLine();

        Scanner inputFile = new Scanner(new File("src/main/java/Ex45/Ex45_input.txt"));
        String text;

        StringBuilder string = new StringBuilder();
        while (inputFile.hasNextLine()) {
            text = inputFile.nextLine();
            string.append("\n").append(text);
        }
        String lesson = string.toString();

        editedFileOutput(outputFile, lesson);

        inputFile.close();
    }
}