
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(); 
		
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente greiciane = new Cliente(); 
		greiciane.setNome("Greiciane");
		
		conta.setTitular(greiciane);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Java Girl");
		
		Cliente titularDaConta = conta.getTitular(); 
		titularDaConta.setProfissao("Programmer Girl");
		
		System.out.println(titularDaConta);
		System.out.println(greiciane);
		System.out.println(conta.getTitular());
		
		
	}
}
