import java.util.*;

class Palindrome {
  public String findPalindromWords(String s) {
    String rv = "";

    for (int i = s.length(); i > 0; i--) {

      rv = rv + s.charAt(i - 1);

    }
    return rv;
  }

  public static void main(String args[]) {
    String str;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the word :- ");
    str = sc.next();
    Palindrome obj = new Palindrome();
    String z = obj.findPalindromWords(str);
    System.out.println("\n");

    if (z.equals(str)) {
      System.out.println("The String is palindrome   ");
    } else {
      System.out.println("The string is not a palindrome ");
    }

  }
}