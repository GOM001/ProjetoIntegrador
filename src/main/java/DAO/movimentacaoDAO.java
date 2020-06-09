package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Movimentacao;
import util.ConexaoDB;

/**
 *
 * @author caiomoreno
 */
public class MovimentacaoDAO {

    private static final String SQL_SELECT_PRODUTO = "SELECT nome FROM produto;";
    private static final String SQL_SELECT_CLIENTE = "SELECT nome, id_cliente FROM cliente WHERE cpf = ?";
    private static final String SQL_SELECT_QTD_ESTOQUE = "SELECT quantidade FROM produto p INNER JOIN estoque e ON p.id_produto = e.id_produto_fk WHERE nome = ?";
    private static final String SQL_SELECT_ADD_PRODUTO = "SELECT codigo, nome, preco_venda FROM produto p INNER JOIN estoque e ON p.id_produto = e.id_produto_fk WHERE nome = ?";
    private static final String SQL_SELECT_COD_PRODUTO = "SELECT id_produto FROM produto p INNER JOIN estoque e ON p.id_produto = e.id_produto_fk WHERE nome = ?";

    public static ArrayList<String> pesquisaProduto() {
        ArrayList<String> listaPlantas = new ArrayList<>();

        try (Connection conexao = ConexaoDB.getConnection();
                PreparedStatement SQL = conexao.prepareStatement(SQL_SELECT_PRODUTO);
                ResultSet resultado = SQL.executeQuery()) {

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

            try (ResultSet resultado = SQL.executeQuery()) {
                if (!resultado.next()) {
                    JOptionPane.showMessageDialog(null, "Cliente nao cadastrado");
                    return "";
                } else {
                    return resultado.getString("nome") + "," + resultado.getInt("id_cliente");
                }
            }

        } catch (Exception e) {
            System.out.println("Erro ao buscar CPF: " + e.getMessage());
        }
        return "";
    }

    public static int consultaEstoque(String nome) {
        int qtd = 0;

        try (Connection conexao = ConexaoDB.getConnection();
                PreparedStatement SQL = conexao.prepareStatement(SQL_SELECT_QTD_ESTOQUE)) {
            SQL.setString(1, nome);

            try (ResultSet resultado = SQL.executeQuery()) {
                if (resultado.next()) {
                    qtd = resultado.getInt("quantidade");
                }
            }

        } catch (Exception e) {
            System.out.println("Erro ao Consultar Estoque: " + e.getMessage());
        }

        return qtd;
    }

    public static Movimentacao adicionaProduto(String nome) {
        Movimentacao movimentacao = new Movimentacao();

        try (Connection conexao = ConexaoDB.getConnection();
                PreparedStatement SQL = conexao.prepareStatement(SQL_SELECT_ADD_PRODUTO)) {
            SQL.setString(1, nome);

            try (ResultSet resultado = SQL.executeQuery()) {
                if (resultado.next()) {
                    movimentacao.setCodProd(resultado.getInt("codigo"));
                    movimentacao.setNomeItem(resultado.getString("nome"));
                    movimentacao.setValor(resultado.getDouble("preco_venda"));
                }
            }
        } catch (Exception e) {
            System.out.println("erro na consulta:(adicionar produto) ---> " + e.getMessage());
        }

        return movimentacao;
    }

    public static int consultaCodigoProduto(String nome) {
        int qtd = 0;

        try (Connection conexao = ConexaoDB.getConnection();
                PreparedStatement SQL = conexao.prepareStatement(SQL_SELECT_COD_PRODUTO)) {
            SQL.setString(1, nome);

            try (ResultSet resultado = SQL.executeQuery()) {
                if (resultado.next()) {
                    qtd = resultado.getInt("id_produto");
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao Consultar Código do Produto" + e.getMessage());
        }

        return qtd;
    }
}
