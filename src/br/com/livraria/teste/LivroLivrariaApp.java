package br.com.livraria.teste;

import java.util.Scanner;

import br.com.livraria.Acervo;
import br.com.livraria.LivroLivraria;
import br.com.livraria.Menu;

public class LivroLivrariaApp {
	public static void main(String[] args) {

		Menu menu = new Menu();
		Scanner entradaInt = new Scanner(System.in);
		Scanner entradaString = new Scanner(System.in);
		int opc = 0;
		double valorInicial;
		double valorFinal;
		LivroLivraria livro;
		String titulo;
		String autor;
		String genero;
		float preco;
		int isbn;

		do {
			menu.exibirMenu();
			opc = entradaInt.nextInt();

			switch (opc) {

			case 1:

				System.out.println("===> CADASTRAR LIVROS");
				System.out.println("Informe o título da obra: ");
				titulo = entradaString.nextLine();
				System.out.println("Informe o autor da obra: ");
				autor = entradaString.nextLine();
				System.out.println("Informe o genero da obra: ");
				genero = entradaString.nextLine();
				System.out.println("Informe o ISBN: ");
				isbn = entradaInt.nextInt();
				System.out.println("Informe o preço: ");
				preco = entradaInt.nextFloat();
				livro = new LivroLivraria(titulo, autor, isbn, genero, preco);
				Acervo.adicionar(livro);
				break;

			case 2:

				System.out.println("===> LISTAR LIVROS");
				System.out.println(Acervo.listar());
				break;

			case 3:

				System.out.println("===> EXCLUSÃO LIVROS");
				System.out.println("Informe o título do livro: ");
				titulo = entradaString.nextLine();

				if (!(Acervo.getListaLivros().isEmpty())) {
					if (Acervo.remover(titulo)) {
						System.out.println("Livro removido com sucesso!!!");
					} else {
						System.out.println("Título não encontrado");
					}
				} else {
					System.out.println("Não existe livros no acervo!");
				}
				break;

			case 4:
				
				System.out.println("===> PESQUISAR POR GENERO: ");
				System.out.println("Informe o genero do livro que deseja pesquisar: ");
				genero = entradaString.nextLine();
				System.out.println("Existem " + Acervo.pesquisar(genero) + " livros do genero " + genero);
				break;
				
			case 5:
				
				System.out.println("===> PESQUISAR POR FAIXA DE PREÇO: ");
				System.out.println("Informe a faixa inicial e a faixa final que deseja fazer a pesquisa ");
				valorInicial = entradaInt.nextDouble();
				valorFinal = entradaInt.nextDouble();
				System.out.println("Existem " + Acervo.pesquisar(valorInicial, valorFinal) + " livros com preco "
						+ "entre " + String.format(("R$: %.2f e R$: %.2f \n"), valorInicial, valorFinal));
				break;
				
			case 6:
				
				System.out.println("===> TOTAL EM R$ DE LIVROS NO ACERVO: ");
				System.out.println("O total é: " + String.format(" R$: %.2f \n", Acervo.calcularTotalAcervo()));
				break;
				
			case 7:
				
				System.out.println("Saindo...");
				break;

			default:
				System.out.println("Opção de menu inválida");
				break;
			}

		} while (opc != 7);
	}
}
