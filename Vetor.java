public class Vetor {

    private double[] notas;

    public Vetor(int tamanho) {
        this.notas = new double[tamanho];
    }

    public void adicionarNota(double nota, int indice) {
        this.notas[indice] = nota;
    }

    public void excluirNota(int indice) {
        this.notas[indice] = 0;
    }

    public double calcularMedia() {
        double soma = 0;
        int qtdNotas = 0;
        for (double nota : this.notas) {
            if (nota > 0) {
                soma += nota;
                qtdNotas++;
            }
        }
        return soma / qtdNotas;
    }

    public void exibirNotas() {
        System.out.println("Notas cadastradas:");
        for (int i = 0; i < this.notas.length; i++) {
            if (this.notas[i] > 0) {
                System.out.println("Nota " + (i+1) + ": " + this.notas[i]);
            }
        }
    }

}