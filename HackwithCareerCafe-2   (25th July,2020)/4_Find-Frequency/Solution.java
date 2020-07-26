import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayList<Integer> set = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            
            if(!set.contains(arr[i]))
               set.add(arr[i]);
        }
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:arr)
        {
            if(map.containsKey(i))
                map.put(i,map.get(i)+1);
            else
                map.put(i,1);
        }
        
        for(int i:set)
        {
            System.out.println(i+" : "+map.get(i));
        }
        
        
    }
}