//효율성을 위한 정렬 후 for문 한번으로 돌리기 
import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);
        
        for(int i = 0; i<phone_book.length-1; i++){
            if(phone_book[i+1].length() >= phone_book[i].length() && phone_book[i+1].substring(0,phone_book[i].length()).equals(phone_book[i])){
                 return false;
            }
        }
        
        
        return answer;
    }
}

//HashMap을 사용하여, 풀었었으나 효율성 문제로 sorting 후 비교하는 방식으로 변경
//HashMap만 사용한 방법과 keySet을 함께 사용한 방식 두가지를 했었으나 효율성 문제로 바꿨다. 

import java.util.HashMap;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        
        for(int i = 0; i<phone_book.length; i++){
            map.put(phone_book[i],i);
        }
        
        for(String i : map.keySet()){
            //for(int j = 0; j<phone_book.length; j++){
            for(String j : map.keySet()){
                //if(phone_book[j].length() >= i.length() && phone_book[j].substring(0,i.length()).equals(i) && map.get(i) != j){
                if(j.length() >= i.length() && j.substring(0,i.length()).equals(i) && map.get(i) != map.get(j)){
                    return false;
                }
            }
            //}
        }
        
        return answer;
    }
}
