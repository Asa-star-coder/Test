package exercise5;

public class MyCar {

    public static void main(String[] args) {
        // skapa ett nytt objekt myCar av typen Car
        Car myCar = new Car();

        System.out.println(myCar.getColor());

        // ändra på myCar genom att sätta färgen till Blue
        myCar.setColor("Blue");

        // hämta info ifrån myCar. I detta fall bilfärgen Blue
        String color = myCar.getColor();

        System.out.println(color);


    }
}
