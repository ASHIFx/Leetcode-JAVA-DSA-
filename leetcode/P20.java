class Solution {
    public boolean isValid(String s) {
        Stack<Character> pile = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                pile.push(c);
            } else {
                if (pile.isEmpty()) return false;
                char top = pile.pop();
                if (c == ')' && top != '(') return false;
                if (c == ']' && top != '[') return false;
                if (c == '}' && top != '{') return false;
            }
        }
        return pile.isEmpty();
    }
}