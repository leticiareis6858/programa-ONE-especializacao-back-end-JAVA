package moonbank_herdado;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Cliente cliente=new Cliente();
		//cliente.setSalario(3000.0);
		
		
		Gerente ana=new Gerente();
		ana.setNome("Ana Leticia Reis");
		ana.setCpf("222255647-9");
		ana.setSalario(2600.0);
		
		System.out.println(ana.getNome());
		System.out.println(ana.getBonificacao());
		
		
	}

}
