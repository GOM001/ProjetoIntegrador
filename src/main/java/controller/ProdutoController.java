package controller;

/**
 *
 * @author Paulo Henrique
 */
import DAO.ProdutoDAO;
import model.Produto;

public class ProdutoController {

    public static boolean cadastrar(String nome, String tipo, int qtd, String fornecedor, int codigo, double precoCompra, double precoVenda) {
        Produto produto = new Produto();

        produto.setNome(nome);
        produto.setTipo(tipo);
        produto.setQuantidade(qtd);
        produto.setCodigo(codigo);
        produto.setFornecedor(fornecedor);
        produto.setPrecoCompra(precoCompra);
        produto.setPrecoVenda(precoVenda);

        return ProdutoDAO.cadastrar(produto);
    }

    public static boolean excluir(int idProduto) {

        return ProdutoDAO.excluir(idProduto);

    }
}
