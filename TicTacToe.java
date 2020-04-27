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
        System.out.print("    "+board[i][j]+" ");
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
  public int checkForwin(char board[][],String player1,String player2,char player1marker,char player2marker,String fav1 ,String fav2)
  {
    for(int i=0;i<3;i++)
    {
      if(board[i][0]==player1marker&&board[i][1]==player1marker&&board[i][2]==player1marker)
      {
        System.out.println("game over");
        System.out.println("The favourite colour of "+player1+" is :"+fav1);
        System.out.println("The winner is :"+player1);
        return 1;
      }
      else if(board[0][i]==player1marker&&board[1][i]==player1marker&&board[2][i]==player1marker)
      {
        System.out.println("game over");
        System.out.println("The winner is :"+player1);
        System.out.println("The favourite colour of "+player1+" is :"+fav1);
        return 1;
      }
    }
    if(board[0][0]==player1marker&&board[1][1]==player1marker&&board[2][2]==player1marker)
      {
        System.out.println("game over");
        System.out.println("The winner is :"+player1);
        System.out.println("The favourite colour of "+player1+" is :"+fav1);
        return 1;
      }
      else if(board[0][2]==player1marker&&board[1][1]==player1marker&&board[2][0]==player1marker)
      {
        System.out.println("game over");
        System.out.println("The winner is :"+player1);
        System.out.println("The favourite colour of "+player1+" is :"+fav1);
        return 1;
      }

      for(int i=0;i<3;i++)
    {
      if(board[i][0]==player2marker&&board[i][1]==player2marker&&board[i][2]==player2marker)
      {
        System.out.println("game over");
        System.out.println("The winner is :"+player2);
        System.out.println("The favourite colour of "+player2+" is :"+fav2);
        return 1;
      }
      else if(board[0][i]==player2marker&&board[1][i]==player2marker&&board[2][i]==player2marker)
      {
        System.out.println("game over");
        System.out.println("The winner is :"+player2);
        System.out.println("The favourite colour of "+player2+" is :"+fav2);
        return 1;
      }
    }
    if(board[0][0]==player2marker&&board[1][1]==player2marker&&board[2][2]==player2marker)
      {
        System.out.println("game over");
        System.out.println("The winner is :"+player2);
        System.out.println("The favourite colour of "+player2+" is :"+fav2);
        return 1;
      }
      else if(board[0][2]==player2marker&&board[1][1]==player2marker&&board[2][0]==player2marker)
      {
        System.out.println("game over");
        System.out.println("The winner is :"+player2);
        System.out.println("The favourite colour of "+player2+" is :"+fav2);
        return 1;
      }
      return 0;
   }
  public static void main(String[] args)
  {
    TicTacToe game=new TicTacToe();
    String player1,player2;
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the 1st player name :");
    player1=in.nextLine();
    System.out.println("Enter the "+player1+"'s favourite colour :");
    String fav1=in.nextLine();
    System.out.println("Enter the 2nd player name :");
    player2=in.nextLine();
    System.out.println("Enter the "+player2+"'s favourite colour :");
    String fav2=in.nextLine();
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
    int ch[]=new int [10];
    int re=0;
    int num=0;
    for (int i=0;i<4;i++)
    {
      System.out.print(player1+" turn : ");
      char choice=in.nextLine().charAt(0);
      ch[num]=(choice-'0');
      if(ch[(num)]>0&&ch[num]<10)
      {
      	for(int j=0;j<num;j++)
      	{
      		if(ch[num]==ch[j])
      		{
      			System.out.println("Invalid input,enter again");
      			choice=in.nextLine().charAt(0);
      		}
      	}
      }
      else
      {
      	System.out.println("Invalid input,enter again : ");
      	choice=in.nextLine().charAt(0);
      }
      num++;
      Replace(game.board,choice,player1marker);
      Display(game.board);
      re=game.checkForwin(game.board,player1,player2,player1marker,player2marker,fav1,fav2);
      if(re==1)      
      {
        break;
      }
      System.out.print(player2+" turn : ");
      choice=in.nextLine().charAt(0);
      ch[num]=(choice-'0');
      if(ch[num]>0&&ch[(num)]<10)
      {
      	for(int j=0;j<num;j++)
      	{
      		if(ch[i+1]==ch[j])
      		{
      			System.out.println("Invalid input,enter again :");
      			choice=in.nextLine().charAt(0);
      		}
      	}
      }
      else
      {
      	System.out.println("Invalid input,enter again");
      	choice=in.nextLine().charAt(0);
      }
      Replace(game.board,choice,player2marker);
      Display(game.board);
      re=game.checkForwin(game.board,player1,player2,player1marker,player2marker,fav1,fav2);
      if(re==1)      
      {
        break;
      }
    }
    if(re==0)
    {
		System.out.print(player1+" turn : ");
    	char choice=in.nextLine().charAt(0);
    	ch[9]=choice-'0';
    	if(ch[9]>0&&ch[9]<10)
      {
      	for(int j=0;j<=9;j++)
      	{
      		if(ch[9]==ch[j])
      		{
      			System.out.println("Invalid input,enter again");
      			choice=in.nextLine().charAt(0);
      		}
      	}
      }
      else
      {
      	System.out.println("Invalid input,enter again");
      	choice=in.nextLine().charAt(0);
      }
    	Replace(game.board,choice,player1marker);
    	Display(game.board);
    	re=game.checkForwin(game.board,player1,player2,player1marker,player2marker,fav1,fav2);
    	System.out.println("Match draw");
    }
  }
}