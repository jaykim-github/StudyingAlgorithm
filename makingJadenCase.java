class Solution {
    public String solution(String s) {
        String answer = "";
        String arr[] = new String[s.length()];
        
        arr = s.split(" ",-1);
        
        for(int i = 0; i< arr.length; i++){
            if(arr[i].length() >= 1){
                arr[i] = arr[i].substring(0,1).toUpperCase() + arr[i].substring(1).toLowerCase();
            }
            
            answer = answer + arr[i];
            if(i + 1 != arr.length){
                answer = answer + " ";
            }
        }
        
        return answer;
    }
}
