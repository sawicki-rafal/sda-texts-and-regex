public class Problem021 {
    public static void main(String[] args) {
        System.out.println("Kajak: " + isPalindrome("kajak"));
        System.out.println("Kot: " + isPalindrome("kot"));
    }

    private static boolean isPalindrome(String text) {
        text = text.toLowerCase();
        int length = text.length();
        for (int i = 0; i < length / 2; i++) {
            if (text.charAt(i) != text.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
