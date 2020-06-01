package controller;

/**
 *
 * @author Paulo Henrique
 */
import DAO.ProdutoDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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
    
    public static ArrayList<Produto> pesquisar(String tipo, String dadosPesquisados)
    {
        ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
        
        if(tipo.equals("Código"))
        {
            tipo = "codigo";
        }else if(tipo.equals("Nome"))
        {
            tipo = "nome";
        }else
        {
            tipo = "fornecedor";
        }
        
        if(dadosPesquisados.trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Por favor, digite os dados para consulta corretamente!");
            listaProdutos = null;
            return listaProdutos;
        }
        System.out.println("indo chamar o DAO");
        return ProdutoDAO.pesquisar(tipo, dadosPesquisados);
        
    }
}
