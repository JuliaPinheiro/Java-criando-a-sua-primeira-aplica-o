import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int tentativas = 0;
        int numInformado = 0;
        int numGerado = new Random().nextInt(101);

        System.out.println("------------- vamos jogar?? ----------------");
        System.out.println("tente adivinhar o número em até 5 tentativas");
        System.out.println("--------------------------------------------");


while ( tentativas < 5){

        System.out.println("Informe um número entre 0 e 100: ");
        numInformado = scan.nextInt();
        tentativas++;

        if(numGerado == numInformado){
            System.out.println("Parabéns, você acertou em "+ tentativas);
            break;
        } else if (numInformado > numGerado) {
            System.out.println("O número informado é maior");
        } else {
            System.out.println("o número informado é menor");
        }

        if(tentativas == 5 && numInformado != numGerado){
        System.out.println("Você não conseguiu acertar em 5 tentativas");

            }
        }
        scan.close();
    }
}
