import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();
            if(n<1)
                System.out.println("Not Valid");
            else if(n==1 || n==2 || n==3)
                System.out.println(n);
            else
            {
                ArrayList<Integer> factor = new ArrayList<>();
                for(int i=2;i<=n/2;i++)
                {
                    if(n%i==0 && isPrime(i))
                        factor.add(i);
                }
                
                if(isPrime(n))
                    factor.add(n);
                
                int i;
                for(i=0;i<factor.size()-1;i++)
                    System.out.print(factor.get(i)+",");
                System.out.println(factor.get(i));
            }
        }
            catch(Exception e)
            {
                System.out.println("Not Valid");
            }
    }
    
    public static boolean isPrime(int n)
    {
        if(n<=1)
            return false;
        else if(n==2 || n==3)
            return true;
        else if(n%2==0 || n%3==0)
            return false;
        else
        {
            for(int i=5;i*i<=n;i+=6)
            {
                if(n%i==0 || n%(i+2)==0)
                    return false;
            }
            return true;
        }
    }
}