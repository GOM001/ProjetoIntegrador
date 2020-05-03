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
    public boolean validarDados(String nomeProduto, String tipo, String fornecedor, int quantidade, int codProduto, double precoCompra, double precoVenda) {
        boolean dadosValidados = true;
        
        this.nome = nomeProduto;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
        this.codigo = codProduto;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        String quantidadeValidar = this.quantidade + "";
        String codigoValidar = this.codigo + "";
        String precoCompraValidar = this.precoCompra + "";
        String precoVendaValidar = this.precoVenda +"";

        try {
            if (this.nome.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Preencha o nome do produto");
                return !dadosValidados;
            }
            if(this.tipo.trim().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Preecha o tipo do produto");
                return !dadosValidados;
            }
            if(this.fornecedor.trim().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Preencha o fornecedor");
                return !dadosValidados;
            }
            if(this.quantidade <= 0)
            {
                JOptionPane.showMessageDialog(null, "Insira uma quantidade de produtos valida!");
                return !dadosValidados;
            }
            if(quantidadeValidar.trim().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Preenche o campo quantidade!");
                return !dadosValidados;
            }
            if(this.codigo <= 0)
            {
                JOptionPane.showMessageDialog(null, "Insira um codigo valido!");
                return !dadosValidados;
            }
            if(codigoValidar.trim().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Preencha o campo codigo!");
                return !dadosValidados;
            }
            if(precoCompra <= 0)
            {
                JOptionPane.showMessageDialog(null, "Insira um valor de compra valido!");
                return !dadosValidados;
            }
            if(precoCompraValidar.trim().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Preencha o campo preco de compra!");
                return !dadosValidados;
            }
            if(precoVenda <= 0)
            {
                JOptionPane.showMessageDialog(null, "Insira uma quantidade de produtos valida!");
                return !dadosValidados;
            }
            if(precoVendaValidar.trim().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Preencha o campo preco de venda!");
                return !dadosValidados;
            }
            
            return dadosValidados;
                    

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
        
        
        return dadosValidados;
    }

}
