//문자열 정수로 바꾸기

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        if(s.contains("+") == true){
            answer = Integer.parseInt(s.substring(1,s.length()));
        }else if(s.contains("-") == true){
            answer = Integer.parseInt(s.substring(1,s.length())) * -1;
        }else{
            answer = Integer.parseInt(s);
        }
        
        return answer;
    }
}
