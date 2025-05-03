public class EventoPatrocinado extends Evento {
    private String nomePatrocinador;
    private double valor;

    public EventoPatrocinado(String descricao, String nomePatrocinador, double valor) {
        super(descricao);
        this.nomePatrocinador = nomePatrocinador;
        this.valor = valor;
    }

    public String getNomePatrocinador() { return nomePatrocinador; }
    public void setNomePatrocinador(String nomePatrocinador) { this.nomePatrocinador = nomePatrocinador; }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    @Override
    public String toString() {
        return super.toString() + 
               "Patrocinador: " + nomePatrocinador + ", Valor: R$" + valor + "\n";
    }
}
