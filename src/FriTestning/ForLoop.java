package FriTestning;

    public class ForLoop {

        public static void main(String[] args) {

            // Skriv ut alla tal ifrån 1-100

            System.out.println("Numbers 1-100");

            for(int i = 0; i <100;i++) {
                System.out.print((i+1) + " ");
            }
            // Skriv ut alla jämna tal ifrån 1-100

            System.out.println();
            System.out.println();
            System.out.println("Even numbers 1-100");

            for(int i = 0; i <100;i+=2) {
                System.out.print((i+2) + " ");

            }

            // Skriv ut alla fibonacci-tal ifrån 1-100. Fibonacci-tal är de två senaste
            // talen adderat och börjar med 1, 1 som första två tal. Exempel 1,1,2,3,5,8,13,21 o.s.v.

            System.out.println();
            System.out.println();
            System.out.println("Fibonacci numbers 1-100:");

            int first = 1;

            System.out.print(first + " ");

            int second = 1;

            // en while-loop är bättre att göra än en for-loop när det gäller den här övningen

            for(int i=0; i<10;i++) {
                System.out.print(second + " ");
                int third = first + second;
                first = second;
                second = third;


            }

            while(second <= 100) {


            }
        }
    }

