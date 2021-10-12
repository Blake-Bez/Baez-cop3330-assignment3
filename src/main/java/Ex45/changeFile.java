package Ex45;

import java.io.FileWriter;
import java.io.IOException;



public class changeFile {
    public static void editedFileOutput(String output_file_name, String contents) throws IOException {

        FileWriter output = new FileWriter(output_file_name);

        contents = contents.replaceAll("utilize", "use");

        output.write(contents);

        output.close();
    }

}