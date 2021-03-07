
public class TesteLacos3 {
    public static void main(String args[]) {
        for(int linha = 0; linha < 15; linha++) {
            for (int coluna = 0; coluna < linha; coluna++) {
                    System.out.print( "?" );
            }
            System.out.println();
        }
        
        System.out.println("-----------------");
        for(int num = 1; num < 100; num++) {
        	if(num % 3 == 0) {
        		System.out.println(num);
        	}
        }
    }
}