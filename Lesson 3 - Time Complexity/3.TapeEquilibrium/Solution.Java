class Solution {
    public int solution(int[] A) {
        // Implement your solution here
        int sum1 = A[0];
        int sum2 = 0;
        for (int i = 1; i<A.length; i++){
            sum2 += A[i];
        }

        int min = Math.abs(sum1 - sum2);
        for (int P = 2; P < A.length; P++){
            sum1 +=A[P-1];
            sum2 -=A[P-1];
            min = Math.min(min, Math.abs(sum1 - sum2));
        }
        return min;
    }
}