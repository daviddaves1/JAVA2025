public class Produto {
    private int codigo;
    private String nome;
    private int quantidade;
    private String tipo;
    private double valor;

    public Produto(int codigo) {
        this.codigo = codigo;
    }

    public Produto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Produto(int codigo, String nome, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public Produto(int codigo, String nome, int quantidade, String tipo, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

    public void inserir(String nome, int quantidade, String tipo, double valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

    public void vender(int qtdVendida) {
        if (qtdVendida > quantidade) {
            System.out.println("Estoque insuficiente!");
        } else {
            quantidade -= qtdVendida;
            System.out.println("Venda realizada! Valor total: R$ " + (qtdVendida * valor));
        }
    }

    public void comprar(int qtdComprada, double novoValor) {
        quantidade += qtdComprada;
        valor = novoValor;
        System.out.println("Compra realizada! Estoque atualizado.");
    }

    public void comprar(int qtdComprada) {
        quantidade += qtdComprada;
        System.out.println("Compra realizada! Estoque atualizado.");
    }

    @Override
    public String toString() {
        return "Código: " + codigo + "\nNome: " + nome + "\nQuantidade: " + quantidade +
               "\nTipo: " + tipo + "\nValor: R$ " + valor;
    }

    public boolean igual(Produto outro) {
        return this.nome.equals(outro.nome) && this.tipo.equals(outro.tipo);
    }
}