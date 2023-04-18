package moonbank_herdado;

public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1=new Gerente();
		g1.setNome("Luis");
		g1.setSalario(5000.0);
		
		EditorDeVideo ev1=new EditorDeVideo();
		ev1.setSalario(2500.0);
		
		Designer d1=new Designer();
		d1.setSalario(2000.0);
		
		ControleBonificacao controle=new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev1);
		controle.registra(d1);
		
		System.out.println("a soma das bonificacoes e  "+ controle.getSoma());
	}

}
