package Ovningar;

public class Ovning9 {

    public static void main(String[] args) {

        //Skapa ett program för en cirkels radie. Cirkelns diameter, omkrets och area ska beräknas
        // och skrivas ut. (pi = 3.14).

        double pi = 3.14;
        double radie = 5;

        //Beräkna diameter
        double diameter = radie * 2;

        //Beräkna omkrets
        double omkrets = 2 * pi * radie;

        //Beräkna area
        double area = pi * radie * radie;

        System.out.println("Cirkelns diameter är: " + diameter);
        System.out.println("Cirkelns omkrets är: " + omkrets);
        System.out.println("Cirkelns area är: " + area);
    }
}
