package View;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Connection.CarrosDAO;
import Connection.ClientesDAO;
import Connection.VendasDAO;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Controller.CarrosControl;
import Controller.ClientesControl;
import Controller.VendasControl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.awt.*;

import Model.Carros;
import Model.Vendas;
import Model.Clientes;


public class JanelaVendas extends JPanel {
    // Atributos - Componentes
    private JTextField inputData;
    private JTextField inputCliente;
    private JTextField inputValor;
    private JTextField inputCarro;

    private JLabel labelData;
    private JLabel labelCliente;
    private JLabel labelValor;
    private JLabel labelCarro;

    private DefaultTableModel tableModel;
    private JTable table;
    private List<Vendas> vendas = new ArrayList<>();
    private List<Carros> carros;
    private List<Clientes> clientes;
    private int linhaSelecionada = -1;
    private JButton cadastrarButton, apagarButton, editarButton, atualizarButton;
    JComboBox<String> carrosComboBox;
    JComboBox<String> clientesComboBox;

    // Construtor(GUI-JPanel)
    public JanelaVendas() {
        JPanel frame1 = new JPanel(new BorderLayout());
        JPanel inputFrame = new JPanel();
        JPanel botoes = new JPanel();

        carrosComboBox = new JComboBox<>();
        clientesComboBox = new JComboBox<>();

        // Construção da tabela
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Data");
        tableModel.addColumn("Cliente");
        tableModel.addColumn("Valor");
        tableModel.addColumn("Carro");
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setViewportView(table);

        // Inicialização dos componentes
        inputCliente = new JTextField(20);
        inputData = new JTextField(10);
        inputCarro = new JTextField(20);
        inputValor = new JTextField(10);

        // Inicialização dos labels
        labelCarro = new JLabel("Carro");
        labelData = new JLabel("Data");
        labelValor = new JLabel("Valor");

        // Inicialização dos botões
        cadastrarButton = new JButton("Comprar");
        cadastrarButton.setBackground(Color.white);
        apagarButton = new JButton("Apagar");
        apagarButton.setBackground(Color.white);
        editarButton = new JButton("Editar");
        editarButton.setBackground(Color.white);
        atualizarButton = new JButton("Atualizar");
        atualizarButton.setBackground(Color.white);

        // Adição dos componentes ao painel
        inputFrame.add(clientesComboBox);
        inputFrame.add(carrosComboBox);
        inputFrame.add(labelData);
        inputFrame.add(inputData);
        inputFrame.add(labelValor);
        inputFrame.add(inputValor);

        botoes.add(cadastrarButton);
        botoes.add(editarButton);
        botoes.add(apagarButton);
        botoes.add(atualizarButton);

        this.add(frame1);
        frame1.add(scrollPane, BorderLayout.CENTER);
        frame1.add(inputFrame, BorderLayout.SOUTH);
        frame1.add(botoes, BorderLayout.NORTH);

        // Configuração dos ComboBoxes
        carrosComboBox.addItem("Selecione um Carro");
        clientesComboBox.addItem("Selecione um cliente");

        // Carregamento dos ComboBoxes com dados do banco
        carros = new CarrosDAO().listarTodos();
        clientes = new ClientesDAO().listarTodos();

        for (Carros carro : carros) {
            carrosComboBox.addItem(carro.getMarca() + " " + carro.getModelo());
        }

        for (Clientes cliente : clientes) {
            clientesComboBox.addItem(cliente.getNome() + " " + cliente.getCpf());
        }

        // Criação do banco de dados
        new VendasDAO().criaTabela();

        // Inclusão dos elementos do banco na criação do painel
        atualizarTabela();

        // Tratamento de eventos
        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                linhaSelecionada = table.rowAtPoint(evt.getPoint());
                if (linhaSelecionada != -1) {
                    inputData.setText((String) table.getValueAt(linhaSelecionada, 0));
                    inputCliente.setText((String) table.getValueAt(linhaSelecionada, 1));
                    inputValor.setText((String) table.getValueAt(linhaSelecionada, 2));
                    inputCarro.setText((String) table.getValueAt(linhaSelecionada, 3));
                }
            }
        });

        // Criação do objeto de operações no banco de dados
        VendasControl operacoes = new VendasControl(vendas, tableModel, table);

        // Configuração da ação do botão "Cadastrar"
        cadastrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = inputData.getText();
                String valor = inputValor.getText();
                String clienteSelecionado = (String) clientesComboBox.getSelectedItem();
                String carroSelecionado = (String) carrosComboBox.getSelectedItem();

                if (data.isEmpty() || valor.isEmpty() || clienteSelecionado.equals("Selecione um cliente")
                        || carroSelecionado.equals("Selecione um Carro")) {
                    JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
                } else {
                    if (!valor.matches("[0-9]+")) {
                        JOptionPane.showMessageDialog(null, "O campo 'Valor' deve conter apenas números.");
                    } else {
                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                        dateFormat.setLenient(false);

                        try {
                            Date parsedDate = dateFormat.parse(data);
                            if (!data.equals(dateFormat.format(parsedDate))) {
                                throw new ParseException("Formato inválido", 0);
                            }

                            String cliente = clienteSelecionado.split(" ")[0];
                            operacoes.cadastrar(data, cliente, valor, carroSelecionado);
                            inputData.setText("");
                            inputValor.setText("");
                            clientesComboBox.setSelectedIndex(0);
                            carrosComboBox.setSelectedIndex(0);
                            new CarrosDAO().apagar(carroSelecionado);
                            JOptionPane.showMessageDialog(null, "Venda cadastrada com sucesso!");
                        } catch (ParseException ex) {
                            JOptionPane.showMessageDialog(null,
                                    "Formato de data inválido. Utilize o formato dd/MM/yyyy.");
                        }
                    }
                }
            }
        });

        // Configuração da ação do botão "Editar"
        editarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String clienteSelecionado = (String) clientesComboBox.getSelectedItem();
                String carroSelecionado = (String) carrosComboBox.getSelectedItem();
                if (inputCarro.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Selecione algo para editar");
                } else {
                    operacoes.atualizar(inputData.getText(), clienteSelecionado, inputValor.getText(),
                            carroSelecionado);

                    // Limpa os campos de entrada após a operação de atualização
                    inputData.setText("");
                    inputValor.setText("");
                    clientesComboBox.setSelectedIndex(0);
                    carrosComboBox.setSelectedIndex(0);
                    JOptionPane.showMessageDialog(null, "Editado com Sucesso!");
                }
            }
        });

        // Configuração da ação do botão "Apagar"
        apagarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String carroSelecionado = (String) carrosComboBox.getSelectedItem();
                if (inputCarro.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Selecione um registro para apagar.");
                } else {
                    int resposta = JOptionPane.showConfirmDialog(null,
                            "Tem certeza de que deseja apagar os campos?", "Confirmação",
                            JOptionPane.YES_NO_OPTION);
                    if (resposta == JOptionPane.YES_OPTION) {
                        operacoes.apagar(inputCarro.getText());
                        JOptionPane.showMessageDialog(null, "A venda deletada com Sucesso!");

                        // Limpa os campos de entrada após a operação de exclusão
                        inputData.setText("");
                        inputValor.setText("");
                        clientesComboBox.setSelectedIndex(0);
                        carrosComboBox.setSelectedIndex(0);
                    } else {
                        JOptionPane.showMessageDialog(null, "A venda foi Cancelada!");
                    }
                }
            }
        });

        // Configuração da ação do botão "Atualizar"
        atualizarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                atualizarComboBoxClientes();
                atualizarComboBoxCarros();
            }
        });
    }

    // Atualiza a tabela de vendas com os dados do banco
    private void atualizarTabela() {
        tableModel.setRowCount(0);
        vendas = new VendasDAO().listarTodos();
        for (Vendas venda : vendas) {
            tableModel.addRow(new Object[] { venda.getData(), venda.getCliente(), venda.getValor(),
                    venda.getTipoCarro() });
        }
    }

    // Atualiza o ComboBox de clientes com os dados do banco
    private void atualizarComboBoxClientes() {
        clientesComboBox.removeAllItems();
        clientesComboBox.addItem("Selecione um cliente");
        clientes = new ClientesDAO().listarTodos();
        for (Clientes cliente : clientes) {
            clientesComboBox.addItem(cliente.getNome() + " " + cliente.getCpf());
        }
    }

    // Atualiza o ComboBox de carros com os dados do banco
    private void atualizarComboBoxCarros() {
        carrosComboBox.removeAllItems();
        carrosComboBox.addItem("Selecione um Carro");
        carros = new CarrosDAO().listarTodos();
        for (Carros carro : carros) {
            carrosComboBox.addItem(carro.getMarca() + " " + carro.getModelo());
        }
    }
}
