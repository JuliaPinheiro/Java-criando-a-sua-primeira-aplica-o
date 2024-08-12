/*
Peça ao usuário para inserir dois números inteiros.
Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
* */

import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o primeiro número inteiro: ");
        int num1 = sc.nextInt();
        System.out.print("Informe o segundo número inteiro: ");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("os números são iguais!");
        } else if (num1 > num2) {
            System.out.println("o primeiro número é maior que o segundo");
        } else {
            System.out.println("o segundo número é maior que o primeiro");
        }


    }
}
