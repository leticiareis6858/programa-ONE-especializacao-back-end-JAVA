package moonbank_encapsulado;

	public class Cliente {
		private String nome;
		private String cpf;
		private String profissao;
		private String endereço;
		//Endereço endereço=new Endereço();
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getProfissao() {
			return profissao;
		}
		public void setProfissao(String profissao) {
			this.profissao = profissao;
		}
		public String getEndereço() {
			return endereço;
		}
		public void setEndereço(String endereço) {
			this.endereço = endereço;
		}
		
	}
