/*
 * 人
 */
public class Person {
	//属性
	String name;//String的默认值是null
	int age;//int 默认值是0
	
	//方法，行为，也叫函数
	/*
	 * 打印姓名
	 * 
	 */
	public void showName() {//方法的名称如果是多个单词，首个单词的首字母小写
		//其它单词的首字母大写，驼峰命名法
		
		System.out.println("姓名:" + name);
		
	}
	/*
	 * 获取年龄
	 */
	
	public int getAge() {//如果是一个有返回值的方法，最后一行一定要返回值
		return age;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
