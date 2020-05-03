package model;

import javax.swing.JOptionPane;

/**
 *
 * @author caiomoreno
 */
public class Produto {

    public String nome = "", tipo, fornecedor;
    public int quantidade, codigo;
    public double precoCompra, precoVenda;

    public Produto() {
    }

    public Produto(String nome, String tipo, int quantidade, String fornecedor, int codigo, double precoCompra, double PrecoVenda) {
        this.nome = nome;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
        this.codigo = codigo;
        this.precoCompra = precoCompra;
        this.precoVenda = PrecoVenda;
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
    public void validarDados(String a, String b, String c, String d, String e, String f, String g) {
        this.nome = a;
        this.tipo = b;
        this.quantidade = Integer.parseInt(c);
        this.fornecedor = d;
        this.codigo = Integer.parseInt(e);
        this.precoCompra = Double.parseDouble(f);
        this.precoVenda = Double.parseDouble(g);

        try {
            if (nome.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Digite o nome do produto");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
    }

}
