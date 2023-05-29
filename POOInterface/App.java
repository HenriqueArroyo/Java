package POOInterface;

public class App {
    public static void main(String[] args) {
    Quadrado exemplo1 = new Quadrado(7);
    Retangulo exemplo2 = new Retangulo(10, 5);
    Trapezio exemplo3 = new Trapezio(8,5,4,4,4);
    Trapezio figTrapezio[] = new Trapezio[5];
    figTrapezio[0] = new Trapezio(10, 5, 7, 8, 6);

    for (int i = 0; i < figTrapezio.length; i++) {
        figTrapezio[i]=new Trapezio(i+5, i, i+1, i+2, i+3);
    }

    System.out.println(" Nome da Figura é "+exemplo1.getNomeFigura());
    System.out.println("\n Área = "+exemplo1.getArea());
    System.out.println("\n Perímetro = "+exemplo1.getPerimetro());
    System.out.println("==============");
    System.out.println(" Nome da Figura é "+exemplo2.getNomeFigura());
    System.out.println("\n Área = "+exemplo2.getArea());
    System.out.println("\n Perímetro = "+exemplo2.getPerimetro());
    System.out.println("================");
    System.out.println(" Nome da Figura é "+exemplo3.getNomeFigura());
    System.out.println("\n Área = "+exemplo3.getArea());
    System.out.println("\n Perímetro = "+exemplo3.getPerimetro());

    }
    
}
