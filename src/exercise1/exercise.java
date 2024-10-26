package exercise1;

public class exercise {

    public static void main(String[] args) {

        /*Skapa ett program som använder tre tal
        Programmet beräknar och skriver ut summan samt medelvärdet av de tre talen.
*/
        int first = 5;
        int second = 8;
        int third = 14;

        int sum = first + second + third;
        int median = sum/3;

        System.out.println("The sum is: " +sum);
        System.out.println("Them median is: " +median);



        /*
        Skapa ett program som beräknar och skriver ut arean och omkretsen av en rektangel.
        Rektangelns sidor ska läsas in.*/

        int height = 3;
        int width = 5;

        int area = height * width;
        int circumference = height*2 + width*2;

        System.out.println();

        System.out.println(area);
        System.out.println(circumference);

    }
}



