package util;

public class ViaCEPException extends Exception {

    private String CEP;
    private String Classe;

    /**
     * Gera uma nova exceção
     *
     */
    public ViaCEPException(String message, String classe) {
        super(message);

        this.CEP = "";
        this.Classe = classe;
    }

    /**
     * Gera uma nova exceção e define o CEP que foi solicitado
     *
     */
    public ViaCEPException(String message, String cep, String classe) {
        super(message);

        this.CEP = cep;
        this.Classe = classe;
    }

    /**
     * Define o CEP da exceção
     *
     */
    public void setCEP(String cep) {
        this.CEP = cep;
    }

    /**
     * Retorna o CEP da exceção
     *
     */
    public String getCEP() {
        return this.CEP;
    }

    /**
     * Retorna se tem algum CEP
     *
     */
    public boolean hasCEP() {
        return !this.CEP.isEmpty();
    }

    /**
     * Retorna a classe da excessão original
     *
     */
    public String getClasse() {
        return Classe;
    }
}
