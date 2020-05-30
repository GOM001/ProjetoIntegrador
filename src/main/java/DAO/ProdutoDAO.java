package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
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
                PreparedStatement SQL = conexao.prepareStatement(SQL_INSERT);) {

            SQL.setString(1, produto.getNome());
            SQL.setString(2, produto.getTipo());
            SQL.setInt(3, produto.getQuantidade());
            SQL.setString(4, produto.getFornecedor());
            SQL.setInt(5, produto.getCodigo());
            SQL.setDouble(6, produto.getPrecoCompra());
            SQL.setDouble(7, produto.getPrecoVenda());

            int linhasAfetadas = SQL.executeUpdate();

            cadastrou = linhasAfetadas > 0;
            GerenciadorConexao.closeConnection(conexao, SQL);

        } catch (SQLException ex) {
            String errorMessage = ex.getMessage();
            if (errorMessage.contains("Duplicate entry")) {
                JOptionPane.showMessageDialog(null, "Valor preenchido duplicado ou já existente.");
            }
            System.out.println("Erro de banco: " + errorMessage);
        }
        return cadastrou;
    }
}
