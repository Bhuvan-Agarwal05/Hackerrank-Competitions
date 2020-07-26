import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        try
        {
            int month = sc.nextInt();
            int day = sc.nextInt();
            int[] m = {31,28,31,30,31,30,31,31,30,31,30,31};
            if(month<1 || month>12)
                throw new Exception();
            else if(day<1 || day>31)
                throw new Exception();
            else if(day<1 || day>m[month-1])
                throw new Exception();
            else
            {
                
                int count = 0;
                for(int i=0;i<month-1;i++)
                    count += m[i];

                count += day;
                System.out.println(count);
            }
        }
        catch(Exception e)
        {
            System.out.println("Not Valid");
        }
    }
}