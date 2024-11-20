package JOKENPO;

import java.util.Scanner;

public class vs {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        // Pegando nome dos jogadores 
        System.out.println("Informe o nome dos jogadores\n");

        System.out.print("Jogador 1: ");
        String jogador1 = scanner.nextLine();

        System.out.print("Jogador 2: ");
        String jogador2 = scanner.nextLine();

        limpar.limparTerminal();
        System.out.println("Nomes dos jogadores:\n");
        System.out.println("Jogador 1: " + jogador1);
        System.out.println("Jogador 2: " + jogador2 +"\n");

        // Pontos Inicial
        int pontoP1 = 0;
        int pontoP2 = 0;


        // Opções do jogo
        String[] opcoes = {"Pedra", "Papel", "Tesoura\n"};
        
        // Contador de rodadas
        int rodada = 0;

        while (rodada < 3) {
            System.out.println(jogador1 + " escolha: 0 - Pedra, 1 - Papel, 2 - Tesoura (ou -1 para sair)");
            int escolhaUsuario1 = scanner.nextInt();

            System.out.println(jogador2 + " escolha: 0 - Pedra, 1 - Papel, 2 - Tesoura (ou -1 para sair)");
            int escolhaUsuario2 = scanner.nextInt();
            limpar.limparTerminal();

            if (escolhaUsuario1 == -1 || escolhaUsuario2 == -1) {
                System.out.println("Jogo encerrado.");
                break;
            }

            if (escolhaUsuario1 < 0 || escolhaUsuario1 > 2 || escolhaUsuario2 < 0 || escolhaUsuario2 > 2) {
                System.out.println("Escolha inválida! Tente novamente.");
                continue;
            }

            System.out.println("O usuário " + jogador1 + " escolheu: " + opcoes[escolhaUsuario1]);
            System.out.println("O usuário " + jogador2 + " escolheu: " + opcoes[escolhaUsuario2]);

            // Determinação do vencedor
            limpar.limparTerminal();
            if (escolhaUsuario1 == escolhaUsuario2) {
                System.out.println("Empate !");
            } else if ((escolhaUsuario1 == 0 && escolhaUsuario2 == 2) ||
                       (escolhaUsuario1 == 1 && escolhaUsuario2 == 0) ||
                       (escolhaUsuario1 == 2 && escolhaUsuario2 == 1)) {
                System.out.println("Você Venceu " + jogador1 + "\n");
                pontoP1 += 1;
            } else {
                System.out.println("Você Venceu " + jogador2 + "\n");
                pontoP2 += 1;
            }

            rodada++; // Incrementa o contador de rodadas
        }

        // Exibindo pontuação final
        System.out.println("\nPontuação final:\n");
        System.out.println(jogador1 + ": " + pontoP1 + " pontos");
        System.out.println(jogador2 + ": " + pontoP2 + " pontos\n");
    }
}
