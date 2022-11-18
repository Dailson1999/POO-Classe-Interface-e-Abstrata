
public class Gerente extends Funcionario {

	private double bonus;
	private String email;
	
	public Gerente(String nome, String CPF, String telefone, double salario, int matricula, double bonus,String email) {
		super(nome, CPF, telefone, salario, matricula);
		this.bonus = bonus;
		this.email = email;
	}
	
	public double comissao(double vendasTotalEquipe, int tamanhoEquipe)
	{
		double comissao = vendasTotalEquipe / tamanhoEquipe;
		return (comissao * 0.05);
	}
	
	public double taxaQuickMassage()
	{
		double taxamassagem = this.getSalario() - 25;
		System.out.println("Salário do gerente com a taxa da massagem: " + taxamassagem);
		return taxamassagem;
	}

	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString()
    {
        String txt = "O gerente " + getNome() + " que possui o email: " +getEmail() + "irá receber um bônus de: " + getBonus() +" reais";
        return txt;
    }
	
	
	
	
}
