import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fact=1;

        System.out.print("Informe um numero:  ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            fact *= i;
        }
        System.out.println("Factorial do numero: "+fact);
    }
}
