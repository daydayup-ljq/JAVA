package day20210822;
import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		ArrayList<String> array=new ArrayList<String>();
		
		array.add("hello");
		array.add("java");
		
		array.add(1, "javase");
		
		System.out.println("array£º" + array);
		
		System.out.println(array.remove("java"));
		System.out.println("array£º" + array);
		
		System.out.println(array.set(1, "hi"));
		System.out.println(array.get(0));
		System.out.println("array£º" + array);
	}

}
