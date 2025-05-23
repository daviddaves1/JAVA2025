public abstract class Figura {
    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    public String desenhar() {
        return "Desenhando figura genérica.";
    }

    public void exibirInfo() {
        System.out.println("Figura: " + this.getClass().getSimpleName());
        System.out.printf("Área: %.2f\n", calcularArea());
        System.out.printf("Perímetro: %.2f\n", calcularPerimetro());
        System.out.println(desenhar());
        System.out.println("--------------------------");
    }
}