package moonbank_herdado_conta;

//new ContaCorrente()
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	@Override
	public boolean saque(double valor) {
		double valorSaque=valor+0.2;
		return super.saque(valorSaque);
	}
	@Override
	public void deposito(double valor) {
			super.saldo+=valor;
		
	}
	@Override
	public double getValorImposto() {
		return super.saldo*0.01;
	}
	
}

