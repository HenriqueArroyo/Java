package IteracaoWhile;


import java.util.Scanner;

public class ExerciciosWhile {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        int vetorA[]=new int[]{5,7,9,10,13};
        int vetorB[]=new int[5];
        int i=0;
        while(i<5){
            vetorB[i]=vetorA[i];
            System.out.println("O vetor B["+i+"]="+vetorB[i]);
            i++;
        }

    }
    public void exercicio2() {
        int vetorA[]=new int[]{5,7,9,10,13,15,17,21};
        int vetorB[]=new int[8];
        int i=0;
        while(i<8){
            vetorB[i]=vetorA[i]*2;
            System.out.println("O vetor B["+i+"]="+vetorB[i]);
            i++;
        }
    }
    public void exercicio3() {
        int vetorA[]=new int[]{5,7,9,10,13,15,17,21,25,29,34,41,47,56,59};
        int vetorB[]=new int[15];
        int i=0;
        while(i<15){
            vetorB[i]=vetorA[i]*vetorA[i];
            System.out.println("O vetor B["+i+"]="+vetorB[i]);
            i++;
        }
    }
    public void exercicio4() {
        int vetorA[]=new int[]{5,7,9,10,13,15,17,21,25,29,34,41,47,56,59};
        double vetorB[]=new double[15];
        int i=0;
        while(i<15){
            vetorB[i]=Math.sqrt(vetorA[i]);
            System.out.println("O vetor B["+i+"]="+vetorB[i]);
            i++;
        }
    }
    public void exercicio5() {
        int vetorA[]=new int[]{5,7,9,10,13,15,17,21,25,29};
        double vetorB[]=new double[10];
        int i=0;
        while(i<10){
            vetorB[i]=vetorA[i]*i;
            System.out.println("O vetor B["+i+"]="+vetorB[i]);
            i++;
        }
    }
    public void exercicio6() {
        int vetorA[]=new int[]{5,7,9,10,13,15,17,21,25,29};
        int vetorB[]=new int[]{5,7,9,10,13,15,17,21,25,29};
        int vetorC[]=new int[10];
        int i=0;
        while(i<10){
            vetorC[i]=vetorA[i]+vetorB[i];
            System.out.println("O vetor C["+i+"]="+vetorC[i]);
            i++;
        }
    }
    
}