// gerente é um funcionário, gerente herda funcionário da class funcionário 
public class Gerente extends Funcionario implements Autenticavel {
	
	
private AutenticadorUtil autenticador; 
	
	public Gerente() {
		this.autenticador = new AutenticadorUtil(); 
	}

	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Gerente");
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
