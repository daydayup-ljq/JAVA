package interface_;

public class interface01 {
	public static void main(String[] args) {
		Camera camera = new Camera();
		Phone phone = new Phone();
		
		Computer computer = new Computer();
		computer.work(phone);//把手机接入到计算机
		System.out.println("===============");
		computer.work(camera);//把相机接入到计算机
		
		MysqlDB mysqlDB = new MysqlDB();
		OracleDB oracleDB = new OracleDB();
		t(mysqlDB);
		t(oracleDB);
		
	}
	
	public static void t(DBInterface db)
	{
		db.connect();
		db.close();
	}

}
