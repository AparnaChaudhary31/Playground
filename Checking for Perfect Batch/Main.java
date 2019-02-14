import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner  read = new Scanner(System.in);
    int size = read.nextInt();
    int arr[] = new int[size];
    int sum1 = 0;
    int sum2 = 0;
    for(int i = 0; i < size; i ++)
    {
      arr[i] = read.nextInt();
    }
     for(int j = 0; j < 3; j ++)
    {
      sum1 = sum1 + arr[j];
    }
     for(int k = 3; k < 6; k ++)
    {
      sum2 = sum2 + arr[k];
    }
    if(sum1 == sum2)
    {
      System.out.println("Perfect Batch");
    }
    else
    {
      System.out.println("Not a Perfect Batch");
    }
  }
}