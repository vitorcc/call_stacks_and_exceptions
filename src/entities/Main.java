package entities;

public class Main {

	public static void main(String[] args) {
		
		/*
		Connection connection = null;
		
		try {
			connection = new Connection();
			connection.readData();
		} catch (IllegalStateException e) {
			System.out.println("Connection error!");
		} finally {
			connection.close();
		}
		*/
		
		
		// TRY-WITH-RESOURCES
		try (Connection connection = new Connection()) {
			connection.readData();
		} catch(IllegalStateException ex) {
	        System.out.println("Deu erro na conexao");
	    }
	}
}
