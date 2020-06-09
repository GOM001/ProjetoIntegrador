/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.vendaDAO;
import java.util.ArrayList;
import model.Venda;

/**
 *
 * @author caiomoreno
 */
public class vendaController
{
    
    public static boolean inserirVenda(ArrayList<Venda> listaVenda)
    {
        return vendaDAO.inserirVenda(listaVenda);
    }
    
    public static boolean retirarEstoque(ArrayList<Venda> listaVenda)
    {
        return vendaDAO.retirarEstoque(listaVenda);
    }
    
}
