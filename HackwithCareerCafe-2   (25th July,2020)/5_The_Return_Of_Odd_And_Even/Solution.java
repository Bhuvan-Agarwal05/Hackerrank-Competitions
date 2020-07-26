import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        
        for(int i=a;i<=b;i++)
        {
            if(i%2==0)
            {
                if(isEven(i))
                    even.add(i);
            }
            else
            {
                if(isOdd(i))
                    odd.add(i);
            }
        }
        
        int i;
        for(i=0;i<odd.size()-1;i++)
            System.out.print(odd.get(i)+" ");
        System.out.println(odd.get(i));
        
        i=0;
        for(i=0;i<even.size()-1;i++)
            System.out.print(even.get(i)+" ");
        System.out.println(even.get(i));
    }
    
    public static boolean isEven(int n)
    {
        int r=0;
        while(n!=0)
        {
            r = n%10;
            if(r%2!=0)
                return false;
            
            n /= 10;
        }
        return true;
    }
     public static boolean isOdd(int n)
    {
        int r=0;
        while(n!=0)
        {
            r = n%10;
            if(r%2==0)
                return false;
            
            n /= 10;
        }
        return true;
    }
}