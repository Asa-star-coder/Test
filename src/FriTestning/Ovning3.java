package FriTestning;

public class Ovning3 {

    public static void main(String[] args) {

        //  Skapa ett program som läser in antal timmar, beräknar och skriver ut hur mycket det
        //blir omvandlat till minuter resp sekunder.

        int timmar = 1;
        int minuter = 60;
        int sekunder = 3600;

        int arbetstimmar = 40;

        System.out.println();
        System.out.println("Denna vecka har jag arbetat: " + arbetstimmar + " timmar");
        System.out.println("Omvandlat till minuter blir det: " + (arbetstimmar * minuter) + " minuter");
        System.out.println("Omvandlat till sekunder blir det: " + (arbetstimmar * sekunder) + " sekunder");


    }
}
