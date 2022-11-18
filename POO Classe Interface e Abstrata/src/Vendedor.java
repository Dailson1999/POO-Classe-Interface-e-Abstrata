
public class Vendedor extends Funcionario {
	
	private double bonus;
	private double venda;
	
	public Vendedor(String nome, String CPF, String telefone, double salario, int matricula, double bonus, double venda) {
		super(nome, CPF, telefone, salario, matricula);
		this.bonus = bonus;
		this.venda = venda;
	}
	
	public double comissao()
	{
		return (this.venda * 0.1);
	}
	
	public double taxaQuickMassage()
	{
		double taxamassagem = this.getSalario() - 30;
		System.out.println("Salário do vendedor com a taxa da massagem: " + taxamassagem);
		return taxamassagem;
	}
	
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}	

	public double getVenda() {
		return venda;
	}

	public void setVenda(double venda) {
		this.venda = venda;
	}
	
	public String toString()
    {
        String txt = "O Vendedor " + getNome() + " vai receber: " + comissao()+" reais de comissao";
        return txt;
    }


}
