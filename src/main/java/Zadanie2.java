import java.util.Scanner;

public class Zadanie2 {
    /*2. Napisz program który dla liczby N obliczy sumę wszystkich wielokrotności 3 i 5
    które są <= N (mniejsze lub równe)
     */
    public static void main(String[] args) {

        int N;
        System.out.println("Please type in a number: ");
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        int a = N/3;
        int b = N/5;

        System.out.println("Wielokrotność 3 w "+N+ " = "+a);
        System.out.println("Wielokrotność 5 w "+N+ " = "+b);


    }

}
