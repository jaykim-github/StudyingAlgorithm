import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer;
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%divisor == 0){
                arr2.add(arr[i]);
            }
        }
        
        if(arr2.size() == 0){
            answer = new int[1];
            answer[0] = -1;
        }else{
            answer = new int[arr2.size()];
            for(int i = 0; i<arr2.size(); i++){
                answer[i] = arr2.get(i);
            }
            Arrays.sort(answer);
        }
        
        
        
        return answer;
    }
}
