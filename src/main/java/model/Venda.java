/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author caiomoreno
 */
public class Venda
{
    private int id_venda,qtd_vendido,id_produto_fk,id_cliente_fk;
    private double valor_desc,valor_total;
    String dataVenda;

    public int getId_venda()
    {
        return id_venda;
    }

    public void setId_venda(int id_venda)
    {
        this.id_venda = id_venda;
    }

    public int getQtd_vendido()
    {
        return qtd_vendido;
    }

    public void setQtd_vendido(int qtd_vendido)
    {
        this.qtd_vendido = qtd_vendido;
    }

    public int getId_produto_fk()
    {
        return id_produto_fk;
    }

    public void setId_produto_fk(int id_produto_fk)
    {
        this.id_produto_fk = id_produto_fk;
    }

    public int getId_cliente_fk()
    {
        return id_cliente_fk;
    }

    public void setId_cliente_fk(int id_cliente_fk)
    {
        this.id_cliente_fk = id_cliente_fk;
    }

    public double getValor_desc()
    {
        return valor_desc;
    }

    public void setValor_desc(double valor_desc)
    {
        this.valor_desc = valor_desc;
    }

    public double getValor_total()
    {
        return valor_total;
    }

    public void setValor_total(double valor_total)
    {
        this.valor_total = valor_total;
    }

    public String getDataVenda()
    {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda)
    {
        this.dataVenda = dataVenda;
    }
    
    
    public Venda()
    {
        
    }
    
}
