import java.util.Scanner;

public class LoopW {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        double MediaAvaliacao = 0;
        double nota = 0;
        int contador = 0;


        while (nota != -1) {
            System.out.println("Digite sua avaliação para o filme ou -1 para sair: ");
            nota = scan.nextDouble();
            if (nota != -1) {
                MediaAvaliacao += nota;
                contador++;
            }
        }

        MediaAvaliacao = MediaAvaliacao / contador;
        System.out.println("Media Avaliacao: " + MediaAvaliacao);

    }
}
