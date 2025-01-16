class practice0116 {  
    public long solution(int a, int b) {  
        long answer = 0;  
    
        // a, b 값 범위 검사  
        if (-10000000 <= a && a <= 10000000  
                && -10000000 <= b && b <= 10000000) {  
            
            // Math 클래스를 사용해 a와 b의 대소 관계를 간단히 처리  
            int start = Math.min(a, b);  
            int end = Math.max(a, b);  
    
            for (int i = start; i <= end; i++) {  
                answer += i;  
            }  
        }  
    
        return answer;  
    }  
    
    public static void main(String[] args) {  
        practice0116 solution = new practice0116();  
        System.out.println(solution.solution(3, 5));  // Expected output: 12  
    }
}