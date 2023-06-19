class Solution {
    public int[] solution(int[] A, int K) {
        if (A.length == 0 || K == 0) return A;
        int[] ans = new int[A.length];
        int k = K % A.length;
        if (k == 0) return A;
        for (int i =0; i < A.length ; i++){
            ans[ (i+k) % A.length] = A[i];
        }
        return ans;
    }
}