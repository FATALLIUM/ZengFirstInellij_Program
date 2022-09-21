import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hi.");
    }

    public static void extra(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?: ");
        String name = scan.nextLine();
        scan.nextLine();

        System.out.println("What is your favorite color?: ");
        String favColor = scan.nextLine();
        scan.nextLine();

        System.out.println("What is your dream pet?: ");
        String animal = scan.nextLine();
        scan.nextLine();

        System.out.println("What is your favorite number? (whole or other): ");
        double favNum = scan.nextDouble();
        scan.nextLine();

        System.out.println("");
    }
}
