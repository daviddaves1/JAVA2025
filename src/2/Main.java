import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto p1 = new Produto("Jogo Batalha Naval", 10, "Jogo", 100.00);
        Produto p2 = new Produto("Jogo Master", 20);
        Produto p3 = new Pro   duto("Jogo Quebra-Cabeça", 30, "Jogo", 50.00);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.print("Digite a quantidade para venda do produto 1: ");
        int qtdVenda = scanner.nextInt();
        p1.vender(qtdVenda);
        
        System.out.print("Digite a quantidade para compra do produto 2: ");
        int qtdCompra = scanner.nextInt();
        p2.comprar(qtdCompra);

        System.out.println("Produto 1 e Produto 2 são iguais? " + p1.igual(p2));
        
        scanner.close();
    }
}