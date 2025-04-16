import java.util.ArrayList;

class Pessoa {
    String nome;
    String nacionalidade;

    Pessoa(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public String toString() {
        return nome + " (" + nacionalidade + ")";
    }
}

class ProgramaTV {
    private static int contadorCodigo = 0;
    int codigo;
    String nome;
    ArrayList<Pessoa> artistas = new ArrayList<>();
    Pessoa diretor;
    String categoria;

    ProgramaTV(String nome, String categoria) {
        this.codigo = ++contadorCodigo;
        this.nome = nome;
        this.categoria = categoria;
    }

    void setDiretor(Pessoa diretor) {
        this.diretor = diretor;
    }

    void setArtistas(Pessoa artista) {
        artistas.add(artista);
    }

    public String toString() {
        String programa = codigo + " - " + nome + " (" + categoria + ")\n";
        programa += "Diretor : " + diretor + "\n";
        programa += "Artistas : \n";
        for (Pessoa artista : artistas) {
            programa += artista + "\n";
        }
        return programa;
    }
}

class Serie extends ProgramaTV {
    int quantidadeTemporadas;
    int quantidadeEpisodios;

    Serie(String nome, String categoria, int quantidadeTemporadas, int quantidadeEpisodios) {
        super(nome, categoria);
        this.quantidadeTemporadas = quantidadeTemporadas;
        this.quantidadeEpisodios = quantidadeEpisodios;
    }

    public String toString() {
        return super.toString() + "Temporadas: " + quantidadeTemporadas + ", Episódios: " + quantidadeEpisodios + "\n";
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<ProgramaTV> programas = new ArrayList<>();

        ProgramaTV p = new ProgramaTV("Carrosel", "Novela");
        p.setDiretor(new Pessoa("Diretor 1", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 1", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 2", "Brasileiro"));
        programas.add(p);

        p = new ProgramaTV("Avenida Brasil", "Novela");
        p.setDiretor(new Pessoa("Diretor 2", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 3", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 4", "Brasileiro"));
        programas.add(p);

        p = new Serie("Game of Thrones", "Série", 4, 34);
        p.setDiretor(new Pessoa("Diretor 5", "Americano"));
        p.setArtistas(new Pessoa("Artista 5", "Americano"));
        programas.add(p);

        for (ProgramaTV programa : programas) {
            System.out.println(programa);
        }
    }
}
