package interface_;

public class MysqlDB implements DBInterface {

	@Override
	public void connect() {
		System.out.println("Á¬½ÓMYSQL");
		
	}

	@Override
	public void close() {
		System.out.println("¹Ø±ÕMYSQL");
		
	}
	

}
