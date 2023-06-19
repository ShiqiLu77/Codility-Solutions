class Solution {
    public int solution(int N) {
        int ans = 0;
        int pre = rank(N);
        int remainder = N - (int) Math.pow(2, pre);
        while (remainder != 0){
            int cur = rank(remainder);
            remainder = remainder - (int) Math.pow(2, cur);
            
            ans = Math.max(ans, pre -cur- 1);
            pre = cur;
        }
        return ans;
    }

    public int rank(int N){
        int rank = 0;
        while (N >= Math.pow(2, rank)){
            rank++;
        }
        return rank-1; 
    }
}