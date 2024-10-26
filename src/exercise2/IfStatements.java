package exercise2;

public class IfStatements {

    public static void main(String[] args) {
        int number1 = -1;
        int number2 = 1;

        if(number1 > number2) {
            System.out.println("number1 is larger than number2");
        } else if(number1 == number2){
            System.out.println("number1 is the same as number2");
        } else {
            System.out.println("number1 is smaller than number2");
        }

        System.out.println("end of text");
    }
}
