/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        String query = "insert into venda()  values(default,?,?,?,?,?,?);";
        
        for(Venda venda : listaVenda){
        try (Connection conexao = ConexaoDB.getConnection();
                PreparedStatement SQL = conexao.prepareStatement(query)) {
            
            SQL.setInt(1, venda.getQtd_vendido());
            SQL.setDouble(2, venda.getValor_desc());
            SQL.setDouble(3, venda.getValor_total());
            SQL.setDate(4, null);
            SQL.setInt(5, venda.getId_produto_fk());
            SQL.setInt(6, venda.getId_cliente_fk());
            
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
    
}
