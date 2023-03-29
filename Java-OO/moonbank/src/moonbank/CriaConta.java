package moonbank;

public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta=new Conta();
		primeiraConta.saldo=300;
	
		Conta segundaConta=new Conta();
		segundaConta.saldo=300;
		
		primeiraConta.agencia=146;
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		System.out.println(segundaConta.agencia);
		System.out.println(segundaConta.numero);
		
		segundaConta.agencia=146;
		System.out.println("agora a segunda conta esta na agencia "+segundaConta.agencia);
		
		System.out.println("a primeira conta tem "+primeiraConta.saldo);
		System.out.println("a segunda conta tem "+segundaConta.saldo);
		
		if(primeiraConta==segundaConta) {
			System.out.println("sao as mesmas contas");
		} else {
			System.out.println("sao diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
