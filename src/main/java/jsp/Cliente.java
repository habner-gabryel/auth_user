package jsp;

public class Cliente {
	private long cpf;
	private String nome, email;
	
	public Cliente() {
	}
	
	public Cliente(long cpf, String nome, String email) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}


	public long getCpf() {
		return cpf;
	}


	public void setCpf(long cpf) {
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	
}
