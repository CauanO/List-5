import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        // Arrays
        int[] memoria;
        // Variaveis
        int respUsuario = 0;
        int nivel = 1;
        String name;
        String manual = """
                    =========================
                         MANUAL DO JOGO
                    =========================

                Nome do Jogo: Gênius

                Descrição:
                Gênius é um jogo de memória desafiador onde o computador apresenta uma sequência de números, e o usuário deve repetir essa sequência. A cada acerto, um novo número é adicionado à sequência. O objetivo é memorizar e repetir corretamente a sequência até alcançar 10 números e avançar para o próximo nível.

                =========================
                      INSTRUÇÕES DE JOGO
                =========================

                1. OBJETIVO DO JOGO:
                   - Memorizar a sequência de números apresentada pelo computador e repeti-la corretamente.
                   - Ao acertar 10 números consecutivos, você avança para o próximo nível.

                2. NÍVEIS:
                   - Nível 1: Números de 1 a 3
                   - Nível 2: Números de 1 a 6
                   - Nível 3: Números de 1 a 9
                   - Nível 4: Números de 1 a 12
                   - Os níveis continuam aumentando a variedade de números conforme você avança.

                3. DICAS:
                   - Concentre-se na sequência apresentada e tente memorizá-la.
                   - Use técnicas de repetição para ajudar a lembrar os números.
                   - Fique calmo; a prática levará à perfeição!
                                """;
        int playGame, playGame2;
        int valorGerado = random.nextInt(100);
        System.out.println("Bem vindo ao Jogo Gênius!");
        System.out.println("Digite seu nikename: ");
        name = sc.next();
        limparTela();
        System.out.println("Vamos começar o game " + name + "!");
        System.out.println("1 - Jogar \n2 - Como jogar \n3 - Sair");
        playGame = sc.nextInt();
        if (playGame == 1) {
            limparTela();
            respUsuario = sc.nextInt();
            game(name, nivel, respUsuario, valorGerado);
            
        }else if(playGame == 2) {
            limparTela();
            System.out.println(manual);
            System.out.println("Digite: ");
            System.out.println("1 - Jogar \n2 - Sair");
            playGame2 = sc.nextInt();
            if (playGame2 == 1) {
                System.out.println("Logica do game!");
            }else{
                System.out.println("FIM DE JOGO!");
            }
        }else{
            System.out.println("FIM DE JOGO!");
        }
    }

    public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }

    public static void game(String nome, int nivel, int resp, int valorGerado) {
        System.out.println("Olá " + nome + "!!");
        while (true) {
            // valorGerado;
        }
    }

}
