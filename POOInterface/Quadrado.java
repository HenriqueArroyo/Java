package POOInterface;

public class Quadrado implements FigurasGeometricas {
  private int lado;

public int getLado() {
    return lado;
}

@Override
public double getArea() {
    // TODO Auto-generated method stub
    int area = lado*lado;
    return area;
}

public Quadrado(int lado) {
    this.lado = lado;
}

@Override
public String getNomeFigura() {
    // TODO Auto-generated method stub
    return "Quadrado";
}

@Override
public double getPerimetro() {
    // TODO Auto-generated method stub
    int perimetro = lado*4;
    return perimetro;
}

public void setLado(int lado) {
    this.lado = lado;
}

   
}
