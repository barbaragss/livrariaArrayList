package br.com.livraria;

import java.util.ArrayList;

public class Acervo {

	private static ArrayList<LivroLivraria> listaLivros = new ArrayList<>();

	public static ArrayList<LivroLivraria> getListaLivros() {
		return listaLivros;
	}

	static public void adicionar(LivroLivraria livro) {
		getListaLivros().add(livro);
	}

	static public String listar() {

		String saida = "";
		int i = 1;
		for (LivroLivraria listaLivro : listaLivros) {
			saida += "\n===== LIVRO N° " + (i++) + " =====\n";
			saida += listaLivro.Imprimir();
		}
		return saida;
	}

	static public int pesquisar(String genero) {

		int quantidade = 0;
		for (LivroLivraria listaLivro : listaLivros) {
			if (listaLivro.getGenero().equalsIgnoreCase(genero)) {
				quantidade++;
			}
		}
		return quantidade;
	}
	
	static public int pesquisar(double valorInicial, double valorFinal) {
		
		int quantidade = 0;
		for (LivroLivraria listaLivro : listaLivros) {
			if(listaLivro.getPreco() >= valorInicial && listaLivro.getPreco() <= valorFinal) {
				quantidade++;
			}
		}
		return quantidade;
	}
	
	static public boolean remover(String titulo) {
		
		for (LivroLivraria listaLivro : listaLivros) {
			if(listaLivro.getTitulo().equalsIgnoreCase(titulo)) {
				listaLivros.remove(listaLivro);
				return true;
			}
		}
		return false;
	}
	
	static double calcularTotalAcervo() {
		double total = 0;
		for (LivroLivraria listaLivro : listaLivros) {
			total += listaLivro.getPreco();
		}
		return total;
	}
}
