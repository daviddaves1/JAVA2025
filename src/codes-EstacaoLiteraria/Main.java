public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Interface ui = new Interface(sistema);

        ui.iniciarAplicacao();
    }
}