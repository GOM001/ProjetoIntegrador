package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Cliente;
import util.GerenciadorConexao;

/**
 * @author Paulo Henrique
 * @version 1.4
 */
public class ClienteDAO {

    private static final String SQL_INSERT_CLIENTE = "INSERT INTO cliente (nome, cpf, sexo, est_civil, email, celular) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String SQL_INSERT_ENDERECO = "INSERT INTO endereco (cep, rua, numero, cidade, estado, bairro, complemento) VALUES (?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_DELETE = "DELETE FROM clientes WHERE id_cliente = ?";

    public static boolean cadastrar(Cliente cliente) {
        boolean cadastrou = false;

        /*
         * O processo abaixo é chamado de try-with-resources (pós Java-7), 
         * deste modo não é necessário encerrar a Connection e o PreparedStatement por código, 
         * ela encerra os recursos automaticamente independente de sucesso ou falha na Connection.
         */
        try (Connection conexao = GerenciadorConexao.getConnection();
                PreparedStatement SQL_CLIENTE = conexao.prepareStatement(SQL_INSERT_CLIENTE);
                PreparedStatement SQL_ENDERECO = conexao.prepareStatement(SQL_INSERT_ENDERECO);) {

            SQL_CLIENTE.setString(1, cliente.getNome());
            SQL_CLIENTE.setString(2, cliente.getCpf());
            SQL_CLIENTE.setString(3, String.valueOf(cliente.getSexo()));
            SQL_CLIENTE.setString(4, cliente.getEstadoCivil());
            SQL_CLIENTE.setString(5, cliente.getEmail());
            SQL_CLIENTE.setString(6, cliente.getCelular());

            SQL_ENDERECO.setInt(1, cliente.getCep());
            SQL_ENDERECO.setString(2, cliente.getRua());
            SQL_ENDERECO.setInt(3, cliente.getNumeroEndereco());
            SQL_ENDERECO.setString(4, cliente.getCidade());
            SQL_ENDERECO.setString(5, cliente.getEstadoEndereco());
            SQL_ENDERECO.setString(6, cliente.getBairro());
            SQL_ENDERECO.setString(7, cliente.getComplemento());

            cadastrou = SQL_CLIENTE.executeUpdate() > 0 && SQL_ENDERECO.executeUpdate() > 0;

        } catch (SQLException ex) {
            String errorMessage = ex.getMessage();
            if (errorMessage.contains("Duplicate entry")) {
                JOptionPane.showMessageDialog(null, "Valor preenchido duplicado ou já existente.");
            }
            System.out.println("Erro de banco: " + errorMessage);
        }

        return cadastrou;
    }

    public static boolean excluir(int idCliente) {
        boolean exclusao = false;

        try (Connection conexao = GerenciadorConexao.getConnection();
                PreparedStatement SQL = conexao.prepareStatement(SQL_DELETE)) {

            SQL.setInt(1, idCliente);

            int linhasAfetadas = SQL.executeUpdate();
            exclusao = linhasAfetadas > 0;

        } catch (SQLException e) {
            System.out.println("Erro ao deletar no Banco de Dados: " + e.getMessage());
        }
        return exclusao;
    }
}
