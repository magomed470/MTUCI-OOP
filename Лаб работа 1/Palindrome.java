import java.util.Scanner;

// finds palindromes
class Palindrome {
  public static void main(String[] args) {
    String palindromes = "Palindromes: \n";
    Scanner scanner = new Scanner(System.in);
    String checkPalindrom = "";
    while (!checkPalindrom.equals("stop")){
      checkPalindrom = scanner.nextLine();
      if (isPalindrome(checkPalindrom)) {
        palindromes += checkPalindrom + "\n";
      }
    }

    System.out.println(palindromes);
  }

  // reverses string
  public static String reverseString(String str) {
    String result = "";

    int length = str.length() - 1;

    for (int i = length; i >= 0; i--) {
      result += str.charAt(i);
    }

    return result;
  }

  // returns true if string is palindrome
  public static boolean isPalindrome(String str) {
    return str.equals(reverseString(str));
  }
}
