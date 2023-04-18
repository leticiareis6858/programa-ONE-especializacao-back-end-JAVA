package moonbank_herdado;

//abstract faz não ser possivel existir apenas funcionario, o funcionario precisa ter um "tipo" (gerente, designer ou editor de video)
//não se óde maiis instanciar os objetos dessa classe pq é abstrata
public abstract class Funcionario {
	
	
	private String nome;
	private String cpf;
	//protected double salario; //protected=publico somente para os "filhos"
	private double salario;
	
	//metódo sem corpo, não há a implementação desse metodo aqui, porémm há implementação nos filhos/extends...
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
