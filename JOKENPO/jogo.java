package JOKENPO;


import java.util.Scanner; 

public class jogo {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
       

        while (true) {
            
            System.out.println("Escolha uma opção:");
            System.out.println("1 : 1P VS 2P");
            System.out.println("2 : 1P VS BOT");
            System.out.println("4 : Sair\n");

            System.out.print("Opção:");
            int escolha = scanner.nextInt();

            limpar.limparTerminal();

            if (escolha == 1) {
                System.out.println("Você escolheu Função 1.");
                vs.main(args);
               
    
            } else if (escolha == 2) {
                System.out.println("Você escolheu Função 2.");
                vsbot.main(args);
                
            }else{
                System.out.println("Até a proxima!");
                break;
            } 
        }

    }
}
