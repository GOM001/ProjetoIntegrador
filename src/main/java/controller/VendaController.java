package controller;

import java.util.ArrayList;
import model.Venda;
import DAO.VendaDAO;

/**
 *
 * @author caiomoreno
 */
public class VendaController {

    public static boolean inserirVenda(ArrayList<Venda> listaVenda) {
        return VendaDAO.inserirVenda(listaVenda);
    }

}
