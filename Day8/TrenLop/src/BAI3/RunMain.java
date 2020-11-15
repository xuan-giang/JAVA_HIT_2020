package BAI3;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(Paths.get("thuan.txt"));
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
        }
         catch (IOException e) {
            e.printStackTrace();
        }


    }
}
