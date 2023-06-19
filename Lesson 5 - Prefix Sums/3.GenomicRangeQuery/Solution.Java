import java.util.*;
class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        Map<Character, Integer> mp = new HashMap<Character, Integer>();
        mp.put('A',0);
        mp.put('C',1);
        mp.put('G',2);
        mp.put('T',3);

        int N = S.length();
        int[][] prefixCount = new int[4][N+1];
        /**
         * from s[0] to s[i](inclusive) 
         * contains  prefixCount[0][i+1] 'A's
         * contains  prefixCount[1][i+1] 'C's
         * contains  prefixCount[2][i+1] 'G's
         * contains  prefixCount[3][i+1] 'T's
         * */ 

        for (int i = 0 ; i < N; i ++){
            int index = mp.get(S.charAt(i));
            for (int j = 0; j< 4; j++){
                prefixCount[j][i+1] = prefixCount[j][i]; 
                if(j == index) prefixCount[j][i+1]++;
            }
        }

        int M = P.length;
        int[] ans = new int[M];
        for (int i = 0; i<M; i++ ){
            for (int j =0; j < 4; j++){
                int count = prefixCount[j][Q[i]+1] - prefixCount[j][P[i]];
                if (count>0) {
                    ans[i] = j+1;
                    break;
                }
            }
        }

        return ans;
    }
}