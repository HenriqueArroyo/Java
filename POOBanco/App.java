package POOBanco;


import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ContaPF exemplo1 = new ContaPF("199.596.390-96","Manuel Gomes",2550,1400);
        ContaPF exemplo2 = new ContaPF("081.021.690-60","Laura Silva",2555,1400);


        //imprimir
       int acao = 0;
     while (true) {
        JOptionPane.showMessageDialog(null, "Banco Mundial Senai\nOpção 1 - Criar Conta\n Opção 2 - Buscar Conta\n Opção 3 - Sair\n");
        acao = Integer.parseInt(JOptionPane.showInputDialog("Informe a Ação"));

        if (acao == 3) {
            JOptionPane.showMessageDialog(null,"Até Logo");
            sc.close(); 
        }

        switch (acao) {
        case 1:
        JOptionPane.showMessageDialog(null,"Criação de Conta");
            
        break;
        case 2:
            JOptionPane.showMessageDialog(null,"Opção Buscar Conta\nPessoa Física = 1\nPessoa Júridica = 2");

                
            
            break;

        default:
        JOptionPane.showMessageDialog(null,"Opção Inválida");
            break;
    }


    }
}}