class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder st = new StringBuilder();

        for (char c : num.toCharArray()) {
            while (k > 0 && st.length() > 0 &&
                   st.charAt(st.length() - 1) > c) {
                st.deleteCharAt(st.length() - 1);
                k--;
            }

            st.append(c);
        }

        while (k > 0) {
            st.deleteCharAt(st.length() - 1);
            k--;
        }

        int i = 0;
        while (i < st.length() && st.charAt(i) == '0') {
            i++;
        }

        String res = st.substring(i);
        return res.isEmpty() ? "0" : res;
    }
}
