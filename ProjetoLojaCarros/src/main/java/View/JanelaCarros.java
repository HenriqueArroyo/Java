package View;

import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Connection.CarrosDAO;
import Controller.CarrosControl;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

import Model.Carros;

import java.lang.Object;

public class JanelaCarros extends JPanel {
    // Atributos(componentes)
    private JButton cadastrar, apagar, editar;
    private JTextField carMarcaField, carModeloField, carAnoField, carPlacaField, carValorField;
    private List<Carros> carros;
    private JTable table;
    private DefaultTableModel tableModel;
    private int linhaSelecionada = -1;

    // Construtor(GUI-JPanel)
    public JanelaCarros() {
        super();

        // Configuração da interface gráfica
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new JLabel("Cadastro Carros"));

        // Painel de entrada de dados
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(5, 2));
        inputPanel.add(new JLabel("Marca"));
        carMarcaField = new JTextField(20);
        inputPanel.add(carMarcaField);
        inputPanel.add(new JLabel("Modelo"));
        carModeloField = new JTextField(20);
        inputPanel.add(carModeloField);
        inputPanel.add(new JLabel("Ano"));
        carAnoField = new JTextField(20);
        inputPanel.add(carAnoField);
        inputPanel.add(new JLabel("Placa"));
        carPlacaField = new JTextField(20);
        inputPanel.add(carPlacaField);
        inputPanel.add(new JLabel("Valor"));
        carValorField = new JTextField(20);
        inputPanel.add(carValorField);
        add(inputPanel);

        // Painel de botões
        JPanel botoes = new JPanel();
        botoes.add(cadastrar = new JButton("Cadastrar"));
        cadastrar.setBackground(Color.white);
        botoes.add(editar = new JButton("Editar"));
        editar.setBackground(Color.white);
        botoes.add(apagar = new JButton("Apagar"));
        apagar.setBackground(Color.white);

        // Tabela de carros
        JScrollPane jSPane = new JScrollPane();
        add(jSPane);
        tableModel = new DefaultTableModel(new Object[][] {},
                new String[] { "Marca", "Modelo", "Ano", "Placa", "Valor" });
        table = new JTable(tableModel);
        jSPane.setViewportView(table);

        // Criação do banco de dados
        add(botoes);
        new CarrosDAO().criaTabela();
        atualizarTabela();

        // Tratamento de eventos
        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                linhaSelecionada = table.rowAtPoint(evt.getPoint());
                if (linhaSelecionada != -1) {
                    carMarcaField.setText((String) table.getValueAt(linhaSelecionada, 0));
                    carModeloField.setText((String) table.getValueAt(linhaSelecionada, 1));
                    carAnoField.setText((String) table.getValueAt(linhaSelecionada, 2));
                    carPlacaField.setText((String) table.getValueAt(linhaSelecionada, 3));
                    carValorField.setText((String) table.getValueAt(linhaSelecionada, 4));
                }
            }
        });

        // Criação do objeto de operações no banco de dados
        CarrosControl operacoes = new CarrosControl(carros, tableModel, table);

        // Configuração da ação do botão "Cadastrar"
        cadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Validar campos antes de cadastrar
                if (carMarcaField.getText().isEmpty() || carModeloField.getText().isEmpty()
                        || carAnoField.getText().isEmpty()
                        || carPlacaField.getText().isEmpty() || carValorField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "ATENÇÃO! \nExistem campos em branco");
                } else {
                    if (!carAnoField.getText().matches("[0-9]+")) {
                        JOptionPane.showMessageDialog(null, "O campo 'Ano' deve conter apenas números.");
                    } else if (!carValorField.getText().matches("[0-9]+")) {
                        JOptionPane.showMessageDialog(null, "O campo 'Valor' deve conter apenas números.");
                    } else {
                        // Chama o método "cadastrar" do objeto operacoes com os valores dos campos de entrada
                        operacoes.cadastrar(carMarcaField.getText(), carModeloField.getText(), carAnoField.getText(),
                                carPlacaField.getText(), carValorField.getText());
                        // Limpa os campos de entrada após a operação de cadastro
                        carMarcaField.setText("");
                        carModeloField.setText("");
                        carAnoField.setText("");
                        carPlacaField.setText("");
                        carValorField.setText("");
                    }
                }
            }
        });

        // Configuração da ação do botão "Editar"
        editar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (carPlacaField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Selecione algo para editar");
                } else {
                    // Chama o método "atualizar" do objeto operacoes com os valores dos campos de entrada
                    operacoes.atualizar(carMarcaField.getText(), carModeloField.getText(),
                            carAnoField.getText(), carPlacaField.getText(), carValorField.getText());

                    // Limpa os campos de entrada após a operação de atualização
                    carMarcaField.setText("");
                    carModeloField.setText("");
                    carAnoField.setText("");
                    carPlacaField.setText("");
                    carValorField.setText("");
                    JOptionPane.showMessageDialog(null, "Edição realizada com Sucesso!");
                }
            }
        });

        // Configuração da ação do botão "Apagar"
        apagar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (carPlacaField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Selecione um carro para apagar.");
                } else {
                    // Confirmação do usuário antes de apagar
                    int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza de que deseja apagar os campos?",
                            "Confirmação", JOptionPane.YES_NO_OPTION);
                    if (resposta == JOptionPane.YES_OPTION) {
                        // Chama o método "apagar" do objeto operacoes com o valor do campo de entrada "placa"
                        operacoes.apagar(carPlacaField.getText());
                        JOptionPane.showMessageDialog(null, "O Carro " + carModeloField.getText() + " de placa "
                                + carPlacaField.getText() + " foi deletado!");

                        // Limpa os campos de entrada após a operação de exclusão
                        carMarcaField.setText("");
                        carModeloField.setText("");
                        carAnoField.setText("");
                        carPlacaField.setText("");
                        carValorField.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "O carro não foi deletado!");
                    }
                }
            }
        });
    }

    // Atualiza a tabela de carros com os dados do banco de dados
    private void atualizarTabela() {
        // Atualiza a tabela pelo banco de dados
        tableModel.setRowCount(0);
        carros = new CarrosDAO().listarTodos();
        for (Carros carro : carros) {
            tableModel.addRow(new Object[] { carro.getMarca(), carro.getModelo(), carro.getAno(), carro.getPlaca(),
                    carro.getValor() });
        }
    }
}
