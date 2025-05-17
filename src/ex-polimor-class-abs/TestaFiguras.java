import java.util.ArrayList;

public class TestaFiguras {
    public static void main(String[] args) {
        Quadrado q = new Quadrado(4);
        Triangulo t = new Triangulo(3, 4, 5, 2);
        Circulo c = new Circulo(3);
        Retangulo r = new Retangulo(4, 6);

        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(q);
        figuras.add(t);
        figuras.add(c);
        figuras.add(r);

        for (Figura f : figuras) {
            System.out.println(f.getClass().getSimpleName());
            System.out.println("Área: " + f.calcularArea());
            System.out.println("Perímetro: " + f.calcularPerimetro());

            if (f instanceof Desenho) {
                System.out.println(((Desenho) f).desenhar());
            }
            System.out.println("----------------------");
        }
    }
}
