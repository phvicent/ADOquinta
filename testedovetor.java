import java.util.Scanner;

public class TesteVetor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de notas a serem cadastradas: ");
        int tamanho = scanner.nextInt();

        Vetor vetor = new Vetor(tamanho);

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar nota");
            System.out.println("2 - Excluir nota");
            System.out.println("3 - Exibir notas cadastradas");
            System.out.println("4 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe a nota: ");
                    double nota = scanner.nextDouble();
                    System.out.print("Informe o índice da nota: ");
                    int indice = scanner.nextInt();
                    vetor.adicionarNota(nota, indice);
                    break;
                case 2:
                    System.out.print("Informe o índice da nota a ser excluída: ");
                    indice = scanner.nextInt();
                    vetor.excluirNota(indice);
                    break;
                case 3:
                    vetor.exibirNotas();
                    System.out.println("Média das notas: " + vetor.calcularMedia());
                    break;
                case 4:
                    System.out.println("Encerrando aplicação...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();

    }

}