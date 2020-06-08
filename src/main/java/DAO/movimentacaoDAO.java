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
import javax.swing.JOptionPane;
import util.ConexaoDB;

/**
 *
 * @author caiomoreno
 */
public class movimentacaoDAO
{
    private static final String SELECT_PLANTAS = "SELECT nome FROM produto;";
    
    public static ArrayList<String> pesquisaPlanta()
    {
        ArrayList<String> listaPlantas = new ArrayList<String>();
        
        try (Connection conexao = ConexaoDB.getConnection();
                PreparedStatement SQL = conexao.prepareStatement(SELECT_PLANTAS)) 
        {
             ResultSet resultado = SQL.executeQuery();

            if (!resultado.next()) {
               // JOptionPane.showMessageDialog(null, "Não há registros com os dados informados");
                return listaPlantas;
            }
            
            do {
                System.out.println(resultado.getString("nome"));
                listaPlantas.add(resultado.getString("nome"));
            } while (resultado.next());
        }catch(Exception e)
        {
            System.out.println("erro na pesquisa" + e.getMessage());
        }
        
        return listaPlantas;
        
    }
}
