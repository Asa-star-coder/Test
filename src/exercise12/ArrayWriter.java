package exercise12;

import java.util.Scanner;

public class ArrayWriter {

    public static void main(String[] args) {
        // Skapa ett program som läser in fem namn ifrån terminalen
        Scanner scan = new Scanner(System.in);
        String[] names = new String[5];

        //och sparar dem i en array
        for(int i=0;i< names.length;i++) {
            names[i] = scan.nextLine();

        }
        // Skriv ut det första och sista namnet

        System.out.println(names[0]);
        System.out.println(names[names.length-1]);

    }
}
