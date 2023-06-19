class Solution {
    public int solution(int[] A) {
        int N = A.length; // N >= 2
        int[] suffixSum = new int[N+1];
        suffixSum[N-1] = A[N-1];
        for (int i = N-2 ; i > -1; i--){
            suffixSum[i] = suffixSum[i+1]+A[i]; 
        }

        int ans = N-2 ;
        double minAvg = (double) Integer.MAX_VALUE;
        // check 2 sum and 3 sum from index 0 to N-3 (0 ,1, ... N-3, N-2, N-1)
        for (int i = 0; i < N - 2; i++){ // i <= N-3
            double avg1 = (double) (suffixSum[i] - suffixSum[i+2]) / 2;
            double avg2 = (double) (suffixSum[i] - suffixSum[i+3]) / 3;
            if (avg1 < minAvg || avg2 < minAvg){
                minAvg = Math.min(avg1, avg2);
                ans = i;
            }
        }

        double avg =  (double) (A[N-2] + A[N-1]) / 2;
        if (avg < minAvg) ans = N-2;
        return ans;
    }
}