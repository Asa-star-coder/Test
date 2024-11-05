package inlamningsuppgift;

//Import av scanner-klass vilket gör det möjligt att läsa användarinmatningar från kommandoraden
import java.util.Scanner;

//Public betyder att den här klassen kan nås från andra paket och kunna användas av andra klasser.
//TextMain använder TextInfo för att hålla koll på data medan användaren matar in text.
public class TextMain
{
    //main-metod är startpunkten, exekveringen börjar här när programmet körs
    public static void main(String[] args)
    {

    /*
    Skriv ett program som läser in text ifrån kommandoraden rad för rad tills användaren skriver ordet stop.

	När användaren är klar skriver programmet ut antal tecken och hur många rader som användaren har skrivit, exklusive redan med stop.

	Programmet ska bestå av två klasser:
    - En klass som läser text och skriver ut resultatet till användaren.
    - En annan klass som räknar raderna och har koll på antal tecken.
    - Kontrollen för att ha koll på om användaren har skrivit ordet stop eller inte får utföras i vilken av klasserna man vill.

	- Till programmet ska minst tre Junif-testfall skrivas.
	- Testfallen skall skilja sig märkvärt åt och testa olika delar av programmet.

     */

        //Skapar ett objekt av klassen TextInfo. Objektet (med initialvärdena 0 rader, 0 tecken, tom text)
        // används för att hålla koll på antal tecken, rader som användaren matar in.
        TextInfo textobject = new TextInfo(0,0,"");

        //Den här variabeln styr while-loopen. När number är 1 fortsätter loopen att köra, när number blir 0 avslutas loopen.
        int number = 1;
        //Används för att hålla reda på det total antalet tecken som användaren skrivit (exklusive "Stopp")
        int secondNumber= 0;
        //Håller reda på antalet rader som användaren skrivit
        int secondRow = 0;
        //Används för att lagra varje textrad som användaren matar in
        String text = "";

        //Loopen körs så länge number 1 är lika med 1. När number blir 0 avslutas loopen
        while(number == 1)
        {
            //Programmet ber användare skriva en textrad
            System.out.println("Ange en text ");
            //Skapar en ny Scanner-instans för att läsa användarinmatning från kommandoraden.
            Scanner scan = new Scanner(System.in);
            //Läser in en hel rad från användaren och lagrar den i variabeln text.
            text = scan.nextLine();


            //Kontrollerar om användaren skrev "Stopp". euals används för att jämföra innehålliet i text med "Stopp"
            // (istället för == som bara jämgör referenser).
            if (text.equals("Stopp"))
            {
                //Om användaren skriver "Stopp" sätts number till 0 vilket avslutar loopen.
                number = 0;

            }
            //Om användare inte skrev "Stopp" - uppdatera rader och tecken
            else
            {
                //Uppdaterar text i textobject med användaren senaste inmatning
                textobject.setText(text);
                //Hämtar antalet rader från textobject, ökar det med 1 och sparar det i secondRow.
                secondRow = textobject.getRows() + 1;
                //Uppdaterar rows i textobject med det nya antalet rader
                textobject.setRows(secondRow);
                //Betyder att värdet på characterNumber i objektet textobject hämtas och sparas i variabeln secondNumber.
                secondNumber = textobject.getCharacterNumber();
                //Uppdaterar characterNumber i textobject med det nya totala antalet tecken.
                textobject.setCharacterNumber(secondNumber);

                //Den här delen av koden uppdaterar textobject med det aktuellt antal rader och tecken efter varje ny inmatning
            }

        }
        //Skriver ut det totala antalet rader som användaren skrivit (exklusive raden "Stopp")
        System.out.println("Antal rader: " + textobject.getRows());
        //Skriver ut det totala antalet tecken som användaren skrivit (exklusive raden "Stopp")
        System.out.println("Antal tecken: " + textobject.getCharacterNumber());

    }


}

