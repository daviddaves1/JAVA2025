import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private List<Evento> eventos;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.eventos = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    public List<Evento> getEventos() { return eventos; }

    public void adicionarEvento(Evento e) {
        eventos.add(e);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuário: ").append(nome).append(" (").append(email).append(")\n");
        sb.append("Eventos Participados:\n");
        for (Evento e : eventos) {
            sb.append(e.toString()).append("\n");
        }
        return sb.toString();
    }
}
