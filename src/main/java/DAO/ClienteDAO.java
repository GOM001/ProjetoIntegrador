package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Cliente;
import util.GerenciadorConexao;

/**
 *
 * @author Paulo Henrique
 */
public class ClienteDAO {

    public static boolean cadastrar(Cliente cliente) {
        boolean cadastrou = false;

        String SQL_INSERT = "INSERT INTO clientes (nome, "
                + "cpf, "
                + "sexo, "
                + "estadoCivil, "
                + "cep, "
                + "rua, "
                + "numero, "
                + "cidade, "
                + "estado, "
                + "bairro, "
                + "complemento, "
                + "email, "
                + "celular) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conexao = GerenciadorConexao.getConnection();
                PreparedStatement SQL = conexao.prepareStatement(SQL_INSERT);) {

            SQL.setString(1, cliente.getNome());
            SQL.setString(2, cliente.getCpf());
            SQL.setString(3, String.valueOf(cliente.getSexo()));
            SQL.setString(4, cliente.getEstadoCivil());
            SQL.setInt(5, cliente.getCep());
            SQL.setString(6, cliente.getRua());
            SQL.setInt(7, cliente.getNumeroEndereco());
            SQL.setString(8, cliente.getCidade());
            SQL.setString(9, cliente.getEstadoEndereco());
            SQL.setString(10, cliente.getBairro());
            SQL.setString(11, cliente.getComplemento());
            SQL.setString(12, cliente.getEmail());
            SQL.setString(13, cliente.getCelular());

            int linhasAfetadas = SQL.executeUpdate();
            cadastrou = linhasAfetadas > 0;

            GerenciadorConexao.closeConnection(conexao, SQL);

        } catch (SQLException e) {
            System.out.println("Erro ao inserir no Banco de Dados: " + e.getMessage());
        }

        return cadastrou;
    }

    public static boolean excluir(int cliente) {
        boolean exclusao = false;

        String SQL_DELETE = "DELETE FROM clientes WHERE id_cliente = ?";

        try (Connection conexao = GerenciadorConexao.getConnection();
                PreparedStatement SQL = conexao.prepareStatement(SQL_DELETE);) {

            SQL.setInt(1, cliente);

            int linhasAfetadas = SQL.executeUpdate();

            exclusao = linhasAfetadas > 0;
            GerenciadorConexao.closeConnection(conexao, SQL);

        } catch (SQLException e) {
            System.out.println("Erro ao deletar no Banco de Dados: " + e.getMessage());
        }

        return exclusao;
    }

}
