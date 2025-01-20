import java.util.Arrays;  

public class practice0120 {  
    public int[] solution(int[] arr, int divisor) {  
        int[] answer = new int[arr.length];  
        int j = 0;  

        if (divisor > 0 && arr.length >= 1) {  
            for (int i = 0; i < arr.length; i++) {  
                if (arr[i] % divisor == 0) {  
                    answer[j] = arr[i];  
                    j++;  
                }  
            }  

            if (j == 0){  
                return new int[]{-1}; // 나누어 떨어지는 수가 없을 경우  
            }  
            
            answer = java.util.Arrays.copyOf(answer, j); // 유효한 요소만 있는 배열로 크기 조정  
            
            // 오름차순 정렬  
            for (int k = 0; k < answer.length - 1; k++) {  
                for (int l = 0; l < answer.length - 1 - k; l++) {  
                    if (answer[l] > answer[l + 1]) {  
                        int temp = answer[l];  
                        answer[l] = answer[l + 1];  
                        answer[l + 1] = temp;  
                    }  
                }  
            }  
        }  
        return answer; // 결과 배열 반환  
    }  

    public static void main(String[] args) {  
        practice0120 solution = new practice0120(); // 외부 클래스 인스턴스 생성  
        int arr[] = {5, 9, 7, 10}; // 배열 초기화  
        int divisor = 5;  
        
        // 결과 배열을 출력  
        System.out.println(Arrays.toString(solution.solution(arr, divisor)));  
    }  
}