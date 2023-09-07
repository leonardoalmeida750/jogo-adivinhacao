import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {

    public static void main(String[] args) {
        // Cria um objeto Random para gerar o número aleatório
        Random random = new Random();

        // Gera um número aleatório entre 1 e 100
        int numeroSecreto = random.nextInt(101);

        // Define o número máximo de tentativas
        int tentativas = 5;

        // Inicia o loop de tentativas
        for (int i = 1; i <= tentativas; i++) {
            // Exibe a mensagem de instrução
            System.out.println("Tentativas " + i + " de 5");

            // Solicita o chute do usuário
            Scanner scanner = new Scanner(System.in);
            int chute = scanner.nextInt();

            // Verifica se o chute foi correto
            if (chute == numeroSecreto) {
                // O jogador acertou
                System.out.println("Parabéns! Você acertou o número secreto!");
                break;
            } else {
                // O jogador errou
                if (chute < numeroSecreto) {
                    System.out.println("O número secreto eh maior que " + chute);
                } else {
                    System.out.println("O número secreto eh menor que " + chute);
                }
            }
        }

        // Se o jogador não acertou em 5 tentativas, o jogo é encerrado
        int i = 1;
        if (i > tentativas) {
            System.out.println("Que pena, você não acertou o número secreto. O número secreto era " + numeroSecreto);
        }
    }
}
