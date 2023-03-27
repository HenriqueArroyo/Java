package EstrutaDecisaoIfElse;

import java.util.Scanner;

public class DecisaoIfElse {
 Scanner sc = new Scanner(System.in);
 //If desencadeado
 public void DecisaoIf() {
    System.out.println("Informe o Preço do Produto");
    double precoProduto = sc.nextDouble();
    double desconto = 0;
    //se o preço do produto>= 100 então desconto = 5
    if (precoProduto>=100&precoProduto<200) {
        desconto = 5;
    }
    if (precoProduto>=200&precoProduto<300) {
        desconto = 10;
    }
    if (precoProduto>=300) {
        desconto = 15;
    }
     //realizar a conta
     double valorDesconto = precoProduto*desconto/100;
     double precoFinal = precoProduto-valorDesconto;
     System.out.println("O valor do produto é R$ "+ precoFinal);
    
    }
    //If Encadeado (If-Else)
    public void DecisaoIfElse() {
        System.out.println("Informe o Preço do Produto");
    double precoProduto = sc.nextDouble();
    double desconto;
    //Estrutura Decisão encadeado If seguida de um Else
    if (precoProduto>=300) {desconto=15;}
    else if (precoProduto>=200) {desconto = 10;}
    else if (precoProduto>=100) {
        desconto = 5;
    
    } else {desconto = 0;}
 
    double valorDesconto = precoProduto*desconto/100;
    double precoFinal = precoProduto-valorDesconto;
    System.out.println("O valor do produto é R$ "+ precoFinal);
   
   }
}


