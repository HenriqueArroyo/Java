package View;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class JanelaPrincipal extends JFrame{
// criação do tabbedPane para incluir as tabs
private JTabbedPane jTPane;
public JanelaPrincipal() {
jTPane = new JTabbedPane();
add(jTPane);
// criandos as tabs
// tab1 carros
JanelaClientes tab1 = new JanelaClientes();
JanelaCarros tab2 = new JanelaCarros();
jTPane.add("Clientes", tab1);
jTPane.add("Carros", tab2);
setBounds(100, 100, 600, 600);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
//métodos para tornar a janela visível
public void run(){
this.setVisible(true);
}
}