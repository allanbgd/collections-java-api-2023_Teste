package Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

	
	private Set<Produto> produtoSet;

	public CadastroProdutos(Set<Produto> produtoSet) {
	
		this.produtoSet = new HashSet<>();
	}
	
	public void  adicionaProduto( String nome,long cod, double preco, int quantidade){
		produtoSet.add(new Produto(nome,cod, preco,quantidade ));
		
		
		
	}
	
	public Set<Produto> exibirProdutosPorNome(){
		
		// a forma certa de organizar um Set é um treeSet, é um modo de organizar no estilo do list mas sem o collections e o sort
		Set<Produto> produtosPorNome = new TreeSet<>(produtoSet); 
		
		return produtosPorNome;
		
		
	}
	public Set<Produto> exibirProdutoPorpreco(){
		
		//não quer adicionar o set de produtos, quer chamar a opção de comparar
		Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
		
		produtoSet.addAll(produtoSet);
		
		return produtosPorPreco;
	}
	
}
