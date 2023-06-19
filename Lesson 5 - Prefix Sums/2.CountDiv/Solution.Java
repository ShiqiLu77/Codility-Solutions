class Solution {
    public int solution(int A, int B, int K) {
        // Implement your solution here
        int ans = B/K - A/K;
        if ( A % K == 0) ans++;
        return ans;
        
    }
}