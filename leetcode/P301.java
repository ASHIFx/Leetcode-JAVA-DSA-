class Solution {
    Set<String> ans = new HashSet<>();

    public List<String> removeInvalidParentheses(String s) {
        int l = 0, r = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') l++;
            else if (c == ')') {
                if (l > 0) l--;
                else r++;
            }
        }

        backtrack(s, 0, l, r, 0, new StringBuilder());
        return new ArrayList<>(ans);
    }

    void backtrack(String s, int i, int l, int r, int bal, StringBuilder cur) {
        if (i == s.length()) {
            if (l == 0 && r == 0 && bal == 0)
                ans.add(cur.toString());
            return;
        }

        char c = s.charAt(i);

        if (c == '(' && l > 0)
            backtrack(s, i + 1, l - 1, r, bal, cur);

        if (c == ')' && r > 0)
            backtrack(s, i + 1, l, r - 1, bal, cur);

        cur.append(c);

        if (c == '(') {
            backtrack(s, i + 1, l, r, bal + 1, cur);
        } else if (c == ')' && bal > 0) {
            backtrack(s, i + 1, l, r, bal - 1, cur);
        } else if (c != ')') {
            backtrack(s, i + 1, l, r, bal, cur);
        }

        cur.deleteCharAt(cur.length() - 1);
    }
}