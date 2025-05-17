public class TestaConta {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", "123456789");
        Cliente cliente2 = new Cliente("Maria", "987654321");

        Conta contaCorrente = new ContaCorrente(1, cliente1);
        Conta contaPoupanca = new ContaPoupanca(2, cliente2);

        contaCorrente.depositar(500);
        contaCorrente.sacar(100);
        contaPoupanca.depositar(300);
        contaPoupanca.atualizaSaldo(5);

        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);
    }
}