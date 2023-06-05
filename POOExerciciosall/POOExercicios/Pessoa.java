package POOExercicios;

public class Pessoa {
        private String nome;
        private double altura;
        private int diaNascimento;
        private int mesNascimento;
        private int anoNascimento;
        int idade;
        
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public double getAltura() {
            return altura;
        }
        public void setAltura(double altura) {
            this.altura = altura;
        }
        public int getDiaNascimento() {
            return diaNascimento;
        }
        public void setDiaNascimento(int diaNascimento) {
            this.diaNascimento = diaNascimento;
        }
        public int getMesNascimento() {
            return mesNascimento;
        }
        public void setMesNascimento(int mesNascimento) {
            this.mesNascimento = mesNascimento;
        }
        public int getAnoNascimento() {
            return anoNascimento;
        }
        public void setAnoNascimento(int anoNascimento) {
            this.anoNascimento = anoNascimento;
        }
        public Pessoa(String nome, double altura, int diaNascimento, int mesNascimento, int anoNascimento) {
            this.nome = nome;
            this.altura = altura;
            this.diaNascimento = diaNascimento;
            this.mesNascimento = mesNascimento;
            this.anoNascimento = anoNascimento;
        }

        public double getIdade() {
            if (mesNascimento<6) {
                idade = 2023-anoNascimento;
            }
            else if (mesNascimento>6){
                idade = 2022-anoNascimento;
            }
            else if (mesNascimento==6&&diaNascimento>5){
                idade = 2022-anoNascimento;
            }
            else if (mesNascimento==6&&diaNascimento<=5){
  idade = 2023-anoNascimento;
            }
            return idade ;
        }
        
    
}
