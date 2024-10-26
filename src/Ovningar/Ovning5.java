package Ovningar;

public class Ovning5 {

    public static void main(String[] args) {


        // Skriv in ett heltal motsvarande svenska kronor och skriv ut motsvarande värde i pund
        //respektive dollar. Antag att kursen är : 1 dollar = 6 kr, 1 pund = 10 kr.

        int kronor = 25000;
        double dollarRate = 6.0;
        double pundRate = 10.0;

        double dollars = kronor / dollarRate;
        double pounds = kronor / pundRate;

        System.out.println(kronor + " svenska kronor motsvarar:");
        System.out.println(dollars + " dollar");
        System.out.println(pounds + " pund");


    }




}
