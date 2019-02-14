import java.util.Scanner;
class Main
{ 
  public static void main(String args[]) 
  { 
    Scanner read = new Scanner(System.in);
    int row_size = read.nextInt();
    int column_size = read.nextInt();
    int matrix1[][] = new int[row_size][column_size];
    for(int i = 0; i < row_size; i++)
    {
      for(int j = 0; j < column_size; j++)
      {
        matrix1[i][j] = read.nextInt();
      }
    }
    int matrix2[][] = new int[row_size][column_size];
    for(int i = 0; i < row_size; i++)
    {
      for(int j = 0; j < column_size; j++)
      {
        matrix2[i][j] = read.nextInt();
      }
    }
    int flag = 1;
    for(int i = 0; i < row_size ; i++)
    {
      for(int j = 0; j < column_size; j++)
      {
       if(matrix1[i][j] != matrix2[i][j])
       {
         flag = 0;
       }
      }
    }
    if(flag == 0)
    {
      System.out.println("No");
    }
    else
    {
      System.out.println("Yes");
    }
  }
 }

