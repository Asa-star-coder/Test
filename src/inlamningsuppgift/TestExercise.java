package inlamningsuppgift;

//Importerar @Test-annoteringen från JUnit som används för att markera metoder som testmetoder
import org.junit.jupiter.api.Test;
//Importerar metoden (en metod från JUnit) assertEquals som används för att jämföra förväntat värde och
//faktiskt värde i testerna. Om värdena inte stämmer överens kommer testet att misslyckas.
import static org.junit.Assert.assertEquals;

//Definierar klassen TextExercise som innehåller enhetstester för att verifiera att klassen TextInfo fungerar
//korrekt. Varje testmetod kontrollerar specifika funktioner i TextInfo.
public class TestExercise
{

/*
Skriv ett program som läser in text ifrån kommandoraden rad för rad tills användaren skriver ordet stop.

När användaren är klar skriver programmet ut antal tecken och hur många rader som användaren har skrivit, exklusive
redan med stop.

Programmet ska bestå av två klasser:
- En klass som läser text och skriver ut resultatet till användaren.
- En annan klass som räknar raderna och har koll på antal tecken.
- Kontrollen för att ha koll på om användaren har skrivit ordet stop eller inte får utföras i vilken av klasserna man vill.

- Till programmet ska minst tre Junif-testfall skrivas.
- Testfallen skall skilja sig märkvärt åt och testa olika delar av programmet.
*/

    //Testfall 1 - testar text. @Test markerar att metoden testInput är ett testfall.
    //Det här testet kontrollerar om getInputValue-metoden i TextInfo returnerar rätt inmatad text.
    @Test
    public void testInput()
    {
        //Skapar ett nytt textInfo-objekt (testTextObject) med texten "ägg".
        TextInfo testTextObject = new TextInfo(0,0,"ägg");

        //Hämtar värdet av texten med getInputValue
        String actual = testTextObject.getInputValue();
        //Förväntat resultat
        String expected = "ägg";
        //Jämför expected och actual. Om de inte är lika misslyckas testet.
        assertEquals(expected, actual);
    }


    //Testfall 2 - testar antal tecken.
    //Det här testet kontrollerar att getCharacterNumber returnerar rätt antal tecken.
    @Test

    public void testCharacter()
    {
        //Skapar ett TextInfo-objekt med characterNumber satt till 3
        TextInfo testTextObject = new TextInfo(0,3,"ägg");

        //Sätter upp ett förväntat antal tecken som ska vara 3
        int expected1 = 3;
        //Hämtar det faktiska antalet tecken från textObject genom getCharacterNumber
        int actual1 = testTextObject.getCharacterNumber();

        //Jämför det förväntade värdet 3 med det faktiska värdet assertEquals
        assertEquals(expected1, actual1);
    }


    //Testfall 3 - testar antal rader.
    //Det här testet kontrollerar om getRows-metoden returnerar korrekt antal rader.
    @Test

    public void testRow()
    {
        //Skapar ett nytt TextInfo-objekt där rows är satt till 3.
        TextInfo testTextObject = new TextInfo(3,3,"ägg");
        //Sätter upp ett förväntat antal rader (här satt till 3)
        int expected2 = 3;
        //Hämtar antal rader med getRows
        int actual2 = testTextObject.getRows();

        //Jämför det förväntade värdet 3 med det faktiska värdet.
        assertEquals(expected2, actual2);
    }

}
