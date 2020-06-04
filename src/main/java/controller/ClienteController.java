package controller;

import DAO.ClienteDAO;
import javax.swing.JTable;
import model.Cliente;

/**
 *
 * @author Paulo Henrique
 */
public class ClienteController {

    public static boolean cadastrar(String nome, String cpf, char sexo, String rua, String cidade, String estadoEndereco, String bairro, String complemento, String email, String celular, String estadoCivil, int cep, int numeroEndereco) {

        Cliente cliente = new Cliente();

        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setSexo(sexo);
        cliente.setRua(rua);
        cliente.setCidade(cidade);
        cliente.setEstadoEndereco(estadoEndereco);
        cliente.setBairro(bairro);
        cliente.setComplemento(complemento);
        cliente.setEmail(email);
        cliente.setCelular(celular);
        cliente.setEstadoCivil(estadoCivil);
        cliente.setCep(cep);
        cliente.setNumeroEndereco(numeroEndereco);

        return ClienteDAO.cadastrar(cliente);
    }

    public static boolean alterar(int id, String campo, String novoValor) {
        return ClienteDAO.alterar(id, campo, novoValor);
    }

    public static boolean deletar(int idCliente) {
        return ClienteDAO.excluir(idCliente);
    }

    public static JTable consultarTabela(JTable tabela) {
        return ClienteDAO.consultar(tabela);
    }

}
