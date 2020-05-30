package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Paulo Henrique
 */
public class GerenciadorConexao {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String SERVER = "localhost:3306";

    private static final String DATABASE = "floricultura";
    private static final String LOGIN = "root";
    private static final String SENHA = "1729545"; // preencha a senha do seu BD

    private static final String URL = "jdbc:mysql://" + SERVER + "/" + DATABASE + "?useTimezone=true&serverTimezone=UTC&useSSL=false";
    private static String STATUS;
    private static Connection CONEXAO;

    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            CONEXAO = DriverManager.getConnection(URL, LOGIN, SENHA);

            STATUS = CONEXAO != null ? "Conectado com sucesso!" : "Não foi possível conectar.";

        } catch (ClassNotFoundException ex) {
            System.err.println("Driver especificado não encontrado!" + ex.getMessage());
        } catch (SQLException ex) {
            System.err.println("Erro ao estabelecer conexão com o Banco de Dados: " + ex.getMessage());
        }
        return CONEXAO;
    }

    public static String getStatusConexao() {
        return STATUS;
    }

    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                System.err.println("Erro ao fechar conexão: " + ex);
            }
        }
    }

    public static void closeConnection(Connection connection, PreparedStatement prepStatm) {
        if (prepStatm != null) {
            try {
                prepStatm.close();
            } catch (SQLException ex) {
                System.err.println("Erro ao fechar conexão: " + ex);
            }
        }
        closeConnection(connection);
    }

    public static void closeConnection(Connection connection, PreparedStatement prepStatm, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
                System.err.println("Erro ao fechar conexão: " + ex);
            }
        }
        closeConnection(connection, prepStatm);
    }
}
