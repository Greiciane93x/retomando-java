
public class TestaValores {
	
	public static void main(String[] args) {
		
		int total = 0; 
		Conta conta = new Conta(1337, 24336); 
		total++; 
	
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1337, 16569);
		
		System.out.println(conta2);


		Conta conta3 = new Conta(1337, 16569);
		
		System.out.println(conta2);
		
		
		Conta conta4 = new Conta(1337, 16569);
		
		System.out.println(conta2);
		
		System.out.println(Conta.getTotal()); 
 	}

}
