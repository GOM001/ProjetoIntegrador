/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.JOptionPane;

/**
 *
 * @author caiomoreno
 */

public class ControllerCadastroProduto {
    public  String nomeProduto = "";
    public  String tipo = "";
    public int quantidade = 0;
    public String fornecedor = "";
    public int codProduto = 0;
    public double precoCompra = 0;
    public double precoVenda = 0;
    
    
    public ControllerCadastroProduto()
    {
    }
    
    public ControllerCadastroProduto(String nomeProduto,String tipo,int quantidade, String fornecedor,int codProduto, double precoCompra, double PrecoVenda)
    {
        this.nomeProduto = nomeProduto;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
        this.codProduto = codProduto;
        this.precoCompra = precoCompra;
        this.precoVenda = PrecoVenda;
    }
    
    
    public String getnomeProduto()
    {
        return nomeProduto;
    }
    
    public void setnomeProduto(String nomeProduto)
    {
        this.nomeProduto = nomeProduto;
    }
    
    public String getTipo()
    {
        return tipo;
    }
    
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
    
    public int getQuantidade()
    {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade)
    {
        this.quantidade = quantidade;
    }
    
    
    public void verificacao(String a, String b, String c, String d, String e, String f, String g)
    {
        this.nomeProduto = a;
        this.tipo = b;
        this.quantidade = Integer.parseInt(c);
        this.fornecedor = d;
        this.codProduto = Integer.parseInt(e);
        this.precoCompra = Double.parseDouble(f);
        this.precoVenda = Double.parseDouble(g);
        
       try
       { 
        if(nomeProduto.trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Digite o nome do produto");
        } 
        
        }catch(Exception excessao)
        {
            JOptionPane.showMessageDialog(null, "Erro: "+  excessao);
        }
    }
    
    
    
    
    
    
    
    
}
