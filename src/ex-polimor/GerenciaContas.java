import javax.swing.*;
import java.util.ArrayList;

public class GerenciaContas {
    public static void main(String[] args) {
        ArrayList<Conta> contas = new ArrayList<>();

        while (true) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta (0 para sair):"));
            if (numero == 0) break;

            String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
            String telefone = JOptionPane.showInputDialog("Digite o telefone do cliente:");
            Cliente cliente = new Cliente(nome, telefone);

            int tipoConta = Integer.parseInt(JOptionPane.showInputDialog("Escolha o tipo de conta:\n1 - Corrente\n2 - Salário\n3 - Poupança"));

            Conta conta;
            if (tipoConta == 1) {
                conta = new ContaCorrente(numero, cliente);
            } else if (tipoConta == 2) {
                conta = new ContaSalario(numero, cliente);
            } else {
                conta = new ContaPoupanca(numero, cliente);
            }

            contas.add(conta);
        }

        StringBuilder resultado = new StringBuilder("Contas cadastradas:\n");
        for (Conta c : contas) {
            resultado.append(c).append("\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}