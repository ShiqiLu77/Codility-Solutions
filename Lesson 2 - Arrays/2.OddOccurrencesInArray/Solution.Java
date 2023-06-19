import java.util.*;
class Solution {
    public int solution(int[] A) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i =0; i < A.length; i++){
            int count = map.getOrDefault(A[i], 0);
            map.put(A[i], ++count);
        }

        for (Integer key: map.keySet()){
            if (map.get(key) % 2 == 1) return key;
        }
        return 0;
    }
}