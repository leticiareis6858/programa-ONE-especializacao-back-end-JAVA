package moonbank_encapsulado;

public class Conta {
	private double saldo; //atributo de instancia
	private int agencia; //atributo de instancia
	private int numero; //atributo de instancia
	private Cliente titular;
	
	//uma classe pode ter vários objetos
	//static é o mesmo que "de classe" e não "de objetos"
	//permite que o total mude de valor a cada conta criada
	//é um atributo da classe conta e não um objeto de uma conta qualquer/especifica
	
	private static int total; //atributo da classe
	
	// nos obriga a atribuir a agencia e o numero
	public Conta(int agencia, int numero) {
		//total da classe conta e não daquela classe conta...
		Conta.total++;
		System.out.println("o total de contas e " +Conta.total);
		if(agencia<=0 || numero<=0) {
			System.out.println("valores invalidos");
			return;
		}
		this.agencia=agencia;
		this.numero=numero;
		System.out.println("estou criando uma conta " + this.numero);
	}
	
	public void deposito(double valor) {
		this.saldo+=valor;
	}
	public boolean saque(double valor) {
		if(this.saldo>=valor) {
			this.saldo-=valor;
			return true;
		}else {
			return false;
		}	
	}
	public boolean transferencia(double valor, Conta destino) {
		if(this.saldo>=valor) {
			this.saldo-=valor;
			destino.deposito(valor);
			return true;
		}
			return false;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public int getNumero() {
		return this.numero;
	}
	// esse int numero é o numero novo
	public void setNumero(int numero) {
		// || significa or
		if (numero>=9999 || numero<=0) {
			System.out.println("Numero invalido. Por favor informe um numero entre 0 e 9999.");
			return;
		}
		//o numero do this é o anterior da conta, o depois do igual é o novo
		this.numero=numero;
		
	}
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		if (agencia<=0) {
			System.out.println("Nao pode valor menor ou igual a zero");
			return;
		}
		this.agencia = agencia;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
	//o static faz o metodo ser da classe. 
	//"this" não pode ser usado dentro do static.
	public static int getTotal() {
		return Conta.total;
	}
 }