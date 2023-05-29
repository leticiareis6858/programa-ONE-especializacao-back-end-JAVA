package moonbank_herdado_conta;

public class TestaSaca {
//exception com tratamento:
	public static void main(String[] args) {
		Conta conta=new ContaCorrente(1234,4321);
		
		conta.deposito(200.0);
		try {
			conta.saque(220.0);
		} catch(SaldoInsuficienteException ex) {
			System.out.println("Valor inválido!" + ex.getMessage());
		}
		System.out.println(conta.getSaldo());

//exception sem tratamento: 
//	Conta conta2=new ContaCorrente(1234,4321);
//		
//	conta2.deposito(200.0);	
//	conta2.saque(220.0);
//		
//	System.out.println(conta2.getSaldo());
	}

}
