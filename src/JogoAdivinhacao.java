import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100); // gera um número aleatório entre 0 e 100
        int numeroDigitado = 0;
        int tentativas = 0;

        while (tentativas < 5) {
            System.out.println("Entre 0 e 100, adivinhe qual é o número sorteado!");
            numeroDigitado = leitura.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, você adivinhou o número sorteado!");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número digitado é menor que o número sorteado.");
            } else {
                System.out.println("O número digitado é maior que o número sorteado.");
            }

            if (tentativas == 5 && numeroDigitado != numeroGerado) {
                System.out.println("Você não conseguiu adivinhar o número sorteado! :(");
            }

        }



        }

    }

