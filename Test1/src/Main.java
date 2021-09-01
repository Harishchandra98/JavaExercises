import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String firstInput = userInput.nextLine();
        Double secondInput = userInput.nextDouble();
        Boolean thirdInput = userInput.nextBoolean();

        myFunc(firstInput,secondInput,thirdInput);
    }

    public static void myFunc(String inp1, Double inp2, Boolean inp3) {
        System.out.println(" " + inp1 + " " + inp2 + " " + inp3);
    }
}
