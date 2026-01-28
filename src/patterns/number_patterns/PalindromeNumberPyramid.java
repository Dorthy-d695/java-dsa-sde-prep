// Program to print a Palindrome Number Pyramid pattern
// Input: n = 5
// Output:
//         1 
//       1 2 1
//     1 2 3 2 1
//   1 2 3 4 3 2 1
// 1 2 3 4 5 4 3 2 1

package patterns.number_patterns;

public class PalindromeNumberPyramid {
    public static void main(String[] args) {
        int n=5;
        // int x=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            
            for(int k=1;k<=i;k++){
                System.out.print(k+" ");    
            }
            for(int k=i-1;k>=1;k--){
                System.out.print(k+" ");
            }
            
            // x++;
            System.out.println();
        }
    }
}
