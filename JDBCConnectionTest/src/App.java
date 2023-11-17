

import Connection.ConnectionDAO;

public class App {
    public static void main(String[] args){
        
        new  ConnectionDAO().criaTabela();
        new  ConnectionDAO().atualizarID(1, "Ribamar", "vasco@gmail.com");
    }
}
