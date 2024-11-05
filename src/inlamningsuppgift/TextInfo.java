package inlamningsuppgift;

//Eftersom klassen är public kan den nås från andra klasser (som TextMain i det här fallet).
//TextInfo fungerar som en enkel datahanterare för att hålla reda på antalet rader och tecken som användaren
// har skrivit.
public class TextInfo
{

    /*
    Skriv ett program som läser in text ifrån kommandoraden rad för rad tills användaren skriver ordet stop.

	När användaren är klar skriver programmet ut antal tecken och hur många rader som användaren har skrivit,
	exklusive redan med stop.

	Programmet ska bestå av två klasser:
    - En klass som läser text och skriver ut resultatet till användaren.
    - En annan klass som räknar raderna och har koll på antal tecken.
    - Kontrollen för att ha koll på om användaren har skrivit ordet stop eller inte får utföras i vilken av
      klasserna man vill.

	- Till programmet ska minst tre Junif-testfall skrivas.
	- Testfallen skall skilja sig märkvärt åt och testa olika delar av programmet.
     */

    //Fältet rows används för att hålla reda på antalet textrader som användaren har skrivit
    // (exklusive raden med ordet "Stopp)
    int rows;
    //Fältet characterNumber håller koll på det totala antalet tecken som användaren har skrivit
    // (exklusive tecken i raden med "Stopp").
    int characterNumber;
    //Fältet inputValue används för att lagra varje ny textrad som användaren matar in.
    String inputValue;

    //Konstruktorn - en konstruktor är en speciell metod som körs automatiskt när ett nytt TextInfo-objekt skapas
    // vilket låter oss sätta startvärden för klassens attribut rows, characterNumber och inputValue.
    // Konstruktorn har samma namn som klassen. Public innebär att den kan användas var som helst där klassen
    // TextInfo används. Parametrarna (int rows...o.s.v.) låter den som skapar ett nytt TextInfo-objekt skicka
    //in startvärden för dessa fält.
    public TextInfo(int rows, int characterNumber, String inputValue)
    {
        //this refererar till det aktuella objektet som skapas, d.v.s. det nya TextInfo-objektet.
        //this.rows hänvisar till objektets rows-fält medan rows (utan this) hänvisar till parametervärdet
        //som skickades in till konstruktorn. Den här raden gör att värdet från parametern rows tilldelas
        // objektets fält rows.
        this.rows = rows;
        //På liknande sätt tilldelas vårdet från parametern characterNumber till objektets fält characterNumber
        this.characterNumber = characterNumber;
        //Denna rad tilldeäar värdet från parametern inputValue till fältet inputValue i objektet.
        this.inputValue = inputValue;
    }

    //Metoden setRows används för att uppdatera antalet rader i objektet.
    public void setRows(int rows)
    {
    //Tilldelar värdet från parametern rows till klassens rows fält.
        this.rows = rows;
    }

    //Metoden setCharacterNumber används för att uppdatera antalet tecken i objektet.
    public void setCharacterNumber(int characterNumber)
    {
        //Tilldelar värdet från parmetern characterNumber till klassens fält characterNumber
        this.characterNumber = characterNumber;
    }

    //Metoden getRows används i TextMain-klassen för att hämta och visa det aktuella antalet rader.
    public int getRows()
    {
        //returnerar värdet av rows-fältet vilket visar hur många rader som användaren har skrivit.
        return rows;
    }

    //Metoden getCharacterNumber används i TestMain klassen för att hämta och visa det aktuella antalet tecken.
    public int getCharacterNumber()
    {
        //Returnerar värdet av characterNumber fältet vilket visar det totala antalet tecken som
        // användaren har skrivit.
        return this.characterNumber;
    }

    //setText används för att uppdatera inputValue och köra calculate-metoden som räknar antal tecken.
    public void setText(String inputValue)
    {
        //Tilldelar det nya värdet från parametern inputValue till klassens inputValue-fält.
        this.inputValue = inputValue;
        //Anropar calculate-metoden för att uppdatera det totala antalet tecken baserat på längden
        //på inputValue.
        this.calculate();
    }
    //Metoden (för text) getInputValue används för att hämta den senaste textinmatningen (inputValue).
    public String getInputValue()
    {
        //Returnerar värdet av inputValue vilket kan användas om andra delar av programmet behöver
        //visa eller bearbeta den senaste inmatningen.
        return inputValue;
    }
    //Beräkningsmetoden calculate är en privat metod som uppdaterar det totala antalet tecken.
    private void calculate ()
    {
        //Lägger till antalet tecken i inputValue (den senaste raden som användaren har skrivit) till
        //det befintliga värdet av characterNumber. Detta gör att characterNumber hela tiden uppdateras
        //med nya inmatade tecken.
        this.characterNumber = this.characterNumber + inputValue.length();
    }
}
