import java.util.Scanner;

public class MathQuiz {

    Scanner scn = new Scanner(System.in);

    public boolean question1() {
        System.out.println("Jaki jest wynik mnożenia 3*5?");
        int wynik = scn.nextInt();
        boolean result = (wynik == 15);
        return result;
    }

    public boolean question2() {
        System.out.println("Jakie jest pole kwadratu o boku 12?");
        int wynik = scn.nextInt();
        boolean result = (wynik == 144);
        return result;
    }


    public boolean question3() {
        System.out.println("Jaki jest pierwiastek kwadratowy z liczby 15129?");
        long wynik = scn.nextInt();
        boolean result = (wynik == 228886641);
        return result;
    }
}
