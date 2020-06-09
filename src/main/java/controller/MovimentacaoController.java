package controller;

import java.util.ArrayList;
import DAO.MovimentacaoDAO;
import model.Movimentacao;

/**
 *
 * @author caiomoreno
 */
public class MovimentacaoController {

    public static ArrayList<String> pesquisarProdutos() {
        return MovimentacaoDAO.pesquisaProduto();
    }

    public static String buscarClientePeloCPF(String cpf) {
        return MovimentacaoDAO.buscaCpf(cpf);
    }

    public static int consultaEstoque(String nome) {
        return MovimentacaoDAO.consultaEstoque(nome);
    }

    public static Movimentacao adicionaProduto(String nome) {
        return MovimentacaoDAO.adicionaProduto(nome);
    }

    public static int consultarCodigoProduto(String nome) {
        return MovimentacaoDAO.consultaCodigoProduto(nome);
    }
}
