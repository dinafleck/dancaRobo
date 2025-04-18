import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seja muito bem-vindo(a).");
        System.out.println("Vamos iniciar a dança da quadrilha!");
        System.out.println("Por favor, insira a quantidade de robôs que irão participar da dança:");
        int quantidadeRobos = sc.nextInt();
        int[] receita = new int[quantidadeRobos];

        System.out.println("Excelente, a dança ficará muito divertida com " + quantidadeRobos + " robôs.");
        System.out.println("Agora precisamos confirmar a receita da dança definida pelo robô-mestre, por favor insira a sequência das posições que constam na receita");

        for (int i = 0; i < quantidadeRobos; i++) {
            receita[i] = sc.nextInt();
        }

        System.out.println("Muito bem! Vamos começar.");
        Quadrilha primeiraDanca = new Quadrilha(quantidadeRobos, receita);
        primeiraDanca.adicionaQuadrilha();
        
        long voltas = primeiraDanca.dancar();

        System.out.println();
        System.out.println("A quadrilha foi excelente. Porém, após " + voltas + " voltas os robôs perceberam que se encontravam em loop e encerraram a dança. Até a próxima!");
    }
}