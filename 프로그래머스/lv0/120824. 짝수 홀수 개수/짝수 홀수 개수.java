class Solution {
    public int[] solution(int[] num_list) {
        int one =0;
        int two =0;
        for(int i =0; i < num_list.length;i++){
            if(num_list[i] % 2==0){
                two++;
            }
            else{
                one++;
            }
        }
        int[] answer = {two, one};
        return answer;
    }
}