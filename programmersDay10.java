//정수 제곱근 판별
class Solution {
    public long solution(long n) {
        Double num = Math.sqrt(n);
        
        if(num == num.intValue()){
            return (long)Math.pow(num+1, 2);
        }else{
            return -1;
        }
        
    }
}
