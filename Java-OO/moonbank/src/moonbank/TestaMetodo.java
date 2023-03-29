package moonbank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDaLeticia=new Conta();
		contaDaLeticia.saldo=100;
		contaDaLeticia.deposito(50);
		System.out.println(contaDaLeticia.saldo);
		
		boolean conseguiuRetirar=contaDaLeticia.saque(20);
		System.out.println(contaDaLeticia.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaAna=new Conta();
		contaDaAna.deposito(1000);
		
		boolean sucessoTransferencia=contaDaAna.transferencia(300, contaDaLeticia);
		if(sucessoTransferencia) {
			System.out.println("transferencia bem-sucedida");
		}else {
			System.out.println("faltou dinheiro.");
		}
		System.out.println(contaDaAna.saldo);
		System.out.println(contaDaLeticia.saldo);
		
		contaDaLeticia.titular="Leticia Reis";
		System.out.println(contaDaLeticia.titular);
		
		contaDaAna.titular="Ana Leticia Reis";
		System.out.println(contaDaAna.titular);
	}
}
