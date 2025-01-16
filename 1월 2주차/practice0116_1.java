public class practice0116_1 {  
    public static int solution(int num) {  
        int count = 0;  
        long n = (long) num;   
        
        if(n <= 0) return -1; // 음수 처리  
        
        while(n != 1) {   
            if(count >= 500) {  
                return -1;   
            }  
            
            if(n % 2 == 0) {  
                n = n / 2;  
            } else {   
                n = n * 3 + 1;  
            }  
            
            count++;  
        }  
        
        return count;   
    }  

    public static void main(String[] args) {  
        System.out.println(solution(16)); // Expect 4  
    }  
}