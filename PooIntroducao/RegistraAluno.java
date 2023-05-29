package PooIntroducao;

public class RegistraAluno extends Pessoas {
    private double notaMatematica;
    private double notaPortugues;
    private double notaCiencias;
    private static int contadorEstudante = 3;

    public double getMedia(){
        double resultado = 0;
        resultado = (notaMatematica+notaCiencias+notaPortugues)/3;
        return resultado;
    }
    public static int getQuantidadeAlunos(){
        return contadorEstudante;
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



        

