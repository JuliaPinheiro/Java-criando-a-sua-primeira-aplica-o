import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = scan.nextInt();
        System.out.println("numero: " + num);

        System.out.println("digite seu nome: ");
        String nome = scan.next();
        System.out.println("nome: " + nome);

    }
}
