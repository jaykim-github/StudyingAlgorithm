import java.util.*;

class Solution {
    public String[] solution(String[] record) {

        int count = 0;
        
        HashMap<String, String> map = new HashMap<String, String>();
        
        for(int i = 0; i<record.length; i++){
            if(record[i].substring(0,1).equals("C")) {count++;}
            else if(record[i].substring(0,1).equals("L")){
                continue;
            }
            map.put(record[i].split(" ")[1], record[i].split(" ")[2]);
        }
        
        String[] answer = new String[record.length-count];
        
        int num = 0;
        for(int i = 0; i<record.length; i++){
             if(record[i].substring(0,1).equals("E")){
                answer[num] = map.get(record[i].split(" ")[1]) + "님이 들어왔습니다.";
                num++;
             }else if(record[i].substring(0,1).equals("L")){
                answer[num] = map.get(record[i].split(" ")[1]) + "님이 나갔습니다.";
                num++;
             }
        }
        
        return answer;
    }
}
