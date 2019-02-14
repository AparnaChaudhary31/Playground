import java.util.*;
class Main
{
public static void main(String args[])
{
//Try out your code here
  Scanner read = new Scanner(System.in);
  int arr_size = read.nextInt();
  int arr[] = new int[arr_size];
  int is_matched1 = 0;
  int is_matched2 = 0;
  for(int index = 0; index < arr_size; index ++)
    {
        arr[index] = read.nextInt();
    }
    int search_element1 = read.nextInt();
    int search_element2 = read.nextInt();

  for(int index = 0; index < arr_size; index ++)
  {
       if( arr[index] == search_element1)
        {
          is_matched1 = index;
        }
	    if( arr[index] == search_element2)
        {
          is_matched2 = index;
        }
  }

  if(is_matched1 != 0 )
      System.out.println(is_matched1);  
  else
    System.out.println("-1");
    if(is_matched2 != 0 )
      System.out.println(is_matched2);  
  else
    System.out.println("-1");
}
}

