import java.util.*;

class Solution {
    public int[] solution(String s) {  
        String arr = s.replaceAll("[\\{\\}]", "");
        
        String[] arr2 = arr.split(",");
        
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        Arrays.sort(arr2);
        
        int count = 1;
        for(int i = 1; i< arr2.length; i++){
            if(!arr2[i-1].equals(arr2[i])){
                map.put(count, Integer.parseInt(arr2[i-1]));
                count = 1;
            }else{
                count++;
            }
        }
        
        map.put(count, Integer.parseInt(arr2[arr2.length-1]));
        
        int[] answer = new int[map.size()];
        
        // 키로 정렬
		Object[] mapkey = map.keySet().toArray();
		Arrays.sort(mapkey);
    
        
        int k = map.size()-1;
		// 결과 출력
		for (Integer nKey : map.keySet())
		{
			answer[k] = map.get(nKey);
            k--;
		}
        
    
        return answer;
    }
}
