class Solution {
    public boolean repeatedSubstringPattern(String s) {
        boolean res = false;
        for (int i = 1; i < s.length(); i++) {
            if (s.length() % i != 0) continue;
            int j = 0;
            for (j = 0; j < s.length() && s.charAt(j) == s.charAt(j % i); j++) {}
            if (j == s.length()) return true;
        }
        return false;
    }
}