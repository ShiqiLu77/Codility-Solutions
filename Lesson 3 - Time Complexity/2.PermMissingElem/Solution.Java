class Solution {
    public int solution(int[] A) {
        // Implement your solution here
        if (A.length == 0) return 1;
        
        long sum = 0;
        for (int x : A){
            sum += x;
        }
        int N = A.length;
        long expected = (long)(N+2)*(N+1)/2;
        return  (int) (expected - sum) ;
    } 
}