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
public class movimentacaoDAO {

    private static final String SQL_SELECT_PRODUTO = "SELECT nome FROM produto;";
    private static final String SQL_SELECT_CLIENTE = "SELECT nome FROM cliente where cpf = ?";

    public static ArrayList<String> pesquisaPlanta() {
        ArrayList<String> listaPlantas = new ArrayList<String>();

        try (Connection conexao = ConexaoDB.getConnection();
                PreparedStatement SQL = conexao.prepareStatement(SQL_SELECT_PRODUTO)) {
            ResultSet resultado = SQL.executeQuery();

            if (!resultado.next()) {
                return listaPlantas;
            }

            do {
                
                listaPlantas.add(resultado.getString("nome"));
            } while (resultado.next());
        } catch (Exception e) {
            System.out.println("erro na pesquisa" + e.getMessage());
        }

        return listaPlantas;
    }

    public static String buscaCpf(String cpf) {

        try (Connection conexao = ConexaoDB.getConnection();
                PreparedStatement SQL = conexao.prepareStatement(SQL_SELECT_CLIENTE)) {
            SQL.setString(1, cpf);

            ResultSet resultado = SQL.executeQuery();

            if (!resultado.next()) {
                JOptionPane.showMessageDialog(null, "Cliente nao cadastrado");
                return "";
            } else {

                return resultado.getString("nome");
            }

        } catch (Exception e) {
            System.out.println("Erro ao buscar CPF: " + e.getMessage());
        }
        return "";
    }
    
    public static int ConsultaEstoque(String nome)
    {
        int qtd = 0; 
        String query = "SELECT quantidade FROM produto p INNER JOIN estoque e ON p.id_produto = e.id_produto_fk where nome= ?;";
        
        try(Connection conexao = ConexaoDB.getConnection();
                PreparedStatement SQL = conexao.prepareStatement(query))
        {
            SQL.setString(1, nome);
            
            ResultSet resultado = SQL.executeQuery();
            if(resultado.next()){
            qtd = resultado.getInt("quantidade");
            }
            
            
            
            
        } catch (Exception e)
        {
            System.out.println("ERRO PARA CONSULTAR ESTOQUE --->" + e.getMessage());
        }
        
        return qtd;
    }
    
    
}
