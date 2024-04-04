import java.io.InputStream;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//Qapalı saitlər: [ı], [i], [u], [ü]
//Açıq saitlər: [a], [e], [ə], [o], [ö]
        Scanner scanner = new Scanner(System.in);
        System.out.println("herf daxil edin");
        String herf=scanner.nextLine();
        System.out.println("aciq saitler");
        String aciq =scanner.nextLine();
        System.out.println("qapali saitler");
        String qapali=scanner.nextLine();
        String[] sait = {"a", "e", "ə", "ı", "i", "o", "u", "ö", "ü" };

        for (int i = 0; i < sait.length; i++)

        {

            switch (sait[i]) {


                    case "a", "e", "ə", "o", "ö" -> System.out.println("aciq saitler");
                    case "ı", "i", "u", "ü" -> System.out.println("qapali saitler");
            }

        }



    }
}