package dao;

public class Test {
	public static void main(String[] args) {
		DataAccessObject dao = DataAccessObject.getInstance();
		
		System.out.println(dao.getListaVuelos());
		
		System.out.println(dao.getListaVuelos("Bilbao", "Madrid"));
	}

}