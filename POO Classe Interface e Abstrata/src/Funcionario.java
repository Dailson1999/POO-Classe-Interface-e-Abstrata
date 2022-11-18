
public abstract class Funcionario implements Pessoa {

	private double salario;
	private int matricula;
	private String telefone;
	private String nome;
	private String CPF;
	
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

	public Funcionario(String nome, String CPF, String telefone, double salario, int matricula) {
		this.nome = nome;
		this.CPF = CPF;
		this.telefone = telefone;
		this.salario = salario;
		this.matricula = matricula;
	}
	
	public abstract double taxaQuickMassage();

	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
}
