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
				System.out.print("		"+board[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
	public static void Replace(char board[][],char find,char replace)
	{
		for(int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				if(board[i][j]==find)
				{
					board[i][j]=replace;
					return;
				}
			}
		}
	}
	public void checkForwin(char board[][])
	{
		for(int i=0;i<3;i++)
		{
			if(board[i][1]==player1marker&&board[i][2]==player1marker&&board[i][3]==player1marker)
			{
				System.out.println("game over");
				System.out.println("The winner is :"+player1);
			}
			else if(board[i][1]==player1marker&&board[i][2]==player1marker&&board[i][3]==player1marker)
			{
				System.out.println("game over");
				System.out.println("The winner is :"+player1);
			}
		}
	}
	public static void main(String[] args)
	{
		TicTacToe game=new TicTacToe();
		String player1,player2;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the 1st player name :");
		player1=in.nextLine();
		System.out.println("Enter the 2nd player name :");
		player2=in.nextLine();
		System.out.println("Enter the 1st player marker between(X/0) :");
		char player1marker=in.nextLine().charAt(0);
		char player2marker;
		while (player1marker != 'X'&& player1marker != 'x'&& player1marker != '0') {
			System.out.print("Invalid input,Enter correct marker :");
			player1marker=in.nextLine().charAt(0);
		}
		if(player1marker == 'X'|| player1marker == 'x')
		{
			player2marker='0';
		}
		else
		{
			player2marker='X';
		}
		int count=1;
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				game.board[i][j]=(char)(count++ +'0');
			}
		}
		Display(game.board);
		for (int i=0;i<4;i++)
		{
			System.out.print(player1+" turn : ");
			char choice=in.nextLine().charAt(0);
			Replace(game.board,choice,player1marker);
			Display(game.board);
			checkForwin(board);
			System.out.print(player2+" turn : ");
			choice=in.nextLine().charAt(0);
			Replace(game.board,choice,player2marker);
			Display(game.board);
			checkForwin(board);
		}
		System.out.print(player1+" turn : ");
		char choice=in.nextLine().charAt(0);
		Replace(game.board,choice,player1marker);
		Display(game.board);
		checkForwin(board);
	}

}