//핸드폰번호 가리기

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int length = phone_number.length();
        String star[] = new String[length-4];
        String star2 = "";
        
        for(int i = 0; i<star.length; i++){
            star[i] = "*";
        }
        for(int k = 0; k<star.length; k++)
        {
            star2 = star2.concat(star[k]);
        }
        answer = star2.concat(phone_number.substring(length-4,length));
        
        return answer;
    }
}
