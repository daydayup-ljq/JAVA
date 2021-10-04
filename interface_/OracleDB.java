package interface_;

public class OracleDB implements DBInterface {

	@Override
	public void connect() {
		System.out.println("Orcale数据库连接");

	}

	@Override
	public void close() {
		System.out.println("Orcale数据库关闭");

	}

}
