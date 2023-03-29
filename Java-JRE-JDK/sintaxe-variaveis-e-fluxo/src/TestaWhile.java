
public class TestaWhile {
	
	public static void main(String[] args) {
		int contador=0;
		while(contador <=10) {
			System.out.println("o valor do contador e: " +contador);
			contador++; //ou ++contador // não contador=contador++;, isso dá while infinito
		}
		System.out.println(contador);
	}
}
