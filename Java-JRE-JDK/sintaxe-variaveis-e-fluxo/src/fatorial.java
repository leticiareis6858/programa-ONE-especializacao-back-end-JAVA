
public class fatorial {
	public static void main(String[] args) {
		//exemplo fatorial de 4=4x3x2x1=24 ou 4=4x3!=24...
		int fatorial=1;
		for(int numero=1;numero<11;numero++) {
			fatorial *= numero;
			System.out.println("Fatorial de "+numero+" = "+fatorial);
		}
	}

}
