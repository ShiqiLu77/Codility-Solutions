class Solution {
    public int[] solution(int N, int[] A) {
        int[] ans = new int[N];
        int preMax = 0;
        int newMax = 0;
        for ( int i = 0; i < A.length; i++){
            if ( A[i] < (N + 1) ) {
                if(ans[A[i]-1] > preMax){
                    ans[A[i]-1]++;
                }else{
                    ans[A[i]-1] = preMax + 1;
                }
                newMax = Math.max(ans[A[i]-1], newMax);
            }else{
                preMax = newMax;
            }
        }
        
        for ( int i = 0; i < ans.length; i++){
            ans[i] = Math.max(preMax, ans[i]);
        }

        return ans;
    }
}