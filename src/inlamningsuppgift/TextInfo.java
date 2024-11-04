package inlamningsuppgift;

import java.util.Scanner;

//Eftersom klassen är public kan den nås från andra klasser (t. ex. TextMain)
//TextInfo fungerar som en enkel datahanterare för att hålla reda på antalet rader och tecken som användaren har skrivit.
public class TextInfo {

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

    //Håller koll på antalet rader som användaren har skrivit (exklusive raden där "Stopp" skrevs)
    int rows;
    //Håller koll på det totala antalet tecken som användaren har skrivit (exklusive "Stopp")
    int characterNumber;

    String inputValue;


    public TextInfo(int rows, int characterNumber, String inputValue)
    {
        this.rows = rows;
        this.characterNumber = characterNumber;
        this.inputValue = inputValue;

    }

    //Metod som tillåter andra klasser att ändra värdet på rows-attributet
    public void setRows(int rows)
    {
        //this.rows refererar till klassens fält medan rows (utan this) är metodens parameter.
        //Genom att använda nedanståene tilldelas värdet från parametern till objektets rows-fält.
        this.rows = rows;
    }

    //Den här metoden används för att sätta värdet på fältet characterNumber som håller koll på det totala antalet tecken
    //som har skrivits (exklusive "Stopp")

    //Tilldelar parmetern characterNumber till klassens fält characterNumber
    public void setCharacterNumber(int characterNumber)
    {
        //this används för att tydligt referera till objektets egna fält characterNumber och för att undvika förväxling
        //med parametern som också heter characterNumber
        this.characterNumber = characterNumber;
    }

    //Denna metod returnerar värdet av fältet rows som representerar det aktuella antalet rader som användaren har
    //skrivit (exklusive "Stopp"). Den används i TextMain-klassen för att hämta och visa det aktuella antalet rader.
    public int getRows()
    {
        return rows;
    }

    //Returnerar värdet av fältet characterNumber som representerar det totala antalet tecken som användaren har
    //skrivit (exklusive "Stopp"). Den används i TextMain-klassen för att hämta och visa det aktuella antalet tecken.
    public int getCharacterNumber() {
        return this.characterNumber;
    }

    public void setText(String inputValue)
    {
        this.inputValue = inputValue;
        this.calculate();
        //Skapar en ny Scanner-instans som läser inmatning från användaren via kommandoraden

    }

    public String getInputValue()
    {
        return inputValue;
    }

    private void calculate ()
    {
        this.characterNumber = this.characterNumber + inputValue.length();

    }
}
