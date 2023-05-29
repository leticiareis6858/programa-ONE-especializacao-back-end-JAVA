package moonbank_herdado_conta;

public class TestaConexao {

	public static void main(String[] args) {
		
	try (Conexao conexao=new Conexao() ) {
		conexao.leDados();
	} catch(IllegalStateException ex) {
		System.out.println("Deu erro na conexao");
	}
		
	//maneira não simplificada:
	//---------------------------
//		Conexao con=null;
//		try {
//			con=new Conexao();
//			con.leDados();
//		} catch(IllegalStateException ex) {
//			System.out.println("Deu erro na conexao");
//		} finally {
//			System.out.println("finally");
//			if(con != null) {
//			con.close();
//			}
//		}
		//try pode ter 1 ou mais catchs e é opcional haver o finally(finally só pode ter 1)
		//somente o try não funciona, precisa ter ao menos um catch ou finally
	}

}
