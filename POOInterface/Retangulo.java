package POOInterface;

public class Retangulo implements FigurasGeometricas{
    int base;
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return base*altura;
    }
    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public String getNomeFigura() {
        // TODO Auto-generated method stub
        return "Retângulo";
    }
    @Override
    public double getPerimetro() {
        // TODO Auto-generated method stub
        return (base+altura)*2;
    }
    int altura;
    
    
}
