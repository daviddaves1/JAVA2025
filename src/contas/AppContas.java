import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppContas {
    public static void main(String[] args) {
        ArrayList<Conta> contas = new ArrayList<>();

        while (true) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta (0 para sair):"));
            if (numero == 0) break;

            String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
            String telefone = JOptionPane.showInputDialog("Digite o telefone do cliente:");
            Cliente cliente = new Cliente(nome, telefone);

            int tipo = Integer.parseInt(JOptionPane.showInputDialog("Tipo da conta:\n1 - Corrente\n2 - Salário\n3 - Poupança"));
            Conta conta = null;

            switch (tipo) {
                case 1:
                    conta = new ContaCorrente(numero, cliente);
                    break;
                case 2:
                    conta = new ContaSalario(numero, cliente);
                    break;
                case 3:
                    conta = new ContaPoupanca(numero, cliente);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Tipo inválido!");
                    continue;
            }

            contas.add(conta);
        }

        StringBuilder sb = new StringBuilder("Contas cadastradas:\n\n");
        for (Conta conta : contas) {
            sb.append(conta.toString()).append("\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
