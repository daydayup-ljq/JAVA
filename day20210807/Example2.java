package day20210807;

abstract class InputAlphabet
{
	public abstract void input();
}

class InputEnglish extends InputAlphabet{
	public void input()
	{
		for(char c='a';c<='z';c++)
		{
			System.out.printf("%3c",c);
		}
	}
}
class ShowBoard
{
	void showMess(InputAlphabet show)
	{
		show.input();
	}
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ShowBoard board=new ShowBoard();
         board.showMess(new InputEnglish());
         board.showMess(new InputAlphabet() {
			
			@Override
			public void input() {
				// TODO Auto-generated method stub
				for(char c='¦Á';c<='¦Á';c++)
				{
					System.out.printf("%3c",c);
				}
			}
		});
	}

}
