package PooIntroducao;

public class App {
    public static void main(String[] args) {
        RegistraAluno ana = new RegistraAluno();
        RegistraAluno beto = new RegistraAluno();
        RegistraAluno carlos = new RegistraAluno();
        RegistraProfessores diogo = new RegistraProfessores();

        //Informações Pessoas nome
        ana.setNome("Ana Machado");
        beto.setNome("Roberto da Silva");
        carlos.setNome("Carlos Alberto");
        diogo.setNome("Diogo Celtics");
        //endereço
        diogo.setEndereco("Rua Celtics");
        ana.setEndereco("Rua Senai");
        beto.setEndereco("Rua Manuel Gomes");
        carlos.setEndereco("Rua Perches");

        //idade
        diogo.setIdade(31);
        ana.setIdade(22);
        beto.setIdade(45);
        carlos.setIdade(27);
        //Informações Alunos
        ana.setNotaPortugues(7);
        beto.setNotaPortugues(9);
        carlos.setNotaPortugues(4);

        ana.setNotaMatematica(2);
        beto.setNotaMatematica(8);
        carlos.setNotaMatematica(10);

        ana.setNotaCiencias(6);
        beto.setNotaCiencias(5);
        carlos.setNotaCiencias(9);
        //Informações Professor aulas dadas
        diogo.setAulasDadas(500);
        //Matéria
        diogo.setMateria("Desenvolvimento de Sistemas");
        //Situação
        diogo.setSituacao("Ativo");


        //Exibição
        System.out.println(ana.getNome());
        System.out.println("Endereço: "+ana.getEndereco());
        System.out.println("Idade: "+ana.getIdade());
        System.out.println("Média: "+ana.getMedia());
        System.out.println("===============");
        System.out.println(beto.getNome());
        System.out.println("Endereço: "+beto.getEndereco());
        System.out.println("Idade: "+beto.getIdade());
        System.out.println("Média: "+beto.getMedia());
        System.out.println("===============");
        System.out.println(carlos.getNome());
        System.out.println("Endereço: "+carlos.getEndereco());
        System.out.println("Idade: "+carlos.getIdade());
        System.out.println("Média: "+carlos.getMedia());
        System.out.println("===============");
        System.out.println(diogo.getNome());
        System.out.println("Endereço: "+diogo.getEndereco());
        System.out.println("Idade: "+diogo.getIdade());
        System.out.println("Matéria: "+diogo.getMateria());
        System.out.println("Aulas Dadas: "+diogo.getAulasDadas());
        System.out.println("Situação: "+diogo.getSituacao());
        System.out.println("==============");
        System.out.println("Contador: "
        + RegistraAluno.getQuantidadeAlunos());
       

  
    }
}
