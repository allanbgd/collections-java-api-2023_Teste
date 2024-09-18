package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	//atributo
	
	private Set<Contato> contatoSet;

	public AgendaContatos() {
		
		this.contatoSet = new HashSet<>();
		
	}
	public void adicionarContato(String nome, int numero) {
		
		contatoSet.add(new Contato(nome, numero));
		
		
	}
	public void exibirContato() {
		
		System.out.println(contatoSet);
		
	}
	public Set<Contato> pesquisaPorNome(String nome) {
		//cria um set vazio pra poder agrupar os contatos
		Set<Contato> contatosPorNome = new HashSet<>();
		for(Contato c :contatoSet) {
			
			
			if(c.getNome().startsWith(nome)) {
			contatosPorNome.add(c);
			
			
		}
			
		}
		return contatosPorNome;
		
	}
	
	//como vai atualizar ele vai receber o contato que esta com o nome atual
	public Contato atualizaNumeroContato(String nome, int novoNumero) {
		
		Contato contatoAtualizado = null;
		
		for(Contato c : contatoSet) {
			if (c.getNome().equalsIgnoreCase(nome)) {
				
				c.setNumero(novoNumero);
				contatoAtualizado = c;
				break;
				
			}
			
			
			
		}
		return contatoAtualizado;
		
		
		
	}
}
