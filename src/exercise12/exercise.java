package exercise12;

public class exercise {

    public static void main(String[] args) {
        // Skapa ett program som innehåller en array med fem namn

        //type[] varName = {value, value, value};
                          //0           1          2        3       4
        //String[] names ={"Amanda", "Beatrice", "Ceasar", "David", "Elin"};
        //Om vi vill lägga in all data från början så är det här ett smidigt sätt.

        String[] names = new String[5];//märk här att det sista numret ovan (som är 4) alltid är
        // ett mindre än talet vi vill ha (som här är 5).
        //Om vi efterhand ska lägga in data så är den här Stringen och nedanstående ett bra sätt.

        names[0] = "Amanda";
        names[1] = "Beatrice";
        names[2] = "Ceasar";
        names[3] = "David";
        names[4] = "Elin";

        // Skriv ut det första och sista namnet
        //arrayName[0]
        //arrayName[1]

        System.out.println(names[0]);
        System.out.println(names[4]);

    }
}
