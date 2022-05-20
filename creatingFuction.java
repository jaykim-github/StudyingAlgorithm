import java.util.Stack;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer;
        int count = 0;
        int num = 0;
        int num2 = 0;

        ArrayList<Integer> arr = new ArrayList<Integer>();
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i<progresses.length; i++){
            if((100-progresses[i])%speeds[i] != 0){
                num2 = (100-progresses[i])/speeds[i] + 1;
            }else{
                num2 = (100-progresses[i])/speeds[i];
            }
            if(!stack.empty()){
                num = stack.pop();
                if(num2>num){
                    arr.add(count);
                    stack.push(num2);
                    count = 1;
                    
                    if(i == progresses.length-1){
                        arr.add(count);
                    }
                }else{
                    stack.push(num);
                    count++;
                    if(i == progresses.length-1){
                        arr.add(count);
                    }
                }
            }else{
                stack.push(num2);
                count++;
            }
        }
        
        answer = new int[arr.size()];
        for(int i = 0; i<arr.size(); i++){
            answer[i] = arr.get(i);
        }
        
        return answer;
    }
}
