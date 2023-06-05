package POOBanco;


import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Contas numContas[] = new Contas[3];
        numContas[i] = new Contas() {
            
        };


        //imprimir
       int acao = 0;
     while (true) {
        JOptionPane.showMessageDialog(null, "Banco Mundial Senai\nOpção 1 - Criar Conta\n Opção 2 - Buscar Conta\n Opção 3 - Sair\n");
        acao = Integer.parseInt(JOptionPane.showInputDialog("Informe a Ação"));

        if (acao == 3) {
            System.out.print("\nAté logo!");
            sc.close(); 
        }

        switch (acao) {
        case 1:
            System.out.print("\nOpção Criação de Conta ");
            
        break;
        case 2:
            System.out.print("\nOpção Buscar Conta\n");
            int cont=0;
            String numBuscado = JOptionPane.showInputDialog("Digite o Nº Buscado: ");
            boolean naoEncontrei = true;
            while (naoEncontrei) {
               if (numBuscado.equals(numConta[cont].getNome())) {
                   naoEncontrei = false;
                   JOptionPane.showMessageDialog(null,"Idade: "+contatos[cont].getIdade());
                   JOptionPane.showMessageDialog(null,"Telefone: "+numCont[cont].getTelefone());
                   
               } 
               cont ++;
            }
            break;

        default:
            System.out.print("\nOpção Inválida!");
            break;
    }


    }
}}