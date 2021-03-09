
public class Cliente  implements Autenticavel{
	
	private int senha; 
	
	private AutenticadorUtil autenticador; 
	
	public Cliente() {
		this.autenticador = new AutenticadorUtil(); 
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return  this.autenticador.autentica(senha);
		 
		
	}

}
