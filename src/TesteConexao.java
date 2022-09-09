
public class TesteConexao {

	public static void main(String[] args) {
		
		try (Conexao conn = new Conexao()) {
			conn.leDados();
		} catch (Exception e) {
			System.out.println("Deu erro na conexão");
		}
		
	}
	
}
