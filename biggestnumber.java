import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] arr = new String[numbers.length];
        
        for(int i = 0; i<numbers.length; i++){
            arr[i] = Integer.toString(numbers[i]);
        }
        
        //두 수를 번갈아가며 합친 수 중 큰 값을 앞으로 정렬(내림차순 정렬)
	    Arrays.sort(arr, new Comparator<String>() {
		    @Override
		    public int compare(String o1, String o2) {
			    return (o2+o1).compareTo(o1+o2);
		        }
	    });
        
        if(arr[0].equals("0")) {return "0";}
        else{
            for(int i = 0; i<arr.length; i++){
                answer += arr[i];
            }
        }
        
        return answer;
    }
}
