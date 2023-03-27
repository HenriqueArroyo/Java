package ExerciciosExtraIfElse;

import java.io.Reader;
import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);
    Scanner reader = new Scanner(System.in);
    public void Exercicio1() {
        System.out.println("Informe um Numeral:");
        short numero1 = sc.nextShort();
       if (numero1%2==0) {System.out.println("O número é Par");
         }
         else {System.out.println("O número é Impar");}
    }
    
    public void Exercicio2() {
        System.out.println("Informe sua Nota:");
        double nota = sc.nextDouble();
        if (nota>=7&&nota<11) {System.out.println("O Aluno passou direto!!");}
        else if (nota<7&&nota>=5) {System.out.println("O Aluno tem direito a uma Prova de Recuperação!!");}
        else if (nota<5) {System.out.println("O Aluno está Reprovado!!");  }
        else if (nota>10) {System.out.println("A Nota está Incorreta!!");}
    }

public void Exercicio3() {
    System.out.println("Digite uma Letra:");
    String letra = sc.nextLine();
    boolean vogal = letra=="a"&&letra=="e"&&letra=="i"&&letra=="o"&&letra=="u";
    System.out.println(vogal);
    if (vogal) {System.out.println("A letra "+letra+" é uma Vogal");
        }
        else {System.out.println("A letra "+letra+" é uma cosoante");}
}
}
