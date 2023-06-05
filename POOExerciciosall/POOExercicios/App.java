package POOExercicios;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner reader = new Scanner(System.in);

System.out.println("Qual é o seu Nome:");
String nome1 = sc.nextLine();
System.out.println("Qual sua Altura:");
double altura1 = sc.nextDouble();
System.out.println("Informe o dia de Nascimento: ");
int diaNascimento1 = sc.nextInt();
System.out.println("Informe o mês de Nascimento: ");
int mesNascimento1 = sc.nextInt();
System.out.println("Informe o ano de Nascimento: ");
int anoNascimento1 = sc.nextInt();


    Pessoa teste1 = new Pessoa(nome1, altura1, diaNascimento1, mesNascimento1, anoNascimento1);
    Pessoa henrique = new Pessoa("Henrique", 1.86, 2, 9, 2006);
    
    System.out.println("===============================");
    System.out.println("Nome: "+henrique.getNome());
    System.out.println("Altura: "+henrique.getAltura());
    System.out.println("Idade: "+henrique.getIdade());
    System.out.println("===============================");
    System.out.println("===============================");
    System.out.println("Nome: "+teste1.getNome());
    System.out.println("Altura: "+teste1.getAltura());
    System.out.println("Idade: "+teste1.getIdade());
    System.out.println("===============================");

    }
}
