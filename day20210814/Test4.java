package day20210814;

public class Test4 {

	//°ÙÇ®°Ù¼¦
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int x=0;x<=20;x++)
		{
			for(int y=0;y<=33;y++)
			{
				int z=100-x-y;
				if(z%3==0&&5*x+3*y+z/3==100)
				{
					System.out.println(x+" "+y+" "+z+" ");
				}
			}
		}

	}

}
