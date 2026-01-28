// Program - Fibonacci.java
// Output:
// Enter the number: 
// 5
// 0 1 1 2 3 

package number_problems;

import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int[] arr=new int[50];
        arr[0]=0;
        arr[1]=1;
        for(int i=0;i<n;i++){
            arr[i+2]=arr[i]+arr[i+1];
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
