class Solution {
    public String reverse(String s) {
//        String res = "";
//        for (int i = s.length() - 1; i >= 0; i--) {
//            res = res.concat(String.valueOf(s.charAt(i)));
//        }
//        return res;
        return new StringBuffer(s).reverse().toString();
    }
    public String reverseStr(String s, int k) {
        String res = "";
        for (int i = 0; i < s.length(); i += 2 * k) {
            if (s.length() - i >= 2 * k) {
                res = res.concat(reverse(s.substring(i, i + k)));
                res = res.concat(s.substring(i + k, i + 2 * k));
            } else if (s.length() - i >= k) {
                res = res.concat(reverse(s.substring(i, i + k)));
                res = res.concat(s.substring(i + k));
            } else {
                res =  res.concat(reverse(s.substring(i)));
            }
        }
        return res;
    }
}