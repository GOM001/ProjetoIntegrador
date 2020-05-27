package controller;

import DAO.ClienteDAO;
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

}
