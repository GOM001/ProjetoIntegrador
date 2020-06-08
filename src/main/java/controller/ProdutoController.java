package controller;

/**
 *
 * @author Paulo Henrique
 */
import DAO.ProdutoDAO;
import java.util.ArrayList;
import model.Produto;

public class ProdutoController
{

    public static boolean cadastrar(String nome, String tipo, int qtd, String fornecedor, int codigo, double precoCompra, double precoVenda)
    {

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

    public static boolean excluir(int idProduto)
    {

        return ProdutoDAO.excluir(idProduto);
    }

    public static ArrayList<Produto> pesquisar(String tipo, String dadosPesquisados)
    {
        switch (tipo)
        {
            case "Código":
                tipo = "codigo";
                break;
            case "Nome":
                tipo = "nome";
                break;
            default:
                tipo = "fornecedor";
                break;
        }

        return ProdutoDAO.pesquisar(tipo, dadosPesquisados);
    }

    public static ArrayList<Produto> pesquisar_all()
    {

        return ProdutoDAO.pesquisar_all();
    }

    public static boolean atualizar(ArrayList<Produto> listaAtualizada)
    {
        if (listaAtualizada != null)
        {
            return ProdutoDAO.atualizar(listaAtualizada);
        } else
        {
            return false;
        }
    }
}
