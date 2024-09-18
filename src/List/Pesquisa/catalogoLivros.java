package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class catalogoLivros {

    private List<Livro> livroList;

    public catalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
          for (Livro l : livroList) {
            if (l.getAutor().equalsIgnoreCase(autor)) {
              livrosPorAutor.add(l);
            }
          }
       
        }
		return livrosPorAutor;
		}

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
    
    public static void main(String[] args) {
        // Criação do catálogo de livros
        catalogoLivros catalogo = new catalogoLivros();

        // Adicionando livros ao catálogo
        catalogo.adicionarLivro("Livro 1", "Autor 1", 1899);
        catalogo.adicionarLivro("Livro 2", "Autor 1", 1881);
        catalogo.adicionarLivro("Livro 3", "Autor 2", 1878);
        catalogo.adicionarLivro("Livro 4", "Autor 2", 1865);
        catalogo.adicionarLivro("Livro 5", "Autor 2", 1870);
        
        
        System.out.println(catalogoLivros.pesquisaPorAutor());
        // vai colocar o ano de inicio e o de final
        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos());
        // se chamar o livro pelo nome ele sempre vai chamar o primeiro independente do ano 
    }
    
}
