public class reverseString {
    public static void main(String[] args) {
        // write your code here
        char[] s = new char[] {'a', 'b', 'c'};
        for (int i = 0; i < s.length / 2; i++) {
            char t = s[i];
            s[i] = s[s.length - i -1];
            s[s.length - i - 1] = t;
        }
        System.out.println(s);
    }
}
