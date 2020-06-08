package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Produto;
import util.ConexaoDB;

/**
 * @author Paulo Henrique
 */
public class ProdutoDAO
{

    private static final String SQL_INSERT_PRODUTO = "INSERT INTO produto (nome, tipo, codigo, preco_compra, preco_venda) VALUES (?, ?, ?, ?, ?)";
    private static final String SQL_INSERT_ESTOQUE = "INSERT INTO estoque (quantidade, fornecedor, id_produto_fk) VALUES (?, ?, LAST_INSERT_ID())";
    private static final String SQL_DELETE = "DELETE FROM produto WHERE id_produto = ?"; // Está Em Cascata no DDL -> Exclui Estoque automaticamente
    private static final String SQL_UPDATE = "UPDATE produto p INNER JOIN estoque e ON p.id_produto = e.id_produto_fk SET p.nome = ?, p.tipo = ?, p.preco_compra = ?, p.preco_venda = ?, e.quantidade = ?, e.fornecedor = ?, p.codigo = ? WHERE p.id_produto = ? ";

    public static boolean cadastrar(Produto produto)
    {
        boolean cadastrou = false;
        /*
         * O processo abaixo é chamado de try-with-resources (pós Java-7), 
         * deste modo não é necessário encerrar a Connection e o PreparedStatement por código, 
         * ela encerra os recursos automaticamente independente de sucesso ou falha na Connection.
         */
        try (Connection conexao = ConexaoDB.getConnection();
                PreparedStatement SQL_PRODUTO = conexao.prepareStatement(SQL_INSERT_PRODUTO);
                PreparedStatement SQL_ESTOQUE = conexao.prepareStatement(SQL_INSERT_ESTOQUE))
        {

            SQL_PRODUTO.setString(1, produto.getNome());
            SQL_PRODUTO.setString(2, produto.getTipo());
            SQL_PRODUTO.setInt(3, produto.getCodigo());
            SQL_PRODUTO.setDouble(4, produto.getPrecoCompra());
            SQL_PRODUTO.setDouble(5, produto.getPrecoVenda());

            SQL_ESTOQUE.setInt(1, produto.getQuantidade());
            SQL_ESTOQUE.setString(2, produto.getFornecedor());

            cadastrou = SQL_PRODUTO.executeUpdate() > 0 && SQL_ESTOQUE.executeUpdate() > 0;

        } catch (SQLException ex)
        {
            String errorMessage = ex.getMessage();
            if (errorMessage.contains("Duplicate entry"))
            {
                JOptionPane.showMessageDialog(null, "Valor preenchido é duplicado ou existente.");
            }
            System.out.println("Erro de banco: " + errorMessage);
        }
        return cadastrou;
    }

    public static boolean excluir(int idProduto)
    {
        boolean exclusao = false;

        try (Connection conexao = ConexaoDB.getConnection();
                PreparedStatement SQL = conexao.prepareStatement(SQL_DELETE))
        {

            SQL.setInt(1, idProduto);

            exclusao = SQL.executeUpdate() > 0;

        } catch (SQLException e)
        {
            System.out.println("Erro ao excluir dados no Banco: " + e.getMessage());
        }

        return exclusao;
    }

    public static ArrayList<Produto> pesquisar(String tipo, String dadosPesquisados)
    {

        String query = String.format("SELECT id_produto, nome, tipo, preco_compra, codigo, preco_venda, quantidade, fornecedor FROM produto p INNER JOIN estoque e ON p.id_produto = e.id_produto_fk WHERE %s LIKE ?", tipo);

        ArrayList<Produto> listaProdutos = new ArrayList<>();

        try (Connection conexao = ConexaoDB.getConnection();
                PreparedStatement SQL = conexao.prepareStatement(query))
        {

            SQL.setString(1, dadosPesquisados + "%");

            ResultSet resultQuery = SQL.executeQuery();

            if (!resultQuery.next())
            {
                JOptionPane.showMessageDialog(null, "Não há registros com os dados informados");
                return listaProdutos;
            }

            do
            {
                Produto p = new Produto();

                p.setId_produto(resultQuery.getInt("id_produto"));
                p.setNome(resultQuery.getString("nome"));
                p.setTipo(resultQuery.getString("tipo"));
                p.setCodigo(resultQuery.getInt("codigo"));
                p.setPrecoCompra(resultQuery.getDouble("preco_compra"));
                p.setPrecoVenda(resultQuery.getDouble("preco_venda"));
                p.setQuantidade(resultQuery.getInt("quantidade"));
                p.setFornecedor(resultQuery.getString("fornecedor"));
                listaProdutos.add(p);

            } while (resultQuery.next());

        } catch (SQLException e)
        {
            System.out.println("Erro na pesquisa: " + e.getMessage());
        }

        return listaProdutos;
    }

    public static ArrayList<Produto> pesquisar_all()
    {

        String query = "SELECT id_produto, nome, tipo, preco_compra, codigo, preco_venda, quantidade, fornecedor FROM produto p INNER JOIN estoque e ON p.id_produto = e.id_produto_fk";

        ArrayList<Produto> listaProdutos = new ArrayList<>();

        try (Connection conexao = ConexaoDB.getConnection();
                PreparedStatement SQL = conexao.prepareStatement(query))
        {

            ResultSet resultado = SQL.executeQuery();

            if (!resultado.next())
            {
                // JOptionPane.showMessageDialog(null, "Não há registros com os dados informados");
                return listaProdutos;
            }

            do
            {
                Produto p = new Produto();

                p.setId_produto(resultado.getInt("id_produto"));
                p.setNome(resultado.getString("nome"));
                p.setTipo(resultado.getString("tipo"));
                p.setCodigo(resultado.getInt("codigo"));
                p.setPrecoCompra(resultado.getDouble("preco_compra"));
                p.setPrecoVenda(resultado.getDouble("preco_venda"));
                p.setQuantidade(resultado.getInt("quantidade"));
                p.setFornecedor(resultado.getString("fornecedor"));

                listaProdutos.add(p);
            } while (resultado.next());

        } catch (SQLException e)
        {
            System.out.println("Erro na pesquisa: " + e.getMessage());
        }

        return listaProdutos;
    }

    public static boolean atualizar(ArrayList<Produto> listaAtualizada)
    {
        boolean atualizou = false;

        ArrayList<Integer> linhasAtualizadas = new ArrayList<>();

        try (Connection conexao = ConexaoDB.getConnection();
                PreparedStatement SQL = conexao.prepareStatement(SQL_UPDATE))
        {

            for (Produto p : listaAtualizada)
            {
                SQL.setString(1, p.getNome());
                SQL.setString(2, p.getTipo());
                SQL.setDouble(3, p.getPrecoCompra());
                SQL.setDouble(4, p.getPrecoVenda());
                SQL.setInt(5, p.getQuantidade());
                SQL.setString(6, p.getFornecedor());
                SQL.setInt(7, p.getCodigo());
                SQL.setInt(8, p.getId_produto());

                int linhasAfetadas = SQL.executeUpdate();

                linhasAtualizadas.add(linhasAfetadas);
            }

            for (int i : linhasAtualizadas)
            {
                if (i > 0)
                {
                    atualizou = true;
                }
            }
        } catch (Exception e)
        {
            System.out.println("ERRO NO UPDATE --> " + e.getMessage());
        }

        return atualizou;
    }
}
