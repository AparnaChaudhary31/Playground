import java.util.Scanner;
class Main
{
public static void main(String args[])
{
//Try out your code here
  Scanner read = new Scanner(System.in);
  int size = read.nextInt();
  int arr[] = new int[size];
  for(int index = 0; index < size; index ++)
  {
    arr[index] = read.nextInt();
  }
  //int a = 0;
  //    int l = 1;
  //    int m = 2;
  for(int i = 0; i < size - 1; i ++)
  {
    for(int j = i + 1; j < size ; j ++)
    {
      for(int k = j + 1; k < size ; k ++)
      {
       System.out.print("(" + arr[i] + ", " + arr[j] + ", " + arr[k] + ")" + " ");
      }
      //m ++;
    }
    //l ++;
    System.out.println();
  }
  //a ++;
}
}
