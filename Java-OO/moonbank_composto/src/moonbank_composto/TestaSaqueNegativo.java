package moonbank_composto;

public class TestaSaqueNegativo{
	public static void main(String[] args) {
		Conta conta=new Conta();
		conta.deposito(100);
		System.out.println(conta.saque(200));
		
		System.out.println(conta.getSaldo());
	}
}
