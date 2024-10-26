package FriTestning;

public class Exercise2 {

    public static void main(String[] args) {

        /*Jämför två tal. Om det första är större än det andra
        skriv ut "Första talet är störst", samt "andra talet
        är störst om det är tvärt om
         */

        int number1 = 21;
        int number2 = 7;

        if (number1 > number2) {
            System.out.println("number1 is bigger than number2");
        } else if (number2 > number1) {
            System.out.println("number2 is bigger than number1");
        }


    /* Jämför två tal. Om det första är jämt delbart med det andra
        skriv ut "Jämt delbart", annars skriv ut "Inte jämt delbart"
         */

        System.out.println();

        if (number1 % number2 == 0) {
            System.out.println("Jämt delbart");
        } else {
            System.out.println("Inte jämt delbart");
        }
    }
}


