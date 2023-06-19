class Solution {
    public int solution(int X, int Y, int D) {
        // Implement your solution here
        int remainder = (Y - X) % D;
        int step = (Y - X) / D;
        if (remainder > 0) step++;
        return step;
    }
}