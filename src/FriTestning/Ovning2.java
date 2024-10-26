package FriTestning;

public class Ovning2 {

    public static void main(String[] args) {

        // En försäljare har delvis prestationslön. Han får 8000 kr per månad i grundlön och 9% av
        //försäljningssumman. Skapa ett program som beräknar lönesumman under en period.

        int monthlysalary = 8000;
        int salesamount = 100000;
        double percent = 0.09;

        System.out.println();
        System.out.println("The total payment for this month is: " + (monthlysalary + (percent * salesamount)) + " kronor");


    }
}


