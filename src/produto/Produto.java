package produto;

public class Produto {

    private int id;
    private String nome;
    private Double preco;

    public Produto(int id, String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public String obterDetalhes(){
        return String.format("ID: %d | Nome: %s | Preço: %f", this.id, this.nome, this.preco);
    }
}
