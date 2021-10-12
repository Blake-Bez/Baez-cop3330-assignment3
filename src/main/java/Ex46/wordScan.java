package Ex46;

import java.util.Map;
import java.util.TreeMap;


public class wordScan {
    public static Object frequency(String fileContent) {
        {
            Map<String, Integer> mp = new TreeMap<>();

            String[] sep = fileContent.split(" ");

            for (String s : sep) {
                if (mp.containsKey(s)) {
                    mp.put(s, mp.get(s) + 1);
                } else {
                    mp.put(s, 1);
                }
            }

            for (Map.Entry<String, Integer> entry :
                    mp.entrySet()) {
                System.out.print(entry.getKey() +
                        ": ");
                for (int i = 0; i < entry.getValue(); i++) {
                    System.out.print("*");
                }

                System.out.print("\n\n");
            }
        }
        return null;
    }
}