//키패드 누르는 방식을 생각하는 건 쉬웠으나, 거리 계산 법을 어떻게 해야하지 하고 생각하다가. 구글링을 통해서 식을 구했다.
//식을 구하면 쉬운 문제인데.. 식을 세우는게 힘들다. 

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left=10;
        int right=12;
        for(int num : numbers){
            if(num == 1 || num == 4 || num == 7){
                answer += "L";
                left = num;
            }else if(num == 3 || num == 6 || num == 9){
                answer += "R";
                right = num;
            }else{
                if(num == 0){
                    num += 11;
                }
                int leftLeng = (Math.abs(num-left))/3 + (Math.abs(num-left))%3;
                int rightLeng = (Math.abs(num-right))/3 + (Math.abs(num-right))%3;
                if(leftLeng > rightLeng){
                    answer += "R";
                    right = num;
                }else if(leftLeng < rightLeng){
                    answer += "L";
                    left = num;
                }else {
                    if(hand.equals("left")){
                        answer += "L";
                        left = num;
                    }else{
                        answer += "R";
                        right = num;
                    }
                }
            }
        }

        return answer;
    }
}
