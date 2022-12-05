class Solution {
    public int solution(int n, int k) {
        // n : 12000, k : 2000의 개수 
        // n/10 * 2000을 빼줘야 한다.
        int answer = 12000 * n + 2000 * k - ((n/10) * 2000);
        return answer;
    }
}