import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String descricao;
    private String dataInicio;
    private String dataFim;
    private List<Palestra> palestras;

    public Evento(String descricao) {
        this.descricao = descricao;
        this.palestras = new ArrayList<>();
    }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getDataInicio() { return dataInicio; }
    public void setDataInicio(String dataInicio) { this.dataInicio = dataInicio; }

    public String getDataFim() { return dataFim; }
    public void setDataFim(String dataFim) { this.dataFim = dataFim; }

    public List<Palestra> getPalestras() { return palestras; }

    public void adicionarPalestra(Palestra p) {
        palestras.add(p);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Evento: ").append(descricao)
          .append(" (").append(dataInicio).append(" a ").append(dataFim).append(")\n");
        sb.append("Palestras:\n");
        for (Palestra p : palestras) {
            sb.append("  - ").append(p.toString()).append("\n");
        }
        return sb.toString();
    }
}
