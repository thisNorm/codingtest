class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        String str = String.valueOf(x);
        char[] Array = str.toCharArray();
        
        if ( 1 <= x && x <= 10000 ) {
            for ( int i = 0; i < str.length(); i ++ ) {
                sum += Character.getNumericValue(Array[i]);
            }

            if ( x % sum == 0 ) {
                return answer;
            }
            
            else {
                return false;
            }
        }

        else {
            return false;
        }
    }


public static void main(String[] args) {
    int x = 10;
    Solution solution = new Solution();
    System.out.println(solution.solution(x));
    }
}