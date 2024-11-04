package inlamningsuppgift;

//Import av scanner-klass vilket gör det möjligt att läsa användarinmatningar från kommandoraden
import java.util.Scanner;

//Public betyder att den här klassen kan nås från andra paket
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

        //Skapar ett objekt av klassen TextInfo. Objektet används för att hålla koll på antal tecken och rader
        TextInfo textobject = new TextInfo(0,0,"");

        //Används för att kontrollera while-loopen. När number är 1 fortsätter loopen att köra.
        int number = 1;
        //Används för att hålla reda på det total antalet tecken som har skrivits (förutom "Stopp")
        int secondNumber= 0;
        //Används för att räkna antalet rader som användaren skrivit
        int secondRow = 0;
        //Används för att lagra varje textrad som användaren skriver
        String text = "";

        //Loopen körs så länge number 1 är 1 tills användaren skriver "Stopp"
        while(number == 1)
        {
            //Programmet ber användare att använda en text
            System.out.println("Ange en text ");
            //hämtar inmatningen från användaren genom att kalla på getText-metoden
            Scanner scan = new Scanner(System.in);
            text = scan.nextLine();


            //Om användaren skriver "Stopp" sätts number till 0 vilket avslutar loopen
            if (text.equals("Stopp"))
            {
                number = 0;

            }
            else
            {
                textobject.setText(text);
                //text = textobject.getInputValue();
                //getrows hämtar det nuvarande antalet rader från textInfo-objektet och ökar det med 1
                secondRow = textobject.getRows() + 1;
                //Sätter det uppdaterade antalen rader i textobject
                textobject.setRows(secondRow);

                //Hämtar det aktuella antalet tecken från textobject och lägger till antal tecken i den nyinmatade raden text.length
                secondNumber = textobject.getCharacterNumber();
                //Uppdaterar det totala antalet tecken i textobject med det nya värdet
                textobject.setCharacterNumber(secondNumber);

                //Den här delen av koden uppdaterar textobject med det aktuellt antal rader och tecken efter varje ny inmatning
            }

        }
        //Skriver ut det totala antalet rader som användaren skrivit (exklusive "Stopp")
        System.out.println("Antal rader: " + textobject.getRows());
        //Skriver ut det totala antalet tecken som användaren skrivit (exklusive "Stopp")
        System.out.println("Antal tecken: " + textobject.getCharacterNumber());

    }


}

