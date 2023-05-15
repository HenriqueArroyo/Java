package IteracaoFor;


import java.util.Scanner;

public class ExerciciosFor {
    Scanner sc = new Scanner(System.in);
    
    public void exercicio1() { //escrever 5 valores em um vetor e printar na ordem
        int vetor[]=new int[5];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor");
            vetor[i]=sc.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor["+i+"]="+vetor[i]);
        }
    }

    public void exercicio2() {//escrever 10 valores e escrever na ordem inversa
        double vetor[]=new double[10
        ];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("vetor["+(i)+"]=");
            vetor[i]=sc.nextDouble();
        }
        for(int i=9;i>=0;i--){//i=i-1
            System.out.println("vetor["+(i)+"]="+vetor[i]);
        }
    }

    public void exercicio3() {
        double notas[]=new double[4];//criei um vetor para as notas
        //vou preencher as notas do vetor
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a Nota "+(i+1)+" do Aluno:");
            notas[i]=sc.nextDouble();
        }
        double media=0;//variavel para calcular a média
        //calcular a média e imprimir as notas
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota "+(i+1)+"= "+notas[i]);
            media+=notas[i];//acumulando o valor das notas na variavel média
        }
        media/=notas.length;//dividir média pelo nº de notas do vetor
        System.out.println("A média do Aluno é "+media);
    }

    public void exercicio4() {
        String letras[] = new String[] { "a", "b", "c", "d",
         "e", "f", "g", "x", "u", "v" };
        int cont=0;
        for (int i = 0; i < letras.length; i++) {
            if(letras[i]=="a" || letras[i]=="e"|| letras[i]=="i"
                || letras[i]=="o" || letras[i]=="u"){
            } else{
                cont++;
                System.out.println(letras[i]+" é consoante");
            }
        }
        System.out.println(" o nº de Consoantes é "+cont);
    }
    public void exercicio4e() {
        System.out.println("Digite uma Palavra:");
        String palavra = sc.next();
        palavra.toLowerCase();
        int cont=0;
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            } else{
                cont++;
                System.out.println(c+" é consoante");
            }
        }
        System.out.println("O nº de Consoantes é "+cont);
    }

    public void exercicio5() {
        // exercicio par Impar
        int vetorNumeros[]=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int vetorNPar[]= new int[20];
        int vetorNImpar[]= new int[20];
        for (int i = 0; i < vetorNumeros.length; i++) {
            if(vetorNumeros[i]%2==0){
                vetorNPar[i]=vetorNumeros[i];
            } else{
                vetorNImpar[i]=vetorNumeros[i];
            }
        }
        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.println("vetor["+i+"]="+vetorNumeros[i]);
            System.out.println("vetorPar["+i+"]="+vetorNPar[i]);
            System.out.println("vetorImpar["+i+"]="+vetorNImpar[i]);
        }
    }

    // Exercicio 5 com contador
    public void exercicio5e() {
        int vetorNumeros[]=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int contImpar=0;
        int contPar=0;
        //contando quanto nº para e quantos nº impares
        for (int i = 0; i < vetorNumeros.length; i++) {
            if(vetorNumeros[i]%2==0){
                contPar++;
            } else{
                contImpar++;
            }
        }
        //criando os vetores com o tamanho correto
        int vetorPar[] = new int[contPar];
        int vetorImpar[] = new int[contImpar];
        //distribuindo os valores nos vetores
        contImpar=0;
        contPar=0;
        for (int i = 0; i < vetorNumeros.length; i++) {
            if(vetorNumeros[i]%2==0){
                vetorPar[contPar]=vetorNumeros[i];
                contPar++;
            }else{
                vetorImpar[contImpar]=vetorNumeros[i];
                contImpar++;
            }
        }
    }
public void exercicio6() {
      //laço dentro de laço
        // vetor média dos alunos e vetor notas
        double alunos[] = new double[10];//esse vai receber as medias
        double notas[] = new double[4];// esse vai receber as notas
        //laço para receber a média do aluno
        int cont=0;
        for(int i=0;i<alunos.length;i++){
            //laço para receber as notas
            for(int j=0;j<notas.length;j++){
                System.out.println("Digite a nota "+(j+1)+" do aluno "+(i+1)+":");
                notas[j]=sc.nextDouble();
                alunos[i]+=notas[j];//acumular as notas do aluno i
            }
            alunos[i]/=notas.length;//calcula a média dividindo pelo nº de notas
            //conta o nº de alunos com nota>7
            if(alunos[i]>=7){
                cont++;
            }

        }
        //imprimir as médias
        for (int i = 0; i < alunos.length; i++) {
            System.out.println(" a média do aluno "+(i+1)
                +" é "+alunos[i]);
        }
        //imprimir o contador
        System.out.println("o nº de alunos com nota >=7 é "+cont);
    
}
}