/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import DAO.movimentacaoDAO;
import javax.swing.JOptionPane;
import model.Movimentacao;

/**
 *
 * @author caiomoreno
 */
public class movimentacaoController {

    public static ArrayList<String> pesquisaPlantas() {
        return movimentacaoDAO.pesquisaPlanta();
    }

    public static String buscarClientePeloCPF(String cpf) {
        return movimentacaoDAO.buscaCpf(cpf);
    }
    
    public static int ConsultaEstoque()
    {
        return 1;
    }
}
