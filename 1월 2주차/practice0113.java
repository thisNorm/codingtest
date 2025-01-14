class Solution {  
    public long solution(long n) {  
        long answer = 0;  

        // 숫자를 문자열로 변환  
        String str = Long.toString(n);  

        // 문자열을 문자 배열로 변환  
        char[] digits = str.toCharArray();  

        // 입력 범위 확인  
        if (1 <= n && n <= 8000000000L) {  
            // 자릿수를 내림차순으로 정렬  
            for (int i = 0; i < digits.length - 1; i++) {  
                for (int j = i + 1; j < digits.length; j++) {  
                    if (digits[j] > digits[i]) { // 내림차순 비교  
                        // Swap  
                        char temp = digits[i];  
                        digits[i] = digits[j];  
                        digits[j] = temp;  
                    }  
                }  
            }  

            // 정렬된 자릿수를 문자열로 결합  
            StringBuilder sortedString = new StringBuilder();  
            for (char digit : digits) {  
                sortedString.append(digit);  
            }  

            // 문자열을 long으로 변환하여 answer에 저장  
            answer = Long.parseLong(sortedString.toString());  
        }  

        return answer;  
    }  

    public static void main(String[] args) {  
        Solution solution = new Solution();  

        long input = 118372; // 입력 값  
        long output = solution.solution(input); // 솔루션 함수 실행  

        // 결과 출력  
        System.out.println(output);  
    }  
}