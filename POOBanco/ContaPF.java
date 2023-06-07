package POOBanco;

/**
 * ContaPF
 */
public class ContaPF extends Contas {
   private String cpf;
   private String nomeTitular;
   private int numConta;
   public String getCpf() {
    return cpf;
}
public void setCpf(String cpf) {
    this.cpf = cpf;
}
public String getNomeTitular() {
    return nomeTitular;
}
public void setNomeTitular(String nomeTitular) {
    this.nomeTitular = nomeTitular;
}
public int getNumConta() {
    return numConta;
}
public void setNumConta(int numConta) {
    this.numConta = numConta;
}
public double getSaldo() {
    return saldo;
}
public void setSaldo(double saldo) {
    this.saldo = saldo;
}
private double saldo;
public ContaPF(String cpf, String nomeTitular, int numConta, double saldo) {
    this.cpf = cpf;
    this.nomeTitular = nomeTitular;
    this.numConta = numConta;
    this.saldo = saldo;
}



    
}