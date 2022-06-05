package br.fag.edu.herancabiblioteca;

public class PrincipalBiblioteca
{
	public static void main(String args[])
	{
		Ra ra = new Ra(2323232, "vitor", "133.122.222-22", "loteamento das torres", 20, "masculino",
				"Engenharia de Software");
		System.out.println("Registro de aluno: \n" + ra);

		Livro livro = new Livro("pequeno principe", "22/02/2022", "portugues", "crianças e adultos", "ficcao", 300,
				"algo aqui", "moderna", "pedro alvares cabral", 2222);

		Revista revista = new Revista("revista do ano", "22/02/2022", "portugues", "adultos", "milionarios do ano",
				"forbes brasil", 30);

		Jornal jornal = new Jornal("em busca de novidades", "10/10/2010", "espanhol", "adultos", 20, "jornal amazonas");

		DVD dvd = new DVD("meu malvado favorito", "22/02/2022", "portugues", "criancas", "1h", "disney", "desenho",
				22222);

		System.out.println("\nlivro: " + livro);
		System.out.println("\nrevista: " + revista);
		System.out.println("\njornal: " + jornal);
		System.out.println("\ndvd: " + dvd);

		System.out.println("\nEmprestimo livro");
		Emprestimo empLivro = new Emprestimo();
		empLivro.setDataemprestimo("16/02/2022");
		empLivro.setDatadevolucao("22/02/2022");
		empLivro.setObra(livro);
		empLivro.setRa(ra.getRa());
		System.out.println(empLivro);
		empLivro.emprestar();

		System.out.println("\nRenovar revista");
		Emprestimo empRevista = new Emprestimo();
		empRevista.setDataemprestimo("16/02/2022");
		empRevista.setDatadevolucao("22/02/2022");
		empRevista.setObra(revista);
		empRevista.setRa(ra.getRa());
		System.out.println(empRevista);
		empRevista.renovar();

		System.out.println("\nDevolver jornal");
		Emprestimo empJornal = new Emprestimo();
		empJornal.setDataemprestimo("16/02/2022");
		empJornal.setDatadevolucao("22/02/2022");
		empJornal.setObra(jornal);
		empJornal.setRa(ra.getRa());
		System.out.println(empJornal);
		empJornal.setDiasdeatraso(4);
		empJornal.devolver();

		System.out.println("\nDevolver DVD");
		Emprestimo empDvd = new Emprestimo();
		empDvd.setDataemprestimo("16/02/2022");
		empDvd.setDatadevolucao("22/02/2022");
		empDvd.setObra(dvd);
		empDvd.setRa(ra.getRa());
		System.out.println(empDvd);
		empDvd.setDiasdeatraso(2);
		empDvd.devolver();
	}
}
