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
        String SQL_INSERT = "INSERT INTO produto"
                + "(nome, "
                + "tipo, "
                + "codigo, "
                + "preco_compra, "
                + "preco_venda) "
                + "values (?, ?, ?, ?, ?)";

        try (Connection conexao = GerenciadorConexao.getConnection();
                PreparedStatement SQL = conexao.prepareStatement(SQL_INSERT);) {

            SQL.setString(1, produto.getNome());
            SQL.setString(2, produto.getTipo());
            SQL.setInt(3, produto.getCodigo());
            SQL.setDouble(4, produto.getPrecoCompra());
            SQL.setDouble(5, produto.getPrecoVenda());

            int linhasAfetadas = SQL.executeUpdate();

            cadastrou = linhasAfetadas > 0;
            GerenciadorConexao.closeConnection(conexao, SQL);

        } catch (SQLException ex) {
            System.out.println("Erro de banco: " + ex.getMessage());
        }
        return cadastrou;
    }
}
