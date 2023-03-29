package moonbank_composto;

public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaAna=new Conta();
		System.out.println(contaDaAna.getSaldo());
		
		contaDaAna.titular=new Cliente();
		System.out.println(contaDaAna.titular);
		
		contaDaAna.titular.nome="Ana Leticia Reis";
		System.out.println(contaDaAna.titular.nome);
	}
}
