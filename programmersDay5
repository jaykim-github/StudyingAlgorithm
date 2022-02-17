//하샤드 수


import java.util.*;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int num = x;
        ArrayList<Integer> arr = new ArrayList<>(); 
        while(x > 0) { 
            arr.add(x %10); 
            x /= 10; 
        }
        int sum = 0;
        
        for(int i = 0; i<arr.size(); i++){
            sum += arr.get(i);
        }
        
        if (num % sum != 0){
            answer = false;
        }
        
       return answer;
    }
}
