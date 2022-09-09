
public class FluxoComTratamento {

	public static void main(String[] args) {
		System.out.println("Inicio do MAIN");
		try {
			metodo1();
		} catch (NullPointerException | ArithmeticException e) {
			String errorMessage = e.getMessage();
			System.out.println("Exceptions: " + errorMessage);
			e.printStackTrace();
		}
		System.out.println("Fim do MAIN");
	}
	
	private static void metodo1() {
		System.out.println("Inicio do METODO1");
		metodo2();
		System.out.println("Fim do METODO1");
	}
	
	private static void metodo2() {
		System.out.println("Inicio do METODO2");
		for (int i = 1; i <= 5; i++ ) {
			System.out.println(i);
			
//			int a = i / 0;
			
//			Conta c = null;
//			c.Deposita();
		}
		System.out.println("Fim do METODO2");
	}
	
}
