import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {

        /*1. Napisz program który obliczy sumę dwóch liczb
        1.1. liczb podanych przez użytkownika w konsoli
        1.2. podanych jako argumenty wejściowe programu
        */

        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Addition");
        System.out.println("Please type un a number: ");
        a = scanner.nextInt();
        System.out.println("Please type in a second number: ");
        b=scanner.nextInt();
        System.out.println(a+ " + " +b+ " = " +(a+b));



    }
}
