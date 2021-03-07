
public class TestaBanco {
	
	public static void main(String[] args) {
		
		Cliente greici = new Cliente();
		greici.nome = "Greiciane Assis"; 
		greici.cpf ="121-121-211-22"; 
		greici.profissao = "Java Girl"; 
		
		Conta contaGreici = new Conta(); 
		contaGreici.deposita(100);
	
		contaGreici.titular = greici; 
		System.out.println(contaGreici.titular.nome);
		System.out.println(contaGreici.titular);

		
	}

}
