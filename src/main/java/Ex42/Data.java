package Ex42;

import java.util.Scanner;

/*
{
Print function:
    Takes input data.
    Loops through each data line.
    Reads, organizes, spaces out and prints out data on console.
}
*/

public class Data {
    public static Object dataPrint(Scanner input) {

        while (input.hasNextLine()) {
            String s = input.nextLine();
            String[] temp = s.split(",");
            System.out.printf("%-20s%-20s%-20s\n", temp[0], temp[1], temp[2]);
        }
        return null;
    }
}
