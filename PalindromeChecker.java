import java.util.Scanner;

public class PalindromeChecker{
    public static boolean isPalindrome(char[] word){
        int i = 0;
        int j = word.length - 1;
        while (j > i) {
            if (word[i] != word[j]) {
                return false;
            }
            ++i;
            --j;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String temp = input.nextLine();
        char[] word = temp.toCharArray();
        System.out.println(isPalindrome(word));
    }
}