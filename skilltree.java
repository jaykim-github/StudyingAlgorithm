/*
스킬트리 : 조건에 맞지않으면 삭제하는 방식으로 하다가 구글링을 통해보니 정규식을 사용하는 방법이 있어서 사용
*/
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = skill_trees.length;

        String[] arr = skill.split("");

        //조건에 맞지않을때 카운트를 마이너스하는 방법을 선택 -> 스킬트리에 해당하지 않는 문자열을 지운 후 인덱스에 맞지 않으면 카운트 마이너스
        for(int i = 0; i<skill_trees.length; i++){
            if(skill.indexOf(skill_trees[i].replaceAll("[^"+skill + "]","")) != 0){
                answer--;
            }
        }
        return answer;
    }
}
