class practice0116 {  
    public long solution(int a, int b) {  
        long answer = 0;  
        // a, b 값 범위 검사  
        if (-10000000 <= a && a <= 10000000  
                && -10000000 <= b && b <= 10000000) {  
            // a > b  
            if (a > b) {  
                for (int i = b; i <= a; i++) {  
                    answer += i;  
                }  
            }  
            // a < b  
            else if (a < b) {  
                for (int i = a; i <= b; i++) {  
                    answer += i;  
                }  
            }  
            // a == b  
            else {  
                answer = a;  
            }  
        }  
        return answer;  
    }  
    public static void main(String[] args) {  
        practice0116 solution = new practice0116();  
        System.out.println(solution.solution(3, 5));  // Expected output: 12  
    }  
}