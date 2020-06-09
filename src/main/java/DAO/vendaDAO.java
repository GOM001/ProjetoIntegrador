package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import model.Venda;
import util.ConexaoDB;

/**
 *
 * @author caiomoreno
 */
public class VendaDAO {

    private static final String SQL_INSERT_VENDA = "INSERT INTO venda() VALUES(default, ?, ?, ?, CURDATE(), ?, ?)";

    public static boolean inserirVenda(ArrayList<Venda> listaVenda) {
        boolean inseriu = false;

        for (Venda venda : listaVenda) {
            try (Connection conexao = ConexaoDB.getConnection();
                    PreparedStatement SQL = conexao.prepareStatement(SQL_INSERT_VENDA)) {

                SQL.setInt(1, venda.getQtd_vendido());
                SQL.setDouble(2, venda.getValor_desc());
                SQL.setDouble(3, venda.getValor_total());
                SQL.setInt(4, venda.getId_produto_fk());
                SQL.setInt(5, venda.getId_cliente_fk());

                int linhasAfetadas = SQL.executeUpdate();

                if (linhasAfetadas > 0) {
                    inseriu = true;
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        return inseriu;
    }
}
