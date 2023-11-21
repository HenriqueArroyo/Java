package View;

import java.awt.CardLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Connection.CarrosDAO;
import Controller.CarrosControl;
import Model.Carros;

public class JanelaClientes extends JFrame {
    private JPanel panel;
    private CardLayout cardLayout;
    private List<Carros> carros;
    private DefaultTableModel tableModel;
    private JTable table;

    
    public JanelaClientes() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Loja de Carros");
        
        panel = new JPanel();
        cardLayout = new CardLayout();
        panel.setLayout(cardLayout);

        createCard("Home");
        createCard("Cadastrar");
        createCard("Comprar");
        createCard("Vender");
        createCard("Histórico");
        createCard("Visão Geral");
        
        new CarrosDAO().criaTabela();
       


        cardLayout.show(panel, "Home");

        getContentPane().add(panel);
        setSize(470, 400);
        setResizable(true);
    }

    private void createCard(String cardName) {
        // Cria um novo JPanel para o cartão com layout GridBagLayout
        JPanel card = new JPanel(new GridBagLayout());
        
        // Configuração de restrições para o layout do GridBagLayout
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;
        constraints.insets = new Insets(3, 3, 3, 3);
        int pontuacao = 0;
    
        // Verifica qual tela está sendo criada com base no nome passado como argumento
        if (cardName.equals("Home")) {
            // Criação de componentes para a tela Home
            JLabel cabecalho = new JLabel("Tela Inicial");
            JButton button1 = new JButton("Cadastrar");
            JButton button2 = new JButton("Comprar");
            JButton button3 = new JButton("Vender");
            JButton button4 = new JButton("Apagar");
            JButton button5 = new JButton("Visão Geral");
            JButton button6 = new JButton("Histórico");
    
            // Configuração das restrições para posicionar os componentes no cartão
            constraints.gridy = 0;
            constraints.gridx = 1;
            card.add(cabecalho, constraints);

            constraints.gridx = 0;
            constraints.gridy = 1;
            card.add(button1, constraints);

            constraints.gridx = 1;
            constraints.gridy = 1;
            card.add(button2, constraints);

              constraints.gridx = 2;
            constraints.gridy = 1;
            card.add(button3, constraints);

            constraints.gridx = 0;
            constraints.gridy = 2;
            card.add(button4, constraints);

            constraints.gridx = 1;
            constraints.gridy = 2;
            card.add(button5, constraints);

            constraints.gridx = 2;
            constraints.gridy = 2;
            card.add(button6, constraints);
            // Adiciona ações aos botões para alternar entre telas
            button1.addActionListener(e -> cardLayout.show(panel, "Cadastrar"));
            button2.addActionListener(e -> cardLayout.show(panel, "Comprar"));
            button3.addActionListener(e -> cardLayout.show(panel, "Vender"));
            button4.addActionListener(e -> cardLayout.show(panel, "Histórico"));
            button5.addActionListener(e -> cardLayout.show(panel, "Visão Geral"));
            button6.addActionListener(e -> cardLayout.show(panel, "Sobre"));
        } else if (cardName.equals("Cadastrar")) {
            // Criação de componentes para a tela de Login
            JLabel titulo = new JLabel("Cadastro Cliente");

            JLabel CPFlabel = new JLabel("CPF");
            JTextField CPFfield = new JTextField();

            JLabel Nomelabel = new JLabel("Nome");
            JTextField Nomefield = new JTextField();
            
            JLabel CEPlabel = new JLabel("CEP");
            JTextField CEPfield = new JTextField();

            JLabel Telefonelabel = new JLabel("Telefone");
            JTextField Telefonefield = new JTextField();

            JButton voltar = new JButton("Voltar");
            JButton cadastrar = new JButton("Registrar");
    
            // Configuração das restrições para posicionar os componentes no cartão
           constraints.gridy = 0;
           constraints.gridx = 1;
           card.add(titulo, constraints);

           constraints.gridy = 1;
           constraints.gridx = 0;
           card.add(CPFlabel, constraints);

           constraints.gridy = 1;
           constraints.gridx = 1;
           card.add(CPFfield, constraints);

           constraints.gridy = 2;
           constraints.gridx = 0;
           card.add(Nomelabel, constraints);

           constraints.gridy = 2;
           constraints.gridx = 1;
           card.add(Nomefield, constraints);

           constraints.gridy = 3;
           constraints.gridx = 0;
           card.add(CEPlabel, constraints);

           constraints.gridy = 3;
           constraints.gridx = 1;
           card.add(CEPfield, constraints);

           constraints.gridy = 4;
           constraints.gridx = 0;
           card.add(Telefonelabel, constraints);

           constraints.gridy = 4;
           constraints.gridx = 1;
           card.add(Telefonefield, constraints);

           constraints.gridy = 5;
           constraints.gridx = 0;
           card.add(voltar, constraints);
            
           constraints.gridy = 5;
           constraints.gridx = 1;
           card.add(cadastrar, constraints);


            // Adiciona ações aos botões para alternar entre telas
            voltar.addActionListener(e -> cardLayout.show(panel, "Home"));
        } else if (cardName.equals("Comprar")) {
                   // Criação de componentes para a tela de Login
            JLabel titulo = new JLabel("Comprar");

            JLabel CPFlabel = new JLabel("CPF");
            JTextField CPFfield = new JTextField();

            JLabel Marcalabel = new JLabel("Marca");
            JTextField Marcafield = new JTextField();

            JLabel Modelolabel = new JLabel("Modelo");
            JTextField Modelofield = new JTextField();
            
            JLabel Anolabel = new JLabel("Ano");
            JTextField Anofield = new JTextField();

            JLabel Placalabel = new JLabel("Placa");
            JTextField Placafield = new JTextField();

            JLabel Valorlabel = new JLabel("Valor");
            JTextField Valorfield = new JTextField();

            JButton voltar = new JButton("Voltar");
            JButton comprar = new JButton("Declarar");

            CarrosControl operacoes = new CarrosControl(carros, tableModel, table);


            cadastrar.addActionListener(
                e-> {
                operacoes.cadastrar(Marcafield.getText(), Modelofield.getText(),
                Anofield.getText(),Placafield.getText(), Valorfield.getText());
            
                Marcafield.setText("");
            Modelofield.setText("");
            Anofield.setText("");
            Placafield.setText("");
            Valorfield.setText("");
            });

    
            // Configuração das restrições para posicionar os componentes no cartão
           constraints.gridy = 0;
           constraints.gridx = 1;
           card.add(titulo, constraints);

           constraints.gridy = 1;
           constraints.gridx = 0;
           card.add(CPFlabel, constraints);

           constraints.gridy = 1;
           constraints.gridx = 1;
           card.add(CPFfield, constraints);


           constraints.gridy = 2;
           constraints.gridx = 0;
           card.add(Marcalabel, constraints);

           constraints.gridy = 2;
           constraints.gridx = 1;
           card.add(Marcafield, constraints);

           constraints.gridy = 3;
           constraints.gridx = 0;
           card.add(Modelolabel, constraints);

           constraints.gridy = 3;
           constraints.gridx = 1;
           card.add(Modelofield, constraints);

           constraints.gridy = 4;
           constraints.gridx = 0;
           card.add(Anolabel, constraints);

           constraints.gridy = 4;
           constraints.gridx = 1;
           card.add(Anofield, constraints);

           constraints.gridy = 5;
           constraints.gridx = 0;
           card.add(Placalabel, constraints);

           constraints.gridy = 5;
           constraints.gridx = 1;
           card.add(Placafield, constraints);

           constraints.gridy = 6;
           constraints.gridx = 0;
           card.add(Valorlabel, constraints);

           constraints.gridy = 6;
           constraints.gridx = 1;
           card.add(Valorfield, constraints);

           constraints.gridy = 7;
           constraints.gridx = 0;
           card.add(voltar, constraints);
            
           constraints.gridy = 7;
           constraints.gridx = 1;
           card.add(comprar, constraints);


            // Adiciona ações aos botões para alternar entre telas
            voltar.addActionListener(e -> cardLayout.show(panel, "Home"));
        } 
        else if (cardName.equals("Vender")) {
                 // Criação de componentes para a tela de Login
            JLabel titulo = new JLabel("Vender");

            JLabel CPFlabel = new JLabel("CPF");
            JTextField CPFfield = new JTextField();

            JLabel Placalabel = new JLabel("Placa");
            JTextField Placafield = new JTextField();

            JLabel Valorlabel = new JLabel("Valor");
            JTextField Valorfield = new JTextField();

            JButton voltar = new JButton("Voltar");
            JButton comprar = new JButton("Declarar");
    
            // Configuração das restrições para posicionar os componentes no cartão
           constraints.gridy = 0;
           constraints.gridx = 1;
           card.add(titulo, constraints);

           constraints.gridy = 1;
           constraints.gridx = 0;
           card.add(CPFlabel, constraints);

           constraints.gridy = 1;
           constraints.gridx = 1;
           card.add(CPFfield, constraints);

           constraints.gridy = 2;
           constraints.gridx = 0;
           card.add(Placalabel, constraints);

           constraints.gridy = 2;
           constraints.gridx = 1;
           card.add(Placafield, constraints);

           constraints.gridy = 3;
           constraints.gridx = 0;
           card.add(Valorlabel, constraints);

           constraints.gridy = 3;
           constraints.gridx = 1;
           card.add(Valorfield, constraints);

           constraints.gridy = 4;
           constraints.gridx = 0;
           card.add(voltar, constraints);
            
           constraints.gridy = 4;
           constraints.gridx = 1;
           card.add(comprar, constraints);


            // Adiciona ações aos botões para alternar entre telas
            voltar.addActionListener(e -> cardLayout.show(panel, "Home"));
        }
        else if (cardName.equals("Quarta")) {
                // Criação de componentes para a tela de Login
            JLabel log = new JLabel("Questão 4 - Quem é o maior artilheiro do Brasileirão?");
            JButton alternativa1 = new JButton("Diego Souza");
            JButton alternativa2 = new JButton("Romário");
            JButton alternativa3 = new JButton("Fred");
            JButton alternativa4 = new JButton("Dinamite");
    
            // Configuração das restrições para posicionar os componentes no cartão
            constraints.gridy = 0;
              constraints.gridx = 1;
            card.add(log, constraints);
            constraints.gridy = 1;
              constraints.gridx = 1;
            card.add(alternativa1, constraints);
            constraints.gridy = 2;
            card.add(alternativa2, constraints);
            constraints.gridy = 4;
            card.add(alternativa3, constraints);
               constraints.gridy = 3;
            card.add(alternativa4, constraints);
            // Adiciona ações aos botões para alternar entre telas
            alternativa1.addActionListener(e -> cardLayout.show(panel, "Errado"));
            alternativa2.addActionListener(e -> cardLayout.show(panel, "Errado"));
            alternativa3.addActionListener(e -> cardLayout.show(panel, "Errado"));
            alternativa4.addActionListener(e -> cardLayout.show(panel, "Quinta"));
        }
         else if (cardName.equals("Quinta")) {
                // Criação de componentes para a tela de Login
            JLabel log = new JLabel("Questão 5 - Que time foi campeão da libertadores 2004?");
            JButton alternativa1 = new JButton("Olimpia");
            JButton alternativa2 = new JButton("Grêmio");
            JButton alternativa3 = new JButton("Boca Juniors");
            JButton alternativa4 = new JButton("Once Caldas");
    
            // Configuração das restrições para posicionar os componentes no cartão
            constraints.gridy = 0;
              constraints.gridx = 1;
            card.add(log, constraints);
            constraints.gridy = 1;
              constraints.gridx = 1;
            card.add(alternativa1, constraints);
            constraints.gridy = 2;
            card.add(alternativa2, constraints);
            constraints.gridy = 4;
            card.add(alternativa3, constraints);
               constraints.gridy = 3;
            card.add(alternativa4, constraints);
            // Adiciona ações aos botões para alternar entre telas
            alternativa1.addActionListener(e -> cardLayout.show(panel, "Errado"));
            alternativa2.addActionListener(e -> cardLayout.show(panel, "Errado"));
            alternativa3.addActionListener(e -> cardLayout.show(panel, "Errado"));
            alternativa4.addActionListener(e -> cardLayout.show(panel, "Parabens"));
    
         }
         else if (cardName.equals("Parabens")) {
                     // Criação de componentes para a tela Home
            JLabel cabecalho = new JLabel("Você Venceuu!!!!");
            JButton button1 = new JButton("Voltar");
    
            // Configuração das restrições para posicionar os componentes no cartão
            constraints.gridy = 0;
            card.add(cabecalho, constraints);
            constraints.gridy = 2;
            card.add(button1, constraints);
            // Adiciona ações aos botões para alternar entre telas
            button1.addActionListener(e -> cardLayout.show(panel, "Home"));
         }
          else if (cardName.equals("Errado")) {
                     // Criação de componentes para a tela Home
            JLabel cabecalho = new JLabel("Você Perdeu!!!!");
            JButton button1 = new JButton("Voltar");
    
            // Configuração das restrições para posicionar os componentes no cartão
            constraints.gridy = 0;
            card.add(cabecalho, constraints);
            constraints.gridy = 2;
            card.add(button1, constraints);
            // Adiciona ações aos botões para alternar entre telas
            button1.addActionListener(e -> cardLayout.show(panel, "Home"));
         }
        // Adiciona o cartão ao painel com o nome especificado
        panel.add(card, cardName);
    }
    


     public static void main(String[] args) {
        JanelaClientes cl = new JanelaClientes();
        cl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        cl.setVisible(true);
     }
}