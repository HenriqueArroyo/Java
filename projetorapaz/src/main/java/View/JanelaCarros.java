package View;

import Connection.CarrosDAO;
import Controller.CarrosControl;

import java.util.List;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Model.Carros;
import javafx.event.ActionEvent;

public class JanelaCarros extends JPanel {
    // Atributos
private JButton cadastrar, apagar, editar, limpar;
private JTextField carMarcaField, carModeloField, carAnoField, carPlacaField,
carValorField;
private List<Carros> carros;
private JTable table;
private DefaultTableModel tableModel;
private int linhaSelecionada = -1;

// Construtor
public JanelaCarros() {
super();
// entrada de dados
setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
add(new JLabel("Cadastro Carros"));
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
JPanel botoes = new JPanel();
botoes.add(cadastrar = new JButton("Cadastrar"));
botoes.add(editar = new JButton("Editar"));
botoes.add(apagar = new JButton("Apagar"));
botoes.add(limpar = new JButton("Limpar"));
add(botoes);
// tabela de carros
JScrollPane jSPane = new JScrollPane();
add(jSPane);
tableModel = new DefaultTableModel(new Object[][] {},
new String[] { "Marca", "Modelo", "Ano", "Placa", "Valor" });
table = new JTable(tableModel);
jSPane.setViewportView(table);

new CarrosDAO().criaTabela();

atualizarTabela();



//Tratamento
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

CarrosControl operacoes = new CarrosControl(carros, tableModel, table);

cadastrar.addActionListener(
    e-> {
    operacoes.cadastrar(carMarcaField.getText(), carModeloField.getText(),
    carAnoField.getText(),carPlacaField.getText(), carValorField.getText());

    carMarcaField.setText("");
carModeloField.setText("");
carAnoField.setText("");
carPlacaField.setText("");
carValorField.setText("");
});

apagar.addActionListener( 
    e-> {
    operacoes.apagar(carPlacaField.getText());
    
    carMarcaField.setText("");
carModeloField.setText("");
carAnoField.setText("");
carPlacaField.setText("");
carValorField.setText("");

});

limpar.addActionListener( 
    e-> {
    operacoes.limpar();
    
carPlacaField.setText("");
carMarcaField.setText("");
carModeloField.setText("");
carAnoField.setText("");
carPlacaField.setText("");
carValorField.setText("");

});









}

private void atualizarTabela() {
 tableModel.setRowCount(0);
 carros = new CarrosDAO().listarTodos();

 for (Carros carro : carros) {
    tableModel.addRow(new Object[] {carro.getMarca(), carro.getModelo(),
    carro.getAno(), carro.getPlaca(), carro.getValor()});
 }


}







}


// Métodos de Atualizar tabela


