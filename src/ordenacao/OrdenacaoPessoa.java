package ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ordenacao.Pessoa.ComparatorPorAutura;

public class OrdenacaoPessoa {

	
 private List<Pessoa> pessoaList;

public OrdenacaoPessoa() {
	
	this.pessoaList = new ArrayList<>();
}
 
 public void adicionarPessoa(String nome, int idade, double altura) {
	 
	 pessoaList.add(new Pessoa(nome,idade, altura));

	 
	 
	 
 }
 public List<Pessoa> ordenaPorIdade(){
	 List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList); 
	 Collections.sort(pessoasPorIdade);
	 return pessoasPorIdade;
	 
 }
 
 public List<Pessoa> ordenaPorAutura(){
	 
	 List<Pessoa> pessoasPorAltura= new ArrayList<>(pessoaList);
	 Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
	 
	 return pessoasPorAltura;
	 
	 
 }
}
