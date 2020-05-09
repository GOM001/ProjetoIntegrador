package util;

import java.sql.Connection;
import java.sql.DriverManager;
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
    private static final String SENHA = "";    // preencha sua senha

    private static final String URL = "jdbc:mysql://" + SERVER + "/" + DATABASE + "?useTimezone=true&serverTimezone=UTC&useSSL=false";
    private static String STATUS;
    private static Connection CONEXAO;

    public GerenciadorConexao() {
    }

    public static Connection getConnection() throws ClassNotFoundException, SQLException {

        if (CONEXAO == null) {
            try {

                //Carrega a classe responsável pelo driver
                Class.forName(DRIVER);
                CONEXAO = DriverManager.getConnection(URL, LOGIN, SENHA);

                if (CONEXAO != null) {
                    STATUS = "Conexão realizada com sucesso!";
                } else {
                    STATUS = "Não foi possivel realizar a conexão";
                }

            } catch (ClassNotFoundException e) {

                throw new ClassNotFoundException("O driver expecificado não foi encontrado.");

            } catch (SQLException e) {  //Erro ao estabelecer a conexão (Ex: login ou senha errados)
                System.out.println("LOG do ERRO: " + e.getMessage());
                throw new SQLException("Erro ao estabelecer a conexão. (Ex: login ou senha errados)");
            }

        } else {
            try {
                if (CONEXAO.isClosed()) { //Reabre a conexão se estiver fechada
                    CONEXAO = DriverManager.getConnection(URL, LOGIN, SENHA);
                }
            } catch (SQLException ex) {
                throw new SQLException("Falha ao fechar a conexão.");
            }
        }
        return CONEXAO;
    }

    public static String statusConexao() {
        return STATUS;
    }

    public static boolean closeConnection() throws SQLException {

        boolean statusOnline = false;

        try {
            if (CONEXAO != null && !CONEXAO.isClosed()) {
                CONEXAO.close();
            }

            STATUS = "Não conectado.";
            statusOnline = true;

        } catch (SQLException e) {
            statusOnline = false;
        }

        return statusOnline;
    }
}
