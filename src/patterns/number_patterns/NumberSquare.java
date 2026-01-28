// Program to print a Number Square pattern
// Input: n = 5
// Output:
// 11111
// 11111
// 11111
// 11111
// 11111

package patterns.number_patterns;

public class NumberSquare {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("1");
            }
            System.out.println();
        }
    }
}
