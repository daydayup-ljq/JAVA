package interface_;

public class OracleDB implements DBInterface {

	@Override
	public void connect() {
		System.out.println("Orcale���ݿ�����");

	}

	@Override
	public void close() {
		System.out.println("Orcale���ݿ�ر�");

	}

}
