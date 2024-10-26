package exercise8;

public class Exercise {

    public static void main(String[] args) {

        Spellchecker spell = new Spellchecker();

        if (spell.isLetter('h')) {
            System.out.println("H is a letter");
        }

        if (spell.isLetter('z')) {
            System.out.println("z is a letter");
        }

        if (spell.isLetter('a')) {
            System.out.println("a is a letter");
        }

        if (spell.isLetter('å')) {
            System.out.println("å is a letter");
        }

        if (spell.isLetter('}')) {
            System.out.println("} is a letter");
        }

        if (spell.isLetter('1')) {
            System.out.println("1 is a letter");
        }

    }



}
