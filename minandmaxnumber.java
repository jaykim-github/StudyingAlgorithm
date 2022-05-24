class Solution {
    public String solution(String s) {
        String answer = "";
        
        String arr[] = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i =0; i<arr.length; i++){
             max = Math.max(max,Integer.parseInt(arr[i]));
             min = Math.min(min,Integer.parseInt(arr[i]));
        }

        answer = Integer.toString(min) + " " + Integer.toString(max);
        return answer;
    }
}
