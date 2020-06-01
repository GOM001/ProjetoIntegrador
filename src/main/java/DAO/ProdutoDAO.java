package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Produto;
import util.GerenciadorConexao;

/**
 * @author Paulo Henrique
 * @version 1.4
 */
public class ProdutoDAO {

    private static final String SQL_INSERT_PRODUTO = "INSERT INTO produto (nome, tipo, codigo, preco_compra, preco_venda) VALUES (?, ?, ?, ?, ?)";
    private static final String SQL_INSERT_ESTOQUE = "INSERT INTO estoque (quantidade, fornecedor, id_produto_fk) VALUES (?, ?, LAST_INSERT_ID())";
    private static final String SQL_DELETE = "DELETE FROM produto WHERE id_produto = ?";

    public static boolean cadastrar(Produto produto) {
        boolean cadastrou = false;
        /*
         * O processo abaixo é chamado de try-with-resources (pós Java-7), 
         * deste modo não é necessário encerrar a Connection e o PreparedStatement por código, 
         * ela encerra os recursos automaticamente independente de sucesso ou falha na Connection.
         */
        try (Connection conexao = GerenciadorConexao.getConnection();
                PreparedStatement SQL_PRODUTO = conexao.prepareStatement(SQL_INSERT_PRODUTO);
                PreparedStatement SQL_ESTOQUE = conexao.prepareStatement(SQL_INSERT_ESTOQUE)) {

            SQL_PRODUTO.setString(1, produto.getNome());
            SQL_PRODUTO.setString(2, produto.getTipo());
            SQL_PRODUTO.setInt(3, produto.getCodigo());
            SQL_PRODUTO.setDouble(4, produto.getPrecoCompra());
            SQL_PRODUTO.setDouble(5, produto.getPrecoVenda());

            SQL_ESTOQUE.setInt(1, produto.getQuantidade());
            SQL_ESTOQUE.setString(2, produto.getFornecedor());

            cadastrou = SQL_PRODUTO.executeUpdate() > 0 && SQL_ESTOQUE.executeUpdate() > 0;

        } catch (SQLException ex) {
            String errorMessage = ex.getMessage();
            if (errorMessage.contains("Duplicate entry")) {
                JOptionPane.showMessageDialog(null, "Valor preenchido é duplicado ou existente.");
            }
            System.out.println("Erro de banco: " + errorMessage);
        }
        return cadastrou;
    }

    public static boolean excluir(int idProduto) {
        boolean exclusao = false;

        try (Connection conexao = GerenciadorConexao.getConnection();
                PreparedStatement SQL = conexao.prepareStatement(SQL_DELETE)) {

            SQL.setInt(1, idProduto);

            int linhasAfetadas = SQL.executeUpdate();
            exclusao = linhasAfetadas > 0;

        } catch (SQLException e) {
            System.out.println("Erro ao excluir dados no Banco: " + e.getMessage());
        }
        return exclusao;
    }
}
