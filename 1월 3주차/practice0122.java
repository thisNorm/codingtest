public class practice0122 {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] present = new boolean[10];
        
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            
            if(0 <= number && number <= 9) {
                present[number] = true;
            }
        }
        
        for(int i = 0; i <= 9; i++) {
            if(!present[i]) {
                answer += i;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        practice0122 solution = new practice0122();
        int[] numbers = {1,2,3,4,6,7,8,0};
        System.out.println(solution.solution(numbers));
    }
}
