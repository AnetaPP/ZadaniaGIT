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
        int a = 3;
        int b = 5;
        int x = N/3;
        int y = N/5;
        int sumthree = 0;
        int sumfive = 0;
        int i;
        /*for (int i=1; a<=N;i++){
            sum=sum+(3*i);
            a=a*i;
            System.out.println(a);
        }
        System.out.println("a = "+sum);*/
        //System.out.println("Wielokrotność 3 w "+N+ " = "+a);
        //System.out.println("Wielokrotność 5 w "+N+ " = "+b);
        for (i=0; i <= N;i++){
            if((i%3)==0){
                sumthree=sumthree+i;
            }
            if((i%5)==0) {
                sumfive = sumfive + i;
            }
        }
        System.out.println(sumthree+sumfive);




    }

}
