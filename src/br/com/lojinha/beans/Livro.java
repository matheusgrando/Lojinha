package br.com.lojinha.beans;

public class Livro extends Produto {
	
	private String autor, editora;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	public void mostrarAtributosLivro() {
	    System.out.println("O nome do livro é " + getNome() + 
					    "\n O preço do livro é " + getPreco() + 
					    "\n A descrição do livro é " + getDescricao() + 
					    "\n O autor do livro é " + getAutor() + 
					    "\n A editora do livro é " + getEditora());
	}
	
}
