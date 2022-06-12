import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        //여분있는 학생이 도난당했을 경우
        for(int i = 0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                }
            }
        }
        
        //도난 당한 학생 빌려줄수 있는지
        for(int i = 0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] != -1  && reserve[j] != -1 ){
                    if(reserve[j] - lost[i] == 1 || reserve[j] - lost[i] == -1){
                        answer++;
                        lost[i] = -1;
                        reserve[j] = 1;
                    }
                }
            }
        }
        
        
        return answer;
    }
}
