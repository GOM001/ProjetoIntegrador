package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Produto;
import util.GerenciadorConexao;

/**
 *
 * @author Paulo Henrique
 */
public class ProdutoDAO {

    public static boolean cadastrar(Produto produto) {
        boolean cadastrou = false;

        // Valores da Tabela ainda a confirmar
        String SQL_INSERT = "INSERT INTO Produto"
                + "(nomeProduto, "
                + "tipo, "
                + "quantidade, "
                + "fornecedor, "
                + "codProduto, "
                + "precoCompra, "
                + "precoVenda) "
                + "values (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conexao = GerenciadorConexao.getConnection();
                PreparedStatement instrucaoSQL = conexao.prepareStatement(SQL_INSERT);) {

            instrucaoSQL.setString(1, produto.getNome());
            instrucaoSQL.setString(2, produto.getTipo());
            instrucaoSQL.setInt(3, produto.getQuantidade());
            instrucaoSQL.setString(4, produto.getFornecedor());
            instrucaoSQL.setInt(5, produto.getCodigo());
            instrucaoSQL.setDouble(6, produto.getPrecoCompra());
            instrucaoSQL.setDouble(7, produto.getPrecoVenda());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            cadastrou = linhasAfetadas > 0;
            instrucaoSQL.close();
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver não encontrado!");
        } catch (SQLException ex) {
            System.out.println("Erro de banco: " + ex.getMessage());
        }
        return cadastrou;
    }
}
