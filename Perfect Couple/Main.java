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
  int value = read.nextInt();
  int sum = 0;
  int k = 1;
  for(int i = 0; i < size; i ++)
  {
    for(int j = k; j < size; j ++)
    {
      sum = arr[i] + arr[j];
      if(sum == value)
      {
      System.out.println(arr[i] + ", " + arr[j]);
        sum = 0;
      }
      else
        sum = 0;
    }
    k ++;
  }
}
}
