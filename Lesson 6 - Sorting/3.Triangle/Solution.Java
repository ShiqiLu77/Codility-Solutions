import java.util.*;

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 0 ; i <= A.length -3; i++){
            long sum = (long) A[i] + A[i+1];
            if (sum > A[i+2]) return 1;
        }
        
        return 0;
    }
}