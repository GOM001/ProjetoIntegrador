package model;

import javax.swing.JOptionPane;

/**
 *
 * @author caiomoreno
 */
public class Produto {

    
    
    private int id_produto;
    private String nome = "", tipo, fornecedor;
    private int quantidade, codigo;
    private double precoCompra, precoVenda;

    public Produto() {
    }

    public Produto(int id_produto, String tipo, String fornecedor, int quantidade, int codigo, double precoCompra, double precoVenda)
    {
        this.id_produto = id_produto;
        this.tipo = tipo;
        this.fornecedor = fornecedor;
        this.quantidade = quantidade;
        this.codigo = codigo;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
    }

    
    public int getId_produto()
    {
        return id_produto;
    }

    public void setId_produto(int id_produto)
    {
        this.id_produto = id_produto;
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

    //Codar Validação de dados
    public  boolean validarDados(String nomeProduto, String tipo, String fornecedor, int quantidade, int codProduto, double precoCompra, double precoVenda) {
        boolean dadosValidados = true;

        this.nome = nomeProduto;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
        this.codigo = codProduto;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;

        try {
            if (this.nome.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Preencha o nome do produto");
                return !dadosValidados;
            }
            if (this.tipo.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Preecha o tipo do produto");
                return !dadosValidados;
            }
            if (this.fornecedor.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Preencha o fornecedor");
                return !dadosValidados;
            }
            if (this.quantidade <= 0) {
                JOptionPane.showMessageDialog(null, "Insira uma quantidade de produtos valida!");
                return !dadosValidados;
            }

            if (this.codigo <= 0) {
                JOptionPane.showMessageDialog(null, "Insira um codigo valido!");
                return !dadosValidados;
            }

            if (precoCompra <= 0) {
                JOptionPane.showMessageDialog(null, "Insira um valor de compra valido!");
                return !dadosValidados;
            }

            if (precoVenda <= 0) {
                JOptionPane.showMessageDialog(null, "Insira um preco de venda valido!");
                return !dadosValidados;
            }

            return dadosValidados;

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }

        return dadosValidados;
    }

}
