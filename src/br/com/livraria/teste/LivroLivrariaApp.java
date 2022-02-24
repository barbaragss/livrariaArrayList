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
				
				
				
				break;
				
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
				
				default: System.out.println("Opção de menu inválida");
				break;
			}
			
		}while (opc != 7);
	}
}
