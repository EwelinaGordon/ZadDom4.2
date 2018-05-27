public class MathQuizTest {
    public static void main(String[] args) {

        MathQuiz mq = new MathQuiz();

        boolean q1 = mq.question1();
        System.out.println(q1);

        boolean q2 = mq.question2();
        System.out.println(q2);

        boolean q3 = mq.question3();
        System.out.println(q3);

        int w1 = 0;
        int w2 = 0;
        int w3 = 0;

        if (q1 == true){
            w1 = 1;}

        if (q2 == true){
            w2 = 1;}

        if (q3 == true){
            w3 = 1;}

            int a = w1+w2+w3;

        System.out.println("Twój wynik to: "+ a +"/3");

    }
}
