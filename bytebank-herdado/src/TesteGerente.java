
public class TesteGerente {

	
	public static void main(String[] args) {
		
		Autenticavel referencia = new Cliente(); 
		Gerente g1 = new Gerente(); 
		g1.setNome("Greici");
		g1.setCpf("1321212");
		g1.setSalario(5000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		

		
		System.out.println(g1.getBonificacao());
		
	}
}
