package br.com.alura;

public class Aluno {

	private String nome;
	private int matricula;

	public Aluno(String nome, int matricula) {
		if(nome==null) {
			throw new NullPointerException("nome n�o pode ser null");
		}
		this.nome = nome;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public int getMatricula() {
		return matricula;
	}

	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", matricula: " + this.matricula + "]";
	}
	@Override
	public boolean equals(Object obj) {
		Aluno outro=(Aluno) obj;
		return this.nome.equals(outro.nome);
	}
	
	//muda o hashcode
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
}
