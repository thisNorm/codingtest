class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        String str = String.valueOf(x);
        char[] Array = toCharArray(x);
        
        if ( 1 <= x && x <= 10000 ) {
            for ( int i = 0; i < str.length(); i ++ ) {
                sum += (int)Array[i];
            }

            if ( x % sum == 0 ) {
                return answer;
            }
            
            else {
                return false;
            }
        }
    }
}

public void main(strings[] args) {
    int x = 12;
    Solution solution = new Solution();
    System.out.println(solution.solution(x));
}