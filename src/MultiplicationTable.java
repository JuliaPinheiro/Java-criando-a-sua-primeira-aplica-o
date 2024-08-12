import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         int m  = 0;
         int result  = 0;

        System.out.println("Informe um número: ");
        int n = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            m++;
            result += n*m;
            System.out.println(n + "*" + m + " = " + result);
            result = 0;
        }
    }
}
