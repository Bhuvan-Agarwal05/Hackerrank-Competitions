import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        
        if(n==1)
            System.out.println(arr[0]);
        else
        {
            int i,k;
            int[] temp = new int[n];
            if(r==0 || Math.abs(r)%n==0)
            {
                for(i=0;i<n-1;i++)
                    System.out.print(arr[i]+" ");
                System.out.println(arr[i]);
            }
            else if(r<0)
            {
                k=0;
                r = -r;
                r = r%n;
                for(i=r;i<n;i++,k++)
                    temp[k] = arr[i];
                for(i=0;i<r;i++,k++)
                    temp[k] = arr[i];

                for(i=0;i<n-1;i++)
                    System.out.print(temp[i]+" ");
                System.out.println(temp[i]);
            }
            else
            {
                k=0;
                r = r%n;
                for(i=n-r;i<n;i++,k++)
                    temp[k] = arr[i];
                for(i=0;i<n-r;i++,k++)
                    temp[k] = arr[i];
                

                for(i=0;i<n-1;i++)
                    System.out.print(temp[i]+" ");
                System.out.println(temp[i]);
            }
        }
    }
}