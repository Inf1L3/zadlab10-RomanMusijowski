package pl.edu.ur.oopl10;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        //Zad 4
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(21) - 10;
        int b = scanner.nextInt(21) - 10;

        try {
            int wynik = a / b;
            System.out.println(wynik);
        } catch (ArithmeticException e) {
            System.out.println("~~~~~~~dzielenie przez 0 !!!");
        }


        //Zad 5
//        WprowadzZKonsoli wprowadz = new WprowadzZKonsoli();
//        wprowadz.wprowadzInt();
//

    }
}
