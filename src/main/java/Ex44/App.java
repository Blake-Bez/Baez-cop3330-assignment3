package Ex44;

import java.io.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import static Ex44.Print.Scan;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        JSONParser parser = new JSONParser();
        try {
            String input;

            Object obj = parser.parse(new FileReader("src/main/java/Ex44/Ex44_input.json"));

            JSONObject jsonObject = (JSONObject)obj;
            JSONArray subjects = (JSONArray)jsonObject.get("products");

            BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
            int x;

            do {
                System.out.print("What is the product name? ");
                input = buff.readLine();
                x = Scan(input, subjects);
                if (x == 0) {
                    System.out.print("Sorry, that product was not found in our inventory.\n");
                }
            }
            while (x != 1);


        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}