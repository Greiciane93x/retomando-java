// gerente � um funcion�rio, gerente herda funcion�rio da class funcion�rio 
public class Gerente extends Funcionario implements Autenticavel {
	
	
private AutenticadorUtil autenticador; 
	
	public Gerente() {
		this.autenticador = new AutenticadorUtil(); 
	}

	
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonificacao do Gerente");
		return super.getSalario();  
	 }

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);

	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha); 
	}


	
}
