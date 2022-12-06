class Solution {
    public int solution(int[] dot) {
        int result =0;
        if(dot[0] <0){
            // 2,3
            if(dot[1] >0){
                result = 2;
            }
            else{
                result = 3;
            }
        }
        else{
            //1,4
            if(dot[1] >0){
                result = 1;
             }
            else{
                result = 4;
            }
        }
        int answer = result;
        return answer;
    }
}