import java.util.HashMap;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int zero = 0;
    
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i<lottos.length; i++){
            if(lottos[i] == 0) {
                zero++; //0의 갯수
            }else{
                map.put(lottos[i],i);
            };
        }
        
        for(int i= 0; i<win_nums.length; i++){
            if(map.containsKey(win_nums[i])){
                count++; //일치하는 갯수
            }
        }
        
        int[] arr = {0,6,5,4,3,2,1};
        
        if(count == 0){
            answer[1] = 6;
            answer[0] = arr[zero];
        }else{
            count = count + zero;
            answer[0] = arr[count];
            
            count = count - zero;
            answer[1] = arr[count];
        }
        
       if(zero == 0 && count == 0){
            answer[1] = 6;
            answer[0] = 6;
        }
        
       
        return answer;
    }
}
