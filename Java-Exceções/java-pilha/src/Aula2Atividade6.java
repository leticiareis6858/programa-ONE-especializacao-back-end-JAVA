
public class Aula2Atividade6 {
	    public static void main(String[] args) {

	        String nome = "Alura";
	        System.out.println("ANTES");

	        try {
	            System.out.println(nome);
	        } catch(ArrayIndexOutOfBoundsException ex) {
	            System.out.println("CATCH");
	        }

	        System.out.println("DEPOIS");
	    }
	
}
//resultado no console:
//ANTES
//Alura
//DEPOIS