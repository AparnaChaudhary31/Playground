import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner read = new Scanner(System.in);
    int size = read.nextInt();
    int arr[] = new int[size];
    for(int i = 0; i < size; i ++)
    {
      arr[i] = read.nextInt();																	
    }
    for(int i = 0; i < size; i ++)
    {
      for(int j = i; j < size; j ++)
      {
        if(arr[i] < arr[j])
        {
          System.out.println(arr[i] + "," + arr[j]);
        }
      }
    }
  }
}