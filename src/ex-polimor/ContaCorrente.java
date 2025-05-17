public class ContaCorrente extends Conta {

    private static final double TAXA = 0.05;

    public ContaCorrente(int numero, Cliente dono) {
        super(numero, dono);
    }

    @Override
    public void sacar(double valor) {
        saldo -= (valor + TAXA);
    }

    @Override
    public void depositar(double valor) {
        saldo += (valor - TAXA);
    }

    @Override
    public void transferir(double valor, Conta destino) {
        this.sacar(valor);
        destino.depositar(valor);
    }
}