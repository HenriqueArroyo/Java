package POOExercicios2;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
    //criar vetor de objeto com 10 valores
    Agenda contatos[] = new Agenda[3];
    //criar os objetos e preencher os valores
    for (int i = 0; i < contatos.length; i++) {
    //construir o objeto
     contatos[i] = new Agenda();
     //PREENCHER
     contatos[i].setNome(JOptionPane.showInputDialog("Digite o Nome: "));
     contatos[i].setIdade(JOptionPane.showInputDialog("Digite a Idade: "));
     contatos[i].setTelefone(JOptionPane.showInputDialog("Digite o Telefone: "));
    }
       
     int cont=0;
     String nomeBuscado = JOptionPane.showInputDialog("Digite um Nome para Buscar");
     boolean naoEncontrei = true;
     while (naoEncontrei) {
        if (nomeBuscado.equals(contatos[cont].getNome())) {
            naoEncontrei = false;
            JOptionPane.showMessageDialog(null,"Idade: "+contatos[cont].getIdade());
            JOptionPane.showMessageDialog(null,"Telefone: "+contatos[cont].getTelefone());
            
        } 
        cont ++;
     }




    }
}
