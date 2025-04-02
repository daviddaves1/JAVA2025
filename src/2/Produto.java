public class Produto {
    private static int proximoCodigo = 1;
    private int codigo;
    private String nome;
    private int quantidade;
    private String tipo;
    private double valor;

    public Produto() {
        this.codigo = proximoCodigo++;
    }

    public Produto(String nome) {
        this();
        this.nome = nome;
    }

    public Produto(String nome, int quantidade) {
        this(nome);
        this.quantidade = quantidade;
    }

    public Produto(String nome, int quantidade, String tipo, double valor) {
        this(nome, quantidade);
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