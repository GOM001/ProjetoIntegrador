package model;

/**
 *
 * @author Paulo Henrique
 */
public class Cliente {

    String nome, cpf, rua, cidade, estadoEndereco, bairro, complemento, email, celular, estadoCivil;
    int cep, numeroEndereco;
    char sexo;

    public Cliente() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstadoEndereco(String estadoEndereco) {
        this.estadoEndereco = estadoEndereco;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public void setNumeroEndereco(int numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public String getRua() {
        return rua;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstadoEndereco() {
        return estadoEndereco;
    }

    public String getBairro() {
        return bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getEmail() {
        return email;
    }

    public String getCelular() {
        return celular;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public int getCep() {
        return cep;
    }

    public int getNumeroEndereco() {
        return numeroEndereco;
    }

}
