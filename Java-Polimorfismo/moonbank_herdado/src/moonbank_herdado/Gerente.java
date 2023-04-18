package moonbank_herdado;

//Gerente é um Funcinario, Gerente herda da class Funcionario, assina o contrato Autenticavel, é um autenticavel
	//implements= "assinar contrato", significa que essa classe precisa atender as obrigações do contrato
public class Gerente extends  Funcionario implements Autenticavel{ 

	private Autenticacao autenticador;

	public Gerente() {
		this.autenticador=new Autenticacao();
	}
	
	public double getBonificacao() { 
		System.out.println("Chamando o metodo de bonificacao do Gerente");
		return super.getSalario();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
			return this.autenticador.autentica(senha);
			
		}
	
}