class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(n, 0, 0, result, new StringBuilder());
        return result;
    }

    private void backtrack(int n, int open, int close, List<String> result, StringBuilder current){
        if(current.length() == 2*n){
            result.add(current.toString());
            return;
        }
        if(open < n){
            current.append('(');
            backtrack(n, open + 1 , close , result , current);
            current.deleteCharAt(current.length() - 1);
        }
        if(close < open){
            current.append(')');
            backtrack(n, open , close + 1, result , current);
            current.deleteCharAt(current.length() - 1);
        }
    }
}