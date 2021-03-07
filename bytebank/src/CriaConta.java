
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); 
		primeiraConta.saldo = 200; 
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100; 
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta(); 
		segundaConta.saldo = 50; 
		
		//instâncias diferentes... 
		System.out.println("Primeira Conta tem: " + primeiraConta.saldo);
		System.out.println("Segunda Conta tem: " + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(segundaConta.agencia);
		
		System.out.println(primeiraConta.numero);
		
		
	}
}
