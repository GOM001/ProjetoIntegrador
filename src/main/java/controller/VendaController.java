/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import DAO.VendaDAO;
import javax.swing.JOptionPane;
import model.Movimentacao;

/**
 *
 * @author caiomoreno
 */
public class VendaController {

    public static ArrayList<String> pesquisaPlantas() {
        return VendaDAO.pesquisaPlanta();
    }

    public static String buscarClientePeloCPF(String cpf) {
        return VendaDAO.buscaCpf(cpf);
    }
}
