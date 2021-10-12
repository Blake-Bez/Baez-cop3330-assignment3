package Ex43;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class website {
    public static Object websiteWriter(String siteName, String author, char js, char css){
        String webFile = System.getProperty("user.dir");
        webFile += "\\"+siteName;
        File website = new File(webFile);
        boolean websiteCreated = website.mkdir();

        if(websiteCreated) {
            System.out.println("Created " + webFile);
            try
            {
                FileWriter writer = new FileWriter(webFile +"\\index.html");
                writer.write("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n");
                writer.write("\t<meta author=\""+author+"\">\n");
                writer.write("\t<title>"+siteName+"</title>\n");
                writer.write("</head>\n<body>\n\n</body>\n</html>");
                writer.close();

                System.out.println("Created " + webFile +"\\index.html");

                if(js == 'y' || js == 'Y') {
                    File jsFile = new File(webFile +"\\js");
                    boolean jsbool = jsFile.mkdir();
                    if(jsbool)
                    {
                        System.out.println("Created " + jsFile+"\\");
                    }
                    else
                    {
                        System.out.println("Js folder is notcreated.");
                    }
                }
                if(css == 'y' || css == 'Y'){
                    File cssFile = new File(webFile +"\\css");
                    boolean cssbool = cssFile.mkdir();
                    if(cssbool)
                    {
                        System.out.println("Created " + cssFile+"\\");
                    }
                    else
                    {
                        System.out.println("CSS folder is not created.");
                    }
                }
            }
            catch(IOException e)
            {
                System.out.println("HTML file cannot be created.");
            }
        }
        else
        {
            System.out.println("Error. Website was not created.");
        }
        return null;
    }}