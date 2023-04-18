package moonbank_encapsulado;

public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta=new Conta(100,10);
		//conta.numero=1111;
		System.out.println(conta.getNumero());
		
		Cliente ana=new Cliente();
		// antes conta.titular=paulo;
		
		ana.setNome("Ana Leticia Reis");
		conta.setTitular(ana);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		//agora em duas linhas:
		//Cliente titularDaConta=conta.getTitular();
		//titularDaConta.setProfissao("programador");
		
		
		System.out.println(ana);
		System.out.println(conta.getTitular());
	}
}
