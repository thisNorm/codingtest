public class practice0123_2 {
    public String solution(int n) {
        String answer = "";
        String sue = "수";
        String bak = "박";
        if(n <= 10000) {
            for(int i = 0; i < n; i++) {
                if(i % 2 == 0) {
                    answer += sue;
                }
                else{
                    answer += bak;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        practice0123_2 solution = new practice0123_2();
        int n = 3;
        System.out.println(solution.solution(n));
    }
}
