import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner read = new Scanner(System.in);
    int size = read.nextInt();
    int arr[] = new int[size];
    for(int index = 0; index < size; index ++)
    {
      arr[index] = read.nextInt();
    }
    int k = read.nextInt();
    int find = size - k;
    selection_sort(size, arr);
    
    System.out.print(arr[find]);
  }
  public static void selection_sort(int size, int arr[])
  {
    for(int start_idx = 0; start_idx <= size - 2; start_idx++)
    {
      int min_idx = find_minimun_idx(start_idx, arr, size - 1);
      swap(start_idx, min_idx, arr);
    }
  }
   public static void swap(int start_idx, int min_idx, int arr[])
   {
     int temp = arr[start_idx];
     arr[start_idx] = arr[min_idx];
     arr[min_idx] = temp;
   }
   public static int find_minimun_idx(int start_idx, int arr[], int end_idx){
     int min_idx = 0;
     if(arr[start_idx] < arr[start_idx + 1])
     {
       min_idx = start_idx;
     }
     else
     {
       min_idx = start_idx + 1;
     }
     for(int i = start_idx + 2; i <= end_idx; i++)
     {
       if(arr[min_idx] > arr[i])
       {
         min_idx = i;
       }
     }
     return min_idx;
   }
}
