package moonbank_composto;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente leticia= new Cliente();
		leticia.nome="Leticia Reis";
		leticia.cpf="333.333.333-33";
		leticia.endereço.cep="22222-222";
		leticia.endereço.numero="111";
		leticia.endereço.pais="Brasil";
		
		Conta contaDaLeticia=new Conta();
		contaDaLeticia.deposito(100);
		
		//associa o cliente leticia a contaDaLeticia
		contaDaLeticia.titular=leticia;
		System.out.println(contaDaLeticia.titular.nome);
	}
}
