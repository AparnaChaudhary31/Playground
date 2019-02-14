import java.util.Scanner;
class Main
{
public static void main(String args[])
{
//Try out your code here
    Scanner read = new Scanner(System.in);
  	int size = read.nextInt();
  	int arr[] = new int[size];
    int count0 = 0;
  	for(int index = 0; index < size; index ++)
  	{
    	arr[index] = read.nextInt();
        if(arr[index] == 0)
        {
          count0 ++;
        }
    }
  int i = 0;
    for(int j = 0; j < size; j ++)
    {
      if(arr[j] != 0)
      {
        arr[i] = arr[j];
        i ++;
      }
      else
      {
        continue;
      }
    }
  
  for(int j = size - count0; j < size; j++ )
  {
    arr[i] = 0;
    i ++;
  }
  	for(int index = 0; index < size; index ++)
  	{
    	System.out.print(arr[index] + " ");
    }
    
}
}
