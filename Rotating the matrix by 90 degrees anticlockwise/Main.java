import java.util.Scanner; 
class Main
{
  public static void main(String args[])
  {
    Scanner read = new Scanner(System.in);
    int r = read.nextInt();
    int c = read.nextInt();
    int matrix[][] = new int[r][c];
    for(int i = 0; i < r; i++)
    {
      for(int j = 0; j < c; j++)
      {
        matrix[i][j] = read.nextInt();
      }
    }
    for(int i = r - 1; i >= 0; i--)
    {
      for(int j = 0; j <= c - 1; j++)
      {
        System.out.print(matrix[j][i] + " ");
      }
      System.out.println();
    }
  }
}
