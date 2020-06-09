package model;

/**
 *
 * @author Paulo Henrique
 */
public class Movimentacao {

   
    private String nomeItem, nomeCliente, cpf;
    private int codVenda, quantidade, codProd;
    private double valor, desconto, subTotal;

    public void SetCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }
    
     public int getCodProd()
    {
        return codProd;
    }

    public void setCodProd(int codProd)
    {
        this.codProd = codProd;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setCodVenda(int codVenda) {
        this.codVenda = codVenda;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getCodVenda() {
        return codVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }

    public double getDesconto() {
        return desconto;
    }

    public double getSubTotal() {
        return subTotal;
    }
}
