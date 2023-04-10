package IteracaoWhile;

import java.util.Random;
import java.util.Scanner;

public class ExemploWhile {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        int i = 0;
        while (i > -1) {
            System.out.println("o nº da iteração é " + i);
            i++;
        }
    }

    public void exemplo2() {
        int Vetor[] = new int[10];
        int i = 0;
        while (i < 10) {
            System.out.println("Informe o valor de indice " + i + " do vetor");
            Vetor[i] = sc.nextInt();
            i++;
        }
        i = 0;
        while (i < 10) {
            System.out.println("O vetor [" + i + "]=" + Vetor[i]);
            i++;
        }
    }
    public void exemplo3() {
    Random rd = new Random();
    int valorSorteado = rd.nextInt(10);
    boolean tentenovamente = true;
    while (tentenovamente) {
        if (tentenovamente) {
            System.out.println("Digite um N°");
            int nDigitado = sc.nextInt();
            if (nDigitado==valorSorteado) {
                System.out.println("Acertou!!!");
                tentenovamente = false;
                }
                else { System.out.println("Errou!!!");}
        }
    }

        
    }
}
