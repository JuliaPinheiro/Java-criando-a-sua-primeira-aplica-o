/*
* Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
* */

import java.util.Scanner;

public class PosNegChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        if (n> 0){
            System.out.println("número positivo");
        }else {
            System.out.println("número negativo");
        }
    }
}
