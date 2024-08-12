import java.util.Scanner;

public class LoopF {
    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);
        double MediaAvaliacao = 0;
        double nota = 0;


        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua avaliação para o filme: ");
            nota = scan.nextDouble();
            MediaAvaliacao += nota;
        }

        MediaAvaliacao = MediaAvaliacao / 3;
        System.out.println("Media Avaliacao: " + MediaAvaliacao);

    }
}
