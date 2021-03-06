 
import java.util.Scanner;
class Main
{ 
  public static void main(String args[]) 
  { 
    Scanner read = new Scanner(System.in);
    int row_size = read.nextInt();
    int column_size = read.nextInt();
    int matrix1[][] = new int[row_size][column_size];
    for(int i = 0; i < row_size; i++){
      for(int j = 0; j < column_size; j++)
      {
        matrix1[i][j] = read.nextInt();
      }
    }
    int matrix2[][] = new int[row_size][column_size];
    for(int i = 0; i < row_size; i++){
      for(int j = 0; j < column_size; j++)
      {
        matrix2[i][j] = read.nextInt();
      }
    }
    int sum[][] = new int[row_size][column_size];
    addition_of_2_matrices(matrix1, matrix2, sum);
    display_the_matrix(sum);
  }
  public static void addition_of_2_matrices(int matrix1[][], int matrix2[][], int sum[][]){
    for(int i = 0; i <= sum.length - 1; i++){
      for(int j = 0; j <= sum[i].length - 1; j++)
      {
        sum[i][j] = matrix1[i][j] - matrix2[i][j];
      }
    }
  }
  public static void display_the_matrix(int matrix[][]){
    for(int i = 0; i <= matrix.length - 1; i++){
      for(int j = 0; j <= matrix[i].length - 1; j++)
      {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}