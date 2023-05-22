package AtividadeFormativaLogicaProgramacao;

import java.util.Random;
import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void Exercicio1() {
        System.out.print("Determine o Nº de linhas: ");
        int linhas = sc.nextInt();

        System.out.print("Determine o Nº de colunas: ");
        int colunas = sc.nextInt();

        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = rd.nextInt(9) + 1;
            }
        }

        System.out.println("Matriz Preenchida:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matriz após substituição dos valores:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i > j) {
                    matriz[i][j] = 1;
                } else if (i == j) {
                    matriz[i][j] = 0;
                } else {
                    matriz[i][j] = 2;
                }
            }
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void Exercicio2() {
        int numeroSorteado = (int) (Math.random() * 1001);
        int palpite;
        int tentativas = 0;

        System.out.println("Tente adivinhar um número de 0 a 1000.");

        while (true) {
            System.out.print("Digite o seu palpite: ");
            palpite = sc.nextInt();
            tentativas++;

            if (palpite == numeroSorteado) {

                System.out.println("Parabéns! Você acertou o número " + numeroSorteado
                        + ".");
                System.out.println("Você acertou em " + tentativas
                        + " tentativas.");
                System.out.println("Fim!");
                System.out.println("============================");
            } else if (palpite < numeroSorteado) {
                System.out.println("O número sorteado é maior do que o seu palpite.");
            } else {
                System.out.println("O número sorteado é menor do que o seu palpite.");
            }
        }
    }

    public void Exercicio3() {
        int tamanhoVetor = rd.nextInt(901) + 100;
        int[] vetor = new int[tamanhoVetor];

        System.out.println("Tamanho do vetor: " + tamanhoVetor);

        System.out.println("Vetor gerado:");

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(100) + 1;
            System.out.print(vetor[i] + " ");
        }

        System.out.println("Números pares do vetor:");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
            }
        }

        System.out.println("Números ímpares do vetor:");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                System.out.print(vetor[i] + " ");
            }
        }

        int qtdParPosicaoImpar = 0;
        int qtdImparPosicaoPar = 0;

        for (int i = 1; i < vetor.length; i += 2) {
            if (vetor[i] % 2 == 0) {
                qtdParPosicaoImpar++;
            }
        }

        for (int i = 0; i < vetor.length; i += 2) {
            if (vetor[i] % 2 != 0) {
                qtdImparPosicaoPar++;
            }
        }

        System.out.println("Quantidade de números pares nas posições ímpares: " + qtdParPosicaoImpar);
        System.out.println("Quantidade de números ímpares nas posições pares: " + qtdImparPosicaoPar);
    }
}
