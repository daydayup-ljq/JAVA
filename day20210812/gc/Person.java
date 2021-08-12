package gc;

public class Person {

	public String name;
	public int age;
	public char sex;
	public String telephone;
	
	public Person(String name ,int age,char sex,String telephone)
	{
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.telephone=telephone;
		
		
		}
	
	
	public Person(){
		
	}
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public char getSex() {
		return sex;
	}




	public void setSex(char sex) {
		this.sex = sex;
	}




	public String getTelephone() {
		return telephone;
	}




	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
