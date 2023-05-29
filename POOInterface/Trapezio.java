package POOInterface;

public class Trapezio implements FigurasGeometricas {
    int baseMaior;
    int baseMenor;
    int lado1;
    int lado2;
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    int altura;
    public int getBaseMaior() {
        return baseMaior;
    }
    public void setBaseMaior(int baseMaior) {
        this.baseMaior = baseMaior;
    }
    public int getBaseMenor() {
        return baseMenor;
    }
    public void setBaseMenor(int baseMenor) {
        this.baseMenor = baseMenor;
    }
    public int getLado1() {
        return lado1;
    }
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }
    public int getLado2() {
        return lado2;
    }
    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    @Override
    public double getArea() {
        // TODO Auto-generated method stub

        return ((baseMaior+baseMenor)*altura)/2;
    }
    @Override
    public String getNomeFigura() {
        // TODO Auto-generated method stub
        return "Trapézio";
    }
    @Override
    public double getPerimetro() {
        // TODO Auto-generated method stub
        return lado1+lado2+baseMaior+baseMenor;
    }
    public Trapezio(int baseMaior, int baseMenor, int lado1, int lado2, int altura) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
    }
    
}
