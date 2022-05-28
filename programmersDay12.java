
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(long n) {
     				
		String num = String.valueOf(n);
		        
		ArrayList<String> list = new ArrayList();
		        
		for(int i = 0; i<num.length(); i++){
		    list.add(num.substring(i,i+1));
		}
		        
		int[] answer = new int[list.size()];
		int count = 0;
		for(int i =list.size()-1; i>=0; i--){
			answer[count] = Integer.parseInt(list.get(i));
            count++;
		}
        
        return answer;
    }
}
