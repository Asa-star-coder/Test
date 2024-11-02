package Ovningar;

public class Ovning16 {

    public static void main(String[] args) {

        /*En firma erbjuder sina kunder 10 procents rabatt om man vid ett inköpstillfälle
        handlar för  minst 1000 kr. Antag för enkelhetens skull att man bara
        handlar varor av ett visst slag. Skapa ett program som beräknar vad en kund ska betala.
        Indata till algoritmen ska vara antalet köpta enheter och priset per enhet.
        */

        int antalEnheter = 5;
        double prisPerEnhet = 250.0;

        double totalpris = antalEnheter * prisPerEnhet;
        double rabattBelopp = 0.0;


        if (totalpris >= 1000) {
            rabattBelopp = totalpris * 0.10;
            totalpris -= rabattBelopp;

        }
        System.out.println("Rabatten är: " + rabattBelopp);
        System.out.println("Det totala priset att betala är: " + totalpris);


    }
}
