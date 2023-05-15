package IteracaoFor;

import java.util.Scanner;

public class ExemploFor {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        for (int i=0;i<100;i++) {
           System.out.println("O Nº da Iteração é "+i); 
        }
    }

    public void exemplo2() {
        int vetor[]=new int[10];
        for (int i=0; i<vetor.length; i++) {//length - tamanho do vetor
            System.out.println("digite o Valor de vetor["+i+"]:");
            vetor[i]=sc.nextInt();
        }
    }
}