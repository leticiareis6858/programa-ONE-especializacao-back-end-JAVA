package moonbank_herdado;

public class TesteGerente {

	public static void main(String[] args) {
		
		Autenticavel referencia=new Administrador();
		
		Gerente g1=new Gerente();
		g1.setNome("Amir");
		g1.setCpf("235568413");
		g1.setSalario(5000.0);

		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		boolean autenticou= g1.autentica(1111);
		
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
		
	}

}
