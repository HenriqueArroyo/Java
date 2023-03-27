package ExerciciosIfElse;

import java.util.Scanner;

public class Exercicios {
   
    Scanner sc = new Scanner(System.in);
    public void Exercicio1() {
    System.out.println("Informe o Primeiro Valor:");
    int valor1 = sc.nextInt();
    System.out.println("Informe o Segundo Valor:");
    int valor2 = sc.nextInt();
    // if
    if (valor1>valor2) {
        System.out.println("O Primeiro Valor é maior "+valor1);
    } else {System.out.println("O Segundo Valor é maior "+valor2);}
    
    }
    public void Exercicio2() {
    System.out.println("Informe seu Ano de Nascimento:");
    double anoNascimento = sc.nextDouble();
    double idade = 2023-anoNascimento;
    if(idade>=16) {System.out.println("O Eleitor poderá votar");}
    else{System.out.println("O Eleitor está impedido de Votar");}
   
}

public void Exercicio3() {
    System.out.println("Informe a Senha:");
    short senha = sc.nextShort();
    if(senha==1234) {System.out.println("Acesso Permitido");}
    else {System.out.println("Acesso Negado");}

    
}
public void Exercicio4() {
    System.out.println("Informe a Quantidade de Maçãs que foram Compradas:");
    short macas = sc.nextShort();
    double precoMacas;
    if (macas>=12) {precoMacas=0.25;
           } else {precoMacas=0.30;}
    double precoTotal = precoMacas*macas;
    System.out.println("O Valor Total Gasto foi de R$ "+precoTotal+".");
}
public void Exercicio5() {
    System.out.println("Informe o Primeiro Valor:");
    short valor1 = sc.nextShort();
    System.out.println("Informe o Segundo Valor:");
    short valor2 = sc.nextShort();
    System.out.println("Informe o Terceiro Valor:");
    short valor3 = sc.nextShort();
    
    if (valor1>valor2&&valor2>valor3){System.out.println("A ordem será: "+valor3+" "+valor2+" "+valor1);}
    else if (valor1>valor2&&valor3>valor2){System.out.println("A ordem será: "+valor2+" "+valor3+" "+valor1);}
    else if (valor2>valor1&&valor1>valor3){System.out.println("A ordem será: "+valor3+" "+valor1+" "+valor2);}
    else if (valor2>valor1&&valor2>valor3){System.out.println("A ordem será: "+valor1+" "+valor3+" "+valor2);}
    else if (valor3>valor1&&valor1>valor2){System.out.println("A ordem será: "+valor2+" "+valor1+" "+valor3);}
    else if (valor3>valor1&&valor2>valor1){System.out.println("A ordem será: "+valor1+" "+valor2+" "+valor3);}
    
}
 public void Exercicio6() {
    System.out.println("Informe a sua Altura (ex:1.80):");
    double altura = sc.nextDouble();
    System.out.println("Informe seu Gênero (1-Masculino e 2-Feminino):");
    double sexo = sc.nextDouble();
    double calculoPeso;
    double calculoPeso2;
     if (sexo==1){calculoPeso=72.7; calculoPeso2=58;}
     else if (sexo==2){calculoPeso=62.1; calculoPeso2=44.7;}
     else{calculoPeso=0; calculoPeso2=0;}
    double pesoIdeal = (altura*calculoPeso)-calculoPeso2;
    System.out.println("Seu peso ideal é "+pesoIdeal);
 }

 public void Exercicio7() {
    System.out.println("Informe a Primeira Nota do Aluno:");
    short nota1 = sc.nextShort();
    System.out.println("Informe a Segunda Nota do Aluno:");
    short nota2 = sc.nextShort();
    double mediaNota = (nota1+nota2)/2;
    
    if (mediaNota>=50) {System.out.println("A média do Aluno foi "+mediaNota+", o Aluno está aprovado!!");
        }
    else {System.out.println("A média do Aluno foi "+mediaNota+", O Aluno está Reprovado!!");}
System.out.println("Informe a Frequência do Aluno:");
int frequencia = sc.nextShort();
if (frequencia>=75) {System.out.println("O Aluno está Aprovado em Frequência!!");
}
else {System.out.println("O Aluno está Reprovado em Frequência!!");}

if (mediaNota>=50&&frequencia>=75) {System.out.println("O Aluno está Aprovado no Curso!!");
    }
else {System.out.println("O Aluno foi Reprovado no Curso!!");}
 }
}

