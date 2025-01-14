class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = long.toString(n);
        char[] digits = str.tocharArray();

        if(1 <= n && n <= 8000000000L) {
            for(int i = 0; i < digits.length() - 1; i++) {
                for(int j = i + 1; j < digits.length(); j++) {
                    if(digits[j] > digits[i]) {
                        char temp = digits[i];
                        digits[i] = digits[j];
                        digits[j] = temp;
                    }
                }
            }

            
        }
        return answer;
    }
}