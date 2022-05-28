//정수 내림차순으로 배치하기
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public long solution(long n) {
		        long answer = 0;
		        String num = String.valueOf(n);
		        String answer2 ="";
		        
		        ArrayList list = new ArrayList();
		        
		        for(int i = 0; i<num.length(); i++){
		            list.add(num.substring(i,i+1));
		        }
		        
		       
		        Collections.sort(list, Collections.reverseOrder());
		        
		       		        
		        for(int i =0; i<list.size(); i++){
		            answer2 = answer2 + list.get(i);
		        }
		        answer = Long.parseLong(answer2);
        return answer;
    }
}
