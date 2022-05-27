//우선순위 큐를 쓰면 빠르게 해결되는 문제. 계산한 값을 거르지말고 우선 넣어야한다.
import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue();

        for(int i = 0; i<scoville.length; i++){
            heap.add(scoville[i]);
        }

        while (heap.peek() <= K) {
            if(heap.size() <= 1) return -1;

            int num = heap.poll()+(heap.poll()*2);

            heap.add(num);
            answer++;
        }
        return answer;
    }
}
