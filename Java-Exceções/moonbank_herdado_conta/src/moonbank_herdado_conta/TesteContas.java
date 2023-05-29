package moonbank_herdado_conta;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException{

		ContaCorrente cc=new ContaCorrente(111, 111);
		cc.deposito(100.0);

		ContaPoupanca cp=new ContaPoupanca(222, 222);
		cp.deposito(200.0);
		
		cc.transferencia(10, cp);
		
		System.out.println("CC: "+cc.getSaldo());
		System.out.println("CP: "+cp.getSaldo());
	}

}
