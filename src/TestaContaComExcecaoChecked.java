
public class TestaContaComExcecaoChecked {

	public static void main(String[] args) {

		Conta c = new Conta();
		try {
			c.deposita();
		} catch (MinhaExcecaoThroable e) {
			System.out.println("Tratamento ....");
		}
		
	}

}
