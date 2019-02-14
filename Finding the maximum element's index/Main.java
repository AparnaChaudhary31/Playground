import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner read = new Scanner(System.in);
    int size = read.nextInt();
    int max = 0;
    int arr[] = new int[size];
    for(int i = 0; i < size; i ++)
    {
      arr[i] = read.nextInt();
      if(max < arr[i])
      {
        max = arr[i];
      }
    }
    for(int i = 0; i < size; i ++)
    {
      if(max == arr[i])
      {
           System.out.println(i);
      }
    }
   }
}