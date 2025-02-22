class Solution {
    public void removeExtraSpaces(StringBuffer sb) {
        int slow = 0;
        for (int fast = 0; fast < sb.length(); fast++) {
            if (sb.charAt(fast) != ' ') {
                sb.setCharAt(slow++, sb.charAt(fast));
                if (fast + 1 < sb.length() && sb.charAt(fast + 1) == ' ') {
                    sb.setCharAt(slow++, ' ');
                }
            }
        }
        sb.delete(slow, sb.length());
        if (sb.charAt(sb.length() - 1) == ' ') {
            sb.delete(sb.length() - 1, sb.length());
        }
//        System.out.println(sb);
    }

    public void reverse(StringBuffer sb, int begin, int end) {
        for (int i = begin, j = end - 1; i < j; i++, j--) {
            char tmp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, tmp);
        }
    }

    public String reverseWords(String s) {
        StringBuffer sb = new StringBuffer(s);
        removeExtraSpaces(sb);
        reverse(sb, 0, sb.length());
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != ' ') {
                int j = i;
                while (j < sb.length() && sb.charAt(j) != ' ') {j++;}
                reverse(sb, i, j);
                i = j;
            }
        }
        return sb.toString();
    }
}