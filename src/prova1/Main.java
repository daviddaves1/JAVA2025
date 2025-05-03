import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Usuario[] usuarios = new Usuario[2];

        for (int i=0; i<2; i++) {
            System.out.println("Cadastro do usuário " + (i+1));
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Senha: ");
            String senha = sc.nextLine();

            Usuario usuario = new Usuario(nome, email, senha);


            System.out.println("\nEvento 1 (comum)");
            System.out.print("Descrição: ");
            String descricao = sc.nextLine();

            Evento evento1 = new Evento(descricao);
            System.out.print("Data de início: ");
            evento1.setDataInicio(sc.nextLine());

            System.out.print("Data de fim: ");
            evento1.setDataFim(sc.nextLine());

            for (int j=0; j<3; j++) {
                System.out.println("\nPalestra " + (j+ 1) + " para o Evento 1:");
                System.out.print("Nome: ");
                String nomePalestra = sc.nextLine();

                System.out.print("Data: ");
                String data = sc.nextLine();

                Palestra palestra = new Palestra(nomePalestra, data);

                System.out.print("Hora Inicial: ");
                palestra.setHoraInicial(sc.nextLine());

                System.out.print("Hora Final: ");
                palestra.setHoraFinal(sc.nextLine());

                System.out.print("Comentário: ");
                palestra.setComentario(sc.nextLine());

                evento1.adicionarPalestra(palestra);
            }

            usuario.adicionarEvento(evento1);


            System.out.println("\nEvento 2 (patrocinado)");
            System.out.print("Descrição: ");
            String descPatrocinado = sc.nextLine();

            System.out.print("Nome do patrocinador: ");
            String nomePatrocinador = sc.nextLine();

            System.out.print("Valor: ");
            double valor = Double.parseDouble(sc.nextLine());

            EventoPatrocinado evento2 = new EventoPatrocinado(descPatrocinado, nomePatrocinador, valor);

            System.out.print("Data de início: ");
            evento2.setDataInicio(sc.nextLine());

            System.out.print("Data de fim: ");
            evento2.setDataFim(sc.nextLine());

            for (int j = 0; j < 3; j++) {
                System.out.println("\nPalestra " + (j+1) + " para o Evento Patrocinado:");
                System.out.print("Nome: ");
                String nomePalestra = sc.nextLine();

                System.out.print("Data: ");
                String data = sc.nextLine();

                Palestra palestra = new Palestra(nomePalestra, data);

                System.out.print("Hora Inicial: ");
                palestra.setHoraInicial(sc.nextLine());

                System.out.print("Hora Final: ");
                palestra.setHoraFinal(sc.nextLine());

                System.out.print("Comentário: ");
                palestra.setComentario(sc.nextLine());

                evento2.adicionarPalestra(palestra);
            }

            usuario.adicionarEvento(evento2);

            usuarios[i] = usuario;
        }

        //Exibindo os usuarios e seus respectivos eventos no relatório final usando o toString()
        System.out.println("\n=========== RELATÓRIO FINAL ===========");
        for (Usuario u : usuarios) {
            System.out.println(u.toString());
        }

        sc.close();
    }
}
