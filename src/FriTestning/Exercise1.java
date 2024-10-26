package FriTestning;

public class Exercise1 {

    public static void main(String[] args) {

        /* Skapa ett program som använder tre tal
        Programmet beräknar och skriver ut summan samt medelvärdet av de tre talen
        */

        /* Skapa ett program som beräknar och skriver ut arean och omkretsen av en rektangel.
        Rektangelns sidor ska läsas in
         */

        int first = 5;
        int second = 10;
        int third = 15;

        int sum = first + second + third;
        int median = sum / 3;

        System.out.println("The sum is: " + sum);
        System.out.println("The median is: " + median);

        /*Skapa ett program som beräknar och skriver ut arean och omkretsen av en rektangel.
         */

        int height = 4;
        int width = 5;

        int area = height * width;
        int circumference = height*2 + width*2;

        System.out.println();
        System.out.println();
        System.out.println("The area is: " + area);
        System.out.println("The circumference is: " + circumference);


    }
}
