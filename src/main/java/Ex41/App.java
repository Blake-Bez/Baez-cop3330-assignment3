package Ex41;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        File inText = new File("src/main/java/Ex41/Ex41_input.txt");
        File outText = new File("src/main/java/Ex41/Ex41_output.txt");
        ArrayList<name> data = new ArrayList<name>();
        data = readInput(inText);
        data = sortNames(data);
        String statement = nameFormat(data);
        printInformation(outText, statement);
    }

    public static ArrayList<name> readInput(File inText){
        ArrayList<name> data = new ArrayList<name>();
        try {
            Scanner input = new Scanner(inText);
            while (input.hasNextLine()) {
                String last = input.next();
                String first = input.next();
                name myPerson = new name(first, last);
                data.add(data.size(), myPerson);
            }
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return data;
    }

    public static ArrayList<name> sortNames(ArrayList<name> data) {
        ArrayList<name> newList = new ArrayList<name>();
        int Ind;
        int length = data.size();

        for (int i = 0; i < length; i++) {
            Ind = 0;

            for (int j = 1; j < data.size(); j++) {
                if (data.get(j).getLastName().compareTo(data.get(Ind).getLastName()) < 0) {
                    Ind = j;
                } else if(data.get(j).getLastName().compareTo(data.get(Ind).getLastName()) == 0){
                    if(data.get(j).getFirstName().compareTo(data.get(Ind).getFirstName()) < 0){
                        Ind = j;
                    }
                }
            }
            newList.add(i, data.get(Ind));
            data.remove(Ind);
        }
        return newList;
    }
    public static void printInformation(File outText, String statement){
        try {
            FileWriter myWriter = new FileWriter(outText);
            myWriter.write(statement);
            myWriter.close();
            System.out.println("file written successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred!");
            e.printStackTrace();
        }
    }

    public static String nameFormat(ArrayList<name> data) {
        String statement;
        statement = "Total of " + data.size() + " names";
        statement += "\n-----------------";

        for (int i = 0; i < data.size(); i++) {

            String first = data.get(i).getFirstName();
            String last = data.get(i).getLastName();

            statement += "\n" + last + " " + first;
        }

        return statement;
    }
}