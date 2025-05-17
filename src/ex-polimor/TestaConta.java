public class TestaConta {
    public static void main(String[] args) {
        Conta c1 = new ContaCorrente(1, new Cliente("João", "9999-9999"));
        Conta c2 = new ContaPoupanca(2, new Cliente("Maria", "8888-8888"));

        c1.depositar(100);
        c1.sacar(20);
        System.out.println(c1);

        c2.depositar(200);
        c2.sacar(50);
        System.out.println(c2);

        // Atualiza saldo da poupança
        if (c2 instanceof ContaPoupanca) {
            ((ContaPoupanca) c2).atualizaSaldo(5);
        }
        System.out.println("Após atualização de saldo:");
        System.out.println(c2);

        // Transferência
        c1.transferir(30, c2);
        System.out.println("Após transferência:");
        System.out.println(c1);
        System.out.println(c2);

        // Conta Salário
        ContaSalario cs = new ContaSalario(3, new Cliente("Carlos", "7777-7777"));
        cs.depositar(100);
        cs.sacar(10);
        cs.transferir(20, c2);

        System.out.println("Conta Salário:");
        System.out.println(cs);
        System.out.println("Conta Poupança (recebeu):");
        System.out.println(c2);
    }
}
