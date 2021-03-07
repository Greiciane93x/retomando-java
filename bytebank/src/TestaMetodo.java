
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaGreici = new Conta();
		contaGreici.saldo = 100; 
		contaGreici.deposita(50);
		
		System.out.println(contaGreici.saldo);
		
		boolean conseguiuRetirar = contaGreici.saca(20);
		
		System.out.println(contaGreici.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta(); 
		contaDaMarcela.deposita(1000);
		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaGreici); 
		if(sucessoTransferencia) {
			System.out.println("transferência com sucesso");
		}else {
			System.out.println("faltou dinheiro");
		}
		
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaGreici.saldo);
		
		contaGreici.titular = "Greiciane"; 

		System.out.println(contaGreici.titular);
	}
}
