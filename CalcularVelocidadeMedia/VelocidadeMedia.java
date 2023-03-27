package CalcularVelocidadeMedia;

public class VelocidadeMedia {
    public static void main(String[] args) {
        //obter distancia percorrida pelo usuario
        int distanciaPercorrida = 150;
        /*obter tempo gasto pelo usuario*/
        int tempoGasto = 2;
        // calcular velocidade média
        float velocidadeMedia = distanciaPercorrida/tempoGasto;
        //Mostre a velocidade Média
        System.out.println("A velocidade Média foi de:");
        System.out.println(velocidadeMedia+"km/h");
}
}
