class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder res = new StringBuilder();
        char temp;
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                temp = s.charAt(i);
                res.append(Character.toLowerCase(temp));
            }
        }
        int i = 0;
        int j = res.length()-1;
        while(i<=j){
            if(res.charAt(i) != res.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}