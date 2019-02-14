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
    int same = 0;
    int front = 0;
    int end = size - 1;
    while(front < end)
    {
      if(arr[front] == arr[end])
      {
        same = 1;
        front ++;
        end --;
      }
      else 
      {
        System.out.println("No");
        same = 0;
        break;
      }
    }
    if(same == 1)
    {
      System.out.println("Yes");
    }
  }
}
