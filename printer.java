import java.util.*;
/*
* 큐 중에서 우선순위 큐를 사용하여, 푼 방법... 아직도 어렵다... 우선순위 큐로 돌린것과 기존의 priorities 배열 값이 같으면 값을 삭제한다.
단, location 값과 배열의 위치가 같을 경우엔 리턴한다.
*/
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0; i<priorities.length; i++){
            que.add(priorities[i]);
        }
        
        while(!que.isEmpty()){
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == que.peek()) {
                    if (i == location) {
                        answer++;
                        return answer;
                    }
                    que.poll();
                    answer++;
                }
            }
        }
        
        return -1;
    }
}
