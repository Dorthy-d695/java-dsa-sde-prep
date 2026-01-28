// Program to print a Sequential Alphabet Triangle pattern
// Input: n = 5
// Output:
// A 
// A B
// A B C
// A B C D
// A B C D E

package patterns.alphabet_patterns;

public class SequentialAlphabetTriangle {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                char ch=(char)('A'+j);
                System.out.print(ch+ " ");
            }
            System.out.println();
        }
    }
}
