package Ovningar;

public class Ovning2 {
    public static void main(String[] args) {
        /*En försäljare har delvis prestationslön. Han får 8000 kr per månad
        i grundlön och 9% av försäljningssumman. Skapa ett program som beräknar
        lönesumman under en period.
        */

        //Deklarera variabler
        double manadslon = 8000;
        double forsaljning = 50000;
        double provision = 0.09; //Provision i procent (9%)

        System.out.println("Den totala lönen för månaden är: " + (manadslon + (forsaljning * provision)) + " kronor");



    }
}
