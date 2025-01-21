public class practice0121 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        if( 1 <= absolutes.length && absolutes.length <= 1000 && signs.length == absolutes.length) {      
            for( int i = 0; i < signs.length; i++ ) {
                if( 1 > absolutes[i] || absolutes[i] > 1000 ){
                    return -1;
                }
                if( signs[i] ) {
                    answer += absolutes[i];
                }
                else {
                    answer -= absolutes[i];
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        practice0121 solution = new practice0121();
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};

        System.out.println(solution.solution(absolutes, signs));
    }
    
}
