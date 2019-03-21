
public class Book {
	public Book(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}

	String titulo;
	String autor;
	int n_paginas;
	String ISBN;
	
	Book (String tit, String aut, int num){
		titulo = tit;
		autor = aut;
		n_paginas = num;
		
	}
	
	Book (String tit, String aut, int num, String i){
		titulo = tit;
		autor = aut;
		n_paginas = num;
		ISBN = i;
		
	}
	
	

}
