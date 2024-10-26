package Ovningar;


public class Ovning3 {
    public static void main(String[] args) {
        /*   Skapa ett program som läser in antal timmar, beräknar och skriver ut
        hur mycket det blir omvandlat till minuter resp sekunder.
         */

        int timmar = 2;
        int minuter = timmar * 60;
        int sekunder = timmar * 3600;

        System.out.println(timmar + " timmar är " + minuter + " minuter.");
        System.out.println(timmar + " timmar är " + sekunder + " sekunder.");
         }
    }


