class P3723{
    public static void main(String[] args) {
        Solutionp ob = new Solutionp();
        ob.maxSumOfSquares(2, 3);
    }
}

class Solutionp {
    public String maxSumOfSquares(int num, int sum) {

        if (sum > 9 * num) {
            return "";
        }

        StringBuilder ans = new StringBuilder();

        while (num > 0) {
            int digit = Math.min(9, sum);

            ans.append(digit);

            sum -= digit;
            num--;
        }

        return ans.toString();
    }
}