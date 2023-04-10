package VetoresExemplo;

import java.util.Scanner;

public class Vetores {
    Scanner sc = new Scanner(System.in);
    public void exemplo() {
    int vetorInt[] = new int [10];
    int vetorInt2[] = new int [] {1,2,3,4,5,6,7,8,9,10};
    System.out.println("Escolha o número de 0 à 9");
    
    vetorInt[0] = sc.nextInt();
    vetorInt[1] = sc.nextInt();
    vetorInt[2] = sc.nextInt();
    vetorInt[3] = sc.nextInt();
    vetorInt[4] = sc.nextInt();
    vetorInt[5] = sc.nextInt();
    vetorInt[6] = sc.nextInt();
    vetorInt[7] = sc.nextInt();
    vetorInt[8] = sc.nextInt();
    vetorInt[9] = sc.nextInt();
    System.out.println("O valor da primeira posição indice 9 é "+vetorInt2[9]);
    System.out.println("O valor da primeira posição indice 8 é "+vetorInt2[8]);
    System.out.println("O valor da primeira posição indice 7 é "+vetorInt2[7]);
    System.out.println("O valor da primeira posição indice 6 é "+vetorInt2[6]);
    System.out.println("O valor da primeira posição indice 5 é "+vetorInt2[5]);
    System.out.println("O valor da primeira posição indice 4 é "+vetorInt2[4]);
    System.out.println("O valor da primeira posição indice 3 é "+vetorInt2[3]);
    System.out.println("O valor da primeira posição indice 2 é "+vetorInt2[2]);
    System.out.println("O valor da primeira posição indice 1 é "+vetorInt2[1]);
    System.out.println("O valor da primeira posição indice 0 é "+vetorInt2[0]);

    }
}
