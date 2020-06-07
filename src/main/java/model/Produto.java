package model;

/**
 *
 * @author caiomoreno
 */
public class Produto {

    private int id_produto;
    private String nome, tipo, fornecedor;
    private int quantidade, codigo;
    private double precoCompra, precoVenda;

    public Produto() {
    }

    public Produto(int id_produto, String nome, String tipo, int codigo, double precoCompra, double precoVenda, int quantidade, String fornecedor) {
        this.id_produto = id_produto;
        this.nome = nome;
        this.tipo = tipo;
        this.fornecedor = fornecedor;
        this.quantidade = quantidade;
        this.codigo = codigo;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
    }

    public int getId_produto() {
        return id_produto;
    }

    public String getNome() {
        return nome;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public String getTipo() {
        return tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public void setNome(String nomeProduto) {
        this.nome = nomeProduto;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setCodigo(int codProduto) {
        this.codigo = codProduto;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
