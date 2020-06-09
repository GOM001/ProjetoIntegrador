package util;

public interface ViaCEPEvents {

    /**
     * Quando o CEP for encontrado com sucesso
     *
     */
    public void onCEPSuccess(ViaCEP cep);

    /**
     * Quando ocorrer qualquer erro ao encontrar o CEP
     *
     */
    public void onCEPError(String cep);
}
