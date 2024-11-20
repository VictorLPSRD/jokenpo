package JOKENPO;

import java.util.Random;
import java.util.Scanner;

public class vsbot {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] opcoes = {"Pedra", "Papel", "Tesoura"}; // Opções do jogo

        // Pontos Inicial
        int usuario = 0;
        int bot = 0;

        // Contador de rodadas
        int rodada = 0;

        while (rodada < 3) {
            System.out.println("Escolha: 0 - Pedra, 1 - Papel, 2 - Tesoura (ou -1 para sair)");
            int escolhaUsuario = scanner.nextInt();
            limpar.limparTerminal();

            if (escolhaUsuario == -1) {
                System.out.println("Jogo encerrado.");
                break;
                
            } else if (escolhaUsuario < 0 || escolhaUsuario > 2) {
                System.out.println("Escolha inválida! Tente novamente.");
                continue;
            }

            int escolhaBot = random.nextInt(3); // Escolha do bot

            System.out.println("Você escolheu: " + opcoes[escolhaUsuario]);
            System.out.println("O computador escolheu: " + opcoes[escolhaBot]);

            // Determinação do vencedor
            if (escolhaUsuario == escolhaBot) {
                System.out.println("Empate!");
                
            } else if ((escolhaUsuario == 0 && escolhaBot == 2) ||
                       (escolhaUsuario == 1 && escolhaBot == 0) ||
                       (escolhaUsuario == 2 && escolhaBot == 1)) {
                System.out.println("Você Venceu!");
                usuario += 1;
                
            } else {
                System.out.println("Computador venceu!");
                bot += 1;
            }
            rodada++;
        }

        // Exibe o resultado final
        System.out.println("\nResultado Final:");
        System.out.println("Usuário: " + usuario + " pontos");
        System.out.println("Bot: " + bot + " pontos\n");
    
    }
}
