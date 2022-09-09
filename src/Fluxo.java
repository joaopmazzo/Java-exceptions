
public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Inicio do MAIN");
		try {
			metodo1();
			metodo2();
		} catch (Exception e) {
			String errorMessage = e.getMessage();
			System.out.println("Exceptions: " + errorMessage);
			e.printStackTrace();
		}
		
		System.out.println("Fim do MAIN");
	}

	private static void metodo1() throws MinhaExcecaoThroable {
		System.out.println("Inicio do METODO1");

		throw new MinhaExcecaoThroable("Deu ruim (MinhaExcecaoThroable)");

		//		System.out.println("Fim do METODO1");
	}

	private static void metodo2() {
		System.out.println("Inicio do METODO2");

		throw new MinhaExcecaoUnthroable("Deu ruim (MinhaExcecaoUnthroable)");

		//		System.out.println("Fim do METODO2");
	}

}
