
public abstract interface Autenticavel  {

	//contrato Autenticavel 
	//quem assinar nesse contrato, precisa implementar 
	//metodo setSenha 
	//metodo autentica 
	
    public abstract void setSenha(int senha); 
	public abstract boolean autentica(int senha); 

}
