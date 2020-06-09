/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import model.Venda;
import util.ConexaoDB;

/**
 *
 * @author caiomoreno
 */
public class vendaDAO
{
    
    public static boolean inserirVenda(ArrayList<Venda> listaVenda)
    {
        boolean inseriu = false;

        String query = "insert into venda()  values(default,?,?,?,CURDATE(),?,?);";
        
        for(Venda venda : listaVenda){
        try (Connection conexao = ConexaoDB.getConnection();
                PreparedStatement SQL = conexao.prepareStatement(query)) {
            
            
    
            
            
            SQL.setInt(1, venda.getQtd_vendido());
            SQL.setDouble(2, venda.getValor_desc());
            SQL.setDouble(3, venda.getValor_total());
            SQL.setInt(4, venda.getId_produto_fk());
            SQL.setInt(5, venda.getId_cliente_fk());
            
            System.out.println("Query ---> "+ SQL);
            
            int linhasAfetadas = SQL.executeUpdate();
            
            if(linhasAfetadas > 0 )
            {
                inseriu = true;
            }
            
            
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        }
        
        return inseriu;
    }
    
    public static boolean retirarEstoque(ArrayList<Venda> listaVenda)
    {
        boolean atualizou = false;
        String query = "update estoque set quantidade = quantidade - ? where id_produto_fk = ?;";
        
     for(Venda venda : listaVenda)
     {
           try (Connection conexao = ConexaoDB.getConnection();
                PreparedStatement SQL = conexao.prepareStatement(query)) {
            
            int id_produto_fk = venda.getId_produto_fk();
            int qtd = venda.getQtd_vendido();
    
            
            
            SQL.setInt(1, qtd);
            SQL.setDouble(2, id_produto_fk);
            
            System.out.println("Query ESTOQUE ---> "+ SQL);
            
            int linhasAfetadas = SQL.executeUpdate();
            
            if(linhasAfetadas > 0 )
            {
                atualizou = true;
            }
            
            
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
           
          
         
     } 
      return atualizou;
     
     
    }
    
}
