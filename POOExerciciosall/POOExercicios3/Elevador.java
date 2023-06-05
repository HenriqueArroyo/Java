package POOExercicios3;

import javax.swing.JOptionPane;

public class Elevador {
    int nMaxPessoas;
    int nMaxAndares;
    int andarAtual;
    int capacidadeAtual;
    //construtor
    public Elevador(int nMaxPessoas, int nMaxAndares) {
        this.nMaxPessoas = nMaxPessoas;
        this.nMaxAndares = nMaxAndares;
    }
    //set and gets
    public int getAndarAtual() {
        return andarAtual;
    }
    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }
    public int getCapacidadeAtual() {
        return capacidadeAtual;
    }
    public void setCapacidadeAtual(int capacidadeAtual) {
        this.capacidadeAtual = capacidadeAtual;
    }

    //iniciar
     public void iniciar() {
        capacidadeAtual=0;
        andarAtual=0;
     }
     public void entrar(int pessoas) {
        if ((capacidadeAtual+pessoas)>=nMaxPessoas) {
                JOptionPane.showMessageDialog(null, "Capacidade Máxima Atingida");
                JOptionPane.showMessageDialog(null, "Pessoas para fora "
                +(capacidadeAtual+pessoas-nMaxPessoas));

        } else {
            capacidadeAtual+=pessoas;
        }
     }
     //sair
     public void sair(int pessoas) {
        if (pessoas<capacidadeAtual) {
            capacidadeAtual-=pessoas;
        } else {
            JOptionPane.showMessageDialog(null, "Informe um nº válido "+ "Quantidade atual: "+capacidadeAtual);
        }
            
        }
    //Subir
    public void subir(int nAndares) {
        if (nAndares+andarAtual>nMaxAndares) {
            JOptionPane.showMessageDialog(null, "Não pode subir ");
            JOptionPane.showMessageDialog(null, "Andar Atual "+andarAtual);
        } else {
            andarAtual+=nAndares;
        }}
    //Descer
    public void descer(int nAndares) {
        if (nAndares<andarAtual) {
            andarAtual -= nAndares;
        }
        else {
            JOptionPane.showMessageDialog(null, "Informe um nº válido, Andar atual: "
            +andarAtual);
        }
    }
    
     }







