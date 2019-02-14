import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        StringBuilder sb = new StringBuilder(str);
        int str_len = sb.length();
        int frequency[] = new int[70]; 
        for(int index = 0; index < 70; index ++)
        {
            frequency[index] = 0;
        }
        for(int i = 0; i < str_len; i ++)
        {
            if(sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z')
            {
                int offset = sb.charAt(i) - 'A';
                char ch = (char)('a' + offset);
                sb.setCharAt(i, ch);
            }
            if(sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z')
            {
                frequency[sb.charAt(i) - 'a'] ++;
            }  
        }
        for(int i = 0; i < str_len; i ++)
        {
            if(frequency[sb.charAt(i) -'a'] != 0)
            {
                System.out.print(sb.charAt(i) +"" +frequency[sb.charAt(i)-'a'] + " ");
                frequency[sb.charAt(i) -'a'] = 0;
            }
        }
    }
}
