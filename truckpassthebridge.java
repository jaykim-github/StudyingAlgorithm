import java.util.*;
//프로그래머스 스킬 체크에 나왔었음

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
       Queue<Integer> queue = new LinkedList<>();
        int sum = 0;
        int time = 0; // 다리 위를 지나가는 시간

        for(int i = 0; i < truck_weights.length; i++) {
            int truck = truck_weights[i];

            while(true) {
                if(queue.isEmpty()) { //다리위에 트럭이 없으면 더함.
                    queue.add(truck);
                    sum += truck;
                    time++; 
                    break;
                } else if(queue.size() == bridge_length) { //다리길이와 다리위의 트럭 개수가 같으면, 합계에서 값을 삭제
                    sum -= queue.poll();
                } else  { // 다리위에 트럭이 있으나, 다리 길이와 다름
                    if(sum + truck <= weight) { //무게를 넘지 않으면 더함, 시간을 더하고 합계에 더함
                        queue.add(truck);
                        sum += truck;
                        time++;
                        break;
                    } else { //무게를 넘으면 0만 넣고, 시간을 체크하여 시간을 지나게 함
                        queue.add(0);
                        time++;
                    }
                }
            }
        }

        return time + bridge_length; // 트럭 위의 시간만 더하고, 다리 길이를 마지막에 추가
    }
}
