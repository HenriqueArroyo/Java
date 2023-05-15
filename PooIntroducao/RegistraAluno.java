package PooIntroducao;

public class RegistraAluno {
    private String nome;
    private String endereco;
    private int idade;
    private double notaMatematica;
    private double notaPortugues;
    private double notaCiencias;

    private static int contadorEstudante = 3;
    public String getNome(){
        return nome;
    }
    public String getEndereco(){
        return endereco;
    }
    public int getIdade(){
        return idade;
    }
    public double getMedia(){
        double resultado = 0;
        resultado = (notaMatematica+notaCiencias+notaPortugues)/3;
        return resultado;
    }
    public static int getQuantidadeAlunos(){
        return contadorEstudante;
    }
    public void setNome(String temp){
        nome = temp;
        }
        // define ou altera o endereço do estudante
        public void setEndereco(String temp){
        endereco = temp;
        }
        // define ou altera o endereço do estudante
        public void setIdade(int temp){
        idade = temp;
        }
        // define ou altera o endereço do estudante
        public void setNotaMatematica(double temp){
        notaMatematica = temp;
        }
        // define ou altera o endereço do estudante
        public void setNotaPortugues(double temp){
        notaPortugues = temp;
        }
        // define ou altera o endereço do estudante
        public void setNotaCiencias(double temp){
        notaCiencias = temp;
        }
}



        

