package View;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class JanelaPrincipal extends JFrame {
    public JanelaPrincipal(){
        super("Loja de Carros");
        setDefaultCloseOperation(2);
        JTabbedPane abas = new JTabbedPane();
        abas.add("Carros", new JanelaCarros());
        abas.add("Clientes", new JanelaClientes());
        abas.add("Vendas", new JanelaVendas());
        this.add(abas);
        setBounds(300, 250, 1400, 600);
        setResizable(false);
    }

    public void run(){
        setVisible(true);
    }
    
}
