
public class Cliente implements Pessoa {
	
	private String telefone;
	private String nome;
	private String CPF;
	private int cadastro;
	
	public Cliente(String nome, String CPF, String telefone, int cadastro) {

		this.nome = nome;
		this.CPF = CPF;
		this.telefone = telefone;
		this.cadastro = cadastro;
	}

	public int getCadastro() {
		return cadastro;
	}
	public void setCadastro(int cadastro) {
		this.cadastro = cadastro;
	}

	public String toString()
    {
        String txt = "O Cliente " + getNome() + " com o cpf: " + getCPF()+ " e cadastro:  " + getCadastro();
        return txt;
    }

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}


	
	
}
