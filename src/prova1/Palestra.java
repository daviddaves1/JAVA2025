public class Palestra {
    private String nome;
    private String data;
    private String horaInicial;
    private String horaFinal;
    private String comentario;

    public Palestra(String nome, String data) {
        this.nome = nome;
        this.data = data;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public String getHoraInicial() { return horaInicial; }
    public void setHoraInicial(String horaInicial) { this.horaInicial = horaInicial; }

    public String getHoraFinal() { return horaFinal; }
    public void setHoraFinal(String horaFinal) { this.horaFinal = horaFinal; }

    public String getComentario() { return comentario; }
    public void setComentario(String comentario) { this.comentario = comentario; }

    @Override
    public String toString() {
        return "Palestra: " + nome + ", Data: " + data + ", Início: " + horaInicial +
               ", Fim: " + horaFinal + ", Comentário: " + comentario;
    }
}
