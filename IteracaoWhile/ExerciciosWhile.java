package IteracaoWhile;

import java.util.Scanner;

public class ExerciciosWhile {
    Scanner sc = new Scanner(System.in);
    public void exercicio1() {
    int VetorA[] = new int []{5,7,9,10,13};
    int VetorB[] = new int [5];
    int i =0;
    while (i<5) {
        VetorB[i]=VetorA[i];
        System.out.println("O vetor B ["+i+"]= "+VetorB[i]);
    }
}
    public void exercicio2() {
        int VetorA[] = new int []{5,7,9,10,13,15,19,22};
        int VetorB[] = new int [8];
        int i =0;
        while (i<8) {
            VetorB[i*2]=VetorA[i];
            System.out.println("O vetor B ["+i+"]= "+VetorB[i*2]);
           
        }
    }
        
        
    }


