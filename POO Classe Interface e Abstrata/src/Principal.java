
public class Principal {

	public static void main(String[] args) {
	
		Cliente cliente = new Cliente("Robson", "12489721489", "19-971725223", 12);
		Vendedor vendedor = new Vendedor("Joao", "8463284734872", "19-978762364", 2500, 15, 200, 6000);
		Gerente gerente = new Gerente("Roberto", "248972841243", "19- 974747326", 7000, 20, 400, "robertin22@gmail.com");

		System.out.println("Salário do vendedor antes: " + vendedor.getSalario());
		vendedor.taxaQuickMassage();
		System.out.println("Salário do gerente antes: " + gerente.getSalario());
		gerente.taxaQuickMassage();


		System.out.println(cliente);
		System.out.println(vendedor);
		System.out.println(gerente);
		
	}
}