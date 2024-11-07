import java.util.Scanner;

public class palindrome {
  public static boolean checkPalindrome(String input) {
    StringBuffer sb = new StringBuffer(input);
    return input.equalsIgnoreCase(sb.reverse().toString());
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String tian = sc.nextLine();
    if(checkPalindrome(tian)) {
      System.out.println(tian + " is a palindrome");
    } else {
      System.out.println(tian + " is not a palindrome");
    }
  }
}
