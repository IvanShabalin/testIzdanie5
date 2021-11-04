import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SomeClassName {
    public static void main(String[] args) throws IOException {
        Scanner scannerName = new Scanner(new File("Text.txt"));

        scannerName.nextLine();
        scannerName.nextLine();
        scannerName.next();
        scannerName.nextLine();
    }
}
