// Program - ReverseNumber.java
// Output:
// Enter the number: 
// 123
// Reverse Number: 321

package number_problems;

import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int reverse=0,digits=0;
        while(n>0){
            digits=n%10;
            reverse=reverse*10+digits;
            n=n/10;
        }
        System.out.println("Reverse Number: "+reverse);
        sc.close();
    }
}
