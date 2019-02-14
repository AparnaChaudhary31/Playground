import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner read = new Scanner(System.in);
      int size = read.nextInt();
      int arr[] = new int[size];
      for(int i = 0; i < size; i ++)
      {
        arr[i] = read.nextInt();
      }
      int count = 0;
      int max = 0;
      for(int j = 0; j < size; j ++)
      {
        if(arr[j] == 1)
        {
          count ++;
        }
        else
        {
          if(max < count)
          {
          max = count;
          }
          count = 0;
        }
      }
      System.out.println(max);
    }
}
