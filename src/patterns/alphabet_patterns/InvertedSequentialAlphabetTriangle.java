// Program to print a Inverted Repeated Alphabet Triangle pattern
// Input: n = 5
// Output:
// A B C D E 
// A B C D
// A B C
// A B
// A

package patterns.alphabet_patterns;

public class InvertedSequentialAlphabetTriangle {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=0;j<i;j++){
                char c=(char)('A'+j);
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
