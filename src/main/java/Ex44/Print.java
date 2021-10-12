package Ex44;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;



public class Print {
    public static int Scan(String input, JSONArray subjects) {
        int count = 0;

        for (Object subject : subjects) {
            JSONObject json = (JSONObject) subject; //Will search through JSON object.
            String name = (String) json.get("name");

            if (input.equalsIgnoreCase(name)) {
                System.out.println("Name: " + name);
                System.out.println("Price: " + json.get("price"));
                System.out.println("Quantity: " + json.get("quantity"));
                count = 1;
                break;
            }
        }
        return count;
    }
}
