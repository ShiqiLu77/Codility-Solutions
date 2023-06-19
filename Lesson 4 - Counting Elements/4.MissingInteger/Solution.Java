class Solution {
    public int solution(int[] A) {
        int[] ans = new int[A.length+1];
        for (int i =0; i< A.length; i++){
            if ( A[i]>0 && A[i]< ans.length ) ans[A[i]]++;
        }
        
        for (int i =1; i < A.length+1; i++){
            if(ans[i]==0) return i;
        }
        return A.length+1;
    }
}