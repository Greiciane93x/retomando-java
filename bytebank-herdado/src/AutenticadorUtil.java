
public class AutenticadorUtil {

	private int senha;

	private AutenticadorUtil util;

	public void setSenha(int senha) {
		this.senha = senha;

	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

}
