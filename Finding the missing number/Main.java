import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // Type your code here
      Scanner read = new Scanner(System.in);
      int size = read.nextInt();
      int arr[] = new int[size];
      for(int index = 0; index < size; index ++)
      {
       arr[index] = read.nextInt();
      }
      int n = 1;
      int found = -1;
      while(n <= size)
      {
        for(int i = 0; i < size; i ++)
        {
          if(n == arr[i])
          {
            found = n;
          }
          else
            continue;
        }
        if(found == -1)
        {
          System.out.println(n);
        }
        found = -1;
        n ++;
      }
    }
}