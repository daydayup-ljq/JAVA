package interface_;

public class MysqlDB implements DBInterface {

	@Override
	public void connect() {
		System.out.println("����MYSQL");
		
	}

	@Override
	public void close() {
		System.out.println("�ر�MYSQL");
		
	}
	

}
