package Ex46;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

public class fileConverter {
    public static String readFile(String path, Charset encoding) throws IOException
    {
        String text;
        try (Scanner scanner = new Scanner(new File(path), String.valueOf(encoding))) {
            text = scanner.useDelimiter("\\A").next();
        }

        return text;
    }
}