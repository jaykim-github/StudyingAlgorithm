import java.util.LinkedList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        LinkedList<String> cache = new LinkedList<String>();

        if(cacheSize == 0) return 5*cities.length;

        for(int i =0; i<cities.length; i++){
            String arr = cities[i].toUpperCase();

            if(cache.contains(arr)){
                cache.remove(arr);
                cache.addLast(arr);

                answer += 1;
            }else{

                if(cache.size() == cacheSize){
                    cache.remove();
                }

                cache.add(arr);
                answer += 5;
            }
        }
        return answer;
    }
}
