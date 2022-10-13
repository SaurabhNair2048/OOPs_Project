import java.util.Scanner;

public class Question1_Palindrome {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string to check for palindrome: ");
        String ip = s.nextLine();
        if (isPalindrome(ip, 0, ip.length()-1)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    private static boolean isPalindrome(String s, int left, int right){
        if(left >= right){
            return true;
        }
        if(s.charAt(left) == s.charAt(right)){
            return isPalindrome(s, left+1, right-1);
        } else {
            return false;
        }
    }
}
