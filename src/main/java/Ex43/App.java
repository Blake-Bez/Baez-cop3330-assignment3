package Ex43;

import java.util.Scanner;
import static Ex43.website.websiteWriter;

public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String author, name;
        char js, css;
        System.out.print("Site name? ");
        name = input.nextLine();
        System.out.print("Author? ");
        author = input.nextLine();
        System.out.print("Do you want a folder for JavaScript? ");
        js = input.next().charAt(0);
        System.out.print("Do you want a folder for CSS? ");
        css = input.next().charAt(0);

        websiteWriter(name, author, js, css);

        input.close();
    }
}
