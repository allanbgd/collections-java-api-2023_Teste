package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

import Map.OperacoesBasicas.AgendaContatos;

public class EstoqueProdutos {

	private Map<Long, Produto> estoqueProdutosMap;

	public EstoqueProdutos() {
		//esperando receber elementos
		this.estoqueProdutosMap = new HashMap<>();
	}
	
	public void adicionarProduto(Long cod, String nome, int quantidade, double preco) {
		estoqueProdutosMap.put(cod , new Produto(nome, preco, quantidade));
		
		
	}
	
	public void exibirProdutos() {
		
		System.out.println(estoqueProdutosMap);
		
	}
	
	public double calculaValorTotalEstoque() {
		double valorTotalEstoque = 0d;
		
		if (!estoqueProdutosMap.isEmpty()) {
			//relação dos valores de estoque de produtos 
			for(Produto p: estoqueProdutosMap.values()) {
				
				valorTotalEstoque += p.getQuantidade()*p.getPreco();
				
				
			}
			
		}
		return valorTotalEstoque;
	}
	//ele vai verificar no produto pra poder retornar
	public Produto obterProdutoMaisCaro() {
		
		Produto produtoMaisCaro= null;
		
		double maiorPreco =  Double.MIN_VALUE;
		// 
		for (Produto p : estoqueProdutosMap.values()) {
		if(p.getPreco()> maiorPreco) {
			
			produtoMaisCaro = p;
			
		}
		
		
		}
		return produtoMaisCaro;
		
	}
	
	
	 public static void main(String[] args) {
	        // Cria uma instância de AgendaContatos
	        EstoqueProdutos estoque = new EstoqueProdutos();

	        // Adiciona um contato
	        estoque.adicionarProduto(1L, "Produto A", 2, 5.0);

	        // Exibe contatos
	        estoque.exibirProdutos();
	    }
}
