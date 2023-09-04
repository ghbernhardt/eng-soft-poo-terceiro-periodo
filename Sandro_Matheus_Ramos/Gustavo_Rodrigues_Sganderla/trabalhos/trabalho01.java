package Sandro_Matheus_Ramos.Gustavo_Rodrigues_Sganderla.trabalhos;
public class MediaNotas {

    public static void main(String[] args) {
        // Definindo as notas de BigData e Lógica de Programação
        double[] notasBigData = {8.0, 9.0, 8.6, 9.2, 7.0};
        double[] notasLogica = {7.1, 6.0, 7.2, 5.2, 7.4};

        // Criando o vetor multidimensional
        double[][] notas = {notasBigData, notasLogica};

        // Calculando a média da turma em cada matéria
        double mediaBigData = calcularMedia(notas[0]);
        double mediaLogica = calcularMedia(notas[1]);

        // Imprimindo os resultados
        System.out.println("Média da turma em BigData: " + mediaBigData);
        System.out.println("Média da turma em Lógica de Programação: " + mediaLogica);
    }

    // Função para calcular a média de um array de notas
    public static double calcularMedia(double[] notas) {
        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}
