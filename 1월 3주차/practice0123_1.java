public class practice0123_1 {
    public String solution(String s) {
        String answer = "";
        if(1 <= s.length() && s.length() <= 100){
            int midIndex = s.length() / 2;
            if(s.length() % 2 == 0){
                answer = String.valueOf(s.charAt(midIndex - 1)) + String.valueOf(s.charAt(midIndex));
            }
            else{
                answer = String.valueOf(s.charAt(s.length()/2));
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {
        practice0123_1 solution = new practice0123_1();
        String s = "qwer";
        System.out.println(solution.solution(s));
    }
}
