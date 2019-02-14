import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner read = new Scanner(System.in);
      int arr_size = read.nextInt();
      int arr[] = new int[arr_size];
      int largest = 0;
      for(int index = 0; index < arr_size; index ++)
      {
        arr[index] = read.nextInt();
        if(arr[index] > largest)
        {
          largest = arr[index];
        }
      }
      System.out.println(largest);
    }
}