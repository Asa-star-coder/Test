package Ovningar;

public class Ovning7 {

    public static void main(String[] args) {

        /* Skapa ett program som beräknar vad du ska betala för en tank bensin.
        Indata är antal liter, pris per liter och eventuell rabatt i procent.
        Utdata är priset som du ska betala.
         */

        double antalLiter = 25.55;
        double literPris = 17.69;
        double rabattProcent = 0.03;

        double totalPris = antalLiter * literPris;
        double rabatt = totalPris * rabattProcent;
        double slutPris = totalPris - rabatt;

        System.out.println(" Priset jag ska betala är:" + slutPris);


    }
}
