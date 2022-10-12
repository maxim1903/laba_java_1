public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println(s + " " +isPalindrome(s));
        }
    }

    public static String reverseString(String reverse) { //reverse - строка которая будет перевёрнута
        char[] array = reverse.toCharArray();
        String NewString = ""; // NewString - полученная строка после переворота
        for (int i = array.length - 1; i >= 0; i--) {
            NewString = NewString + array[i];
        }
        return NewString;
    }

    public static boolean isPalindrome(String str){
        String NewStr = reverseString(str);
        return str.equals(NewStr);// сравнение по ссылкам
    }
}
