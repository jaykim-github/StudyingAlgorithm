//이상한 문자 만들기 

class Solution {
    public String solution(String s) { 
        String[] list = s.split(" ", -1);
		String answer = "";
		String s2 = "";
				
		for(int i = 0; i<list.length;i++) {
			for(int j = 0; j<list[i].length(); j++) {
				if(j %2 ==0) {
					s2= String.valueOf(list[i].charAt(j)).toUpperCase();
				}else {
					s2 = String.valueOf(list[i].charAt(j)).toLowerCase();
				}
				answer = answer + s2;
			}
            if(i + 1 != list.length){
               answer = answer + " "; 
            }
		}
        
        return answer;
    }
}
