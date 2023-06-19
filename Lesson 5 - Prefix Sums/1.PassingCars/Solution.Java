class Solution {
    public int solution(int[] A) {
        int i = 0;
        while(i < A.length && A[i] != 0){ i++;}

        int c = 1;
        int sum = 0;
        for ( i = i + 1; i< A.length; i++){
            if (A[i] == 1){
                sum += c;
                if (sum > 1000000000) return -1;
            }else{
                c++;
            }
        }

        return sum;
    }
}