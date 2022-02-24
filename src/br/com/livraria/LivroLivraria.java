package br.com.livraria;

public class LivroLivraria {

	private String autor;
	private String titulo;
	private int isbn;
	private String genero;
	private float preco;

	public LivroLivraria() {}

	public LivroLivraria(String titulo, String autor, int isbn, String genero, float preco) {

		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.genero = genero;
		this.preco = preco;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String Imprimir() {

		return "Título: " + this.getTitulo() + "\nAutor: " + this.getAutor() + "\nISBN: " + this.getIsbn()
				+ "\nGenero: " + this.getGenero() + String.format("\nPreço R$ %.2f", getPreco());
	}

}
