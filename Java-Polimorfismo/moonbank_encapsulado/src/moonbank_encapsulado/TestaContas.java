package moonbank_encapsulado;

public class TestaContas {
	public static void main(String[] args) {
	
		Conta conta=new Conta(2221,3333);
		
		conta.deposito(200.0);
		System.out.println(conta.getSaldo());
		
		conta.setAgencia(577);
		System.out.println(conta.getAgencia());
		
		
		Conta conta2=new Conta(1002,20);
		Conta conta3=new Conta(222,3333);
		
		System.out.println("o total de contas e: " + Conta.getTotal());
	}
}
