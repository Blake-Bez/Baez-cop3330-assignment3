package Ex42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static Ex42.Data.dataPrint;


public class App {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inText = new Scanner(new File("src/main/java/Ex42/Ex42_input.txt"));

        System.out.printf("%-20s%-20s%-20s\n", "Last", "First", "Salary");
        System.out.println("-------------------------------------------------");

        try{
            dataPrint(inText);
        }

        catch (Exception e) { //Exception case.
            System.out.println("Error, file not found!");
        }

        inText.close();
    }
}