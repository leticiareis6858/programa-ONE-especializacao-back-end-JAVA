package moonbank_encapsulado;

public class TestaValores {
	public static void main(String[] args) {
		int total=0;
		Conta conta=new Conta(100,10);
		
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(1222);
		
		Conta conta2=new Conta(1002,20);
		Conta conta3=new Conta(222,3333);
		
		System.out.println(Conta.getTotal());
	}
}
