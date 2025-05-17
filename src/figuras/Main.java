package figuras;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criando figuras
        Quadrado quadrado = new Quadrado(4);
        Retangulo retangulo = new Retangulo(5, 3);
        Triangulo triangulo = new Triangulo(4, 3, 5, 2.5);
        Circulo circulo = new Circulo(2.0);

        // Adicionando à lista
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(quadrado);
        figuras.add(retangulo);
        figuras.add(triangulo);
        figuras.add(circulo);

        // Exibindo informações
        for (Figura f : figuras) {
            f.exibirInfo();
        }
    }
}
