import java.util.Scanner;
public class TicTacToe
{
	char board[][]=new char [3][3];
	public static void Display(char board[][])
	{
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(board[i][j]);
			}
			System.out.println(" ");
		}
	}
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the 1st player name :");
		String player1=in.nextLine();
		System.out.println("Enter the 2nd player name :");
		String player2=in.nextLine();
		System.out.println("Enter the 1st player marker between(X/0) :");
		Char player1marker=in.nextChar();
		System.out.println("Enter the 2nd player marker between(X/0) :");
		char player2marker=in.nextChar();
		TicTacToe game=new TicTacToe();
		int count=0;
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				game.board[i][j]=(char)count++;
			}
		}
		Display(game.board);
	}
}