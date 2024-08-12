import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double result = 0;

        System.out.println("------------ MENU -----------");
        System.out.println("1- Calcular Area do quadradro");
        System.out.println("2- Calcular Area do círculo  ");
        System.out.println("-----------------------------");
        int a = sc.nextInt();

        if (a == 1) {
            System.out.println("Informe o comprimento do lado do quadradro: ");
            int b = sc.nextInt();
            result = (b*b);
            System.out.println("Resultado: " + result);
        }
        else if (a == 2) {
            System.out.println("informe o raio do círculo: ");
            int c = sc.nextInt();
            result = Math.sqrt(c*c);
            System.out.println("Resultado: " + result);
        }
    }
}
