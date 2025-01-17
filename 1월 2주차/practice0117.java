public class practice0117 {
    class Solution {  
        public String solution(String[] seoul) {   
            if (1 <= seoul.length && seoul.length <= 1000) {  
                for (int i = 0; i < seoul.length; i++) {  
                    if (1 <= seoul[i].length() && seoul[i].length() <= 20){ 
                        if (seoul[i].equals("Kim")) {  
                            return "김서방은 " + i + "에 있다";  
                        }  
                    } else {
                        return "";
                    }  
                }  
            }  
            return "";  
        }  
    }

    public static void main(String[] args) {  
        practice0117 outer = new practice0117();  
        // Solution 객체 생성  
        Solution solution = outer.new Solution();  
        
        // 문자열 배열을 생성하여 solution 메소드 호출  
        String[] seoul = {"Jane", "Kim"};   
        System.out.println(solution.solution(seoul));  
    }
}