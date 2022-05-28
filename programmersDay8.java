//최대공약수와 최소공배수

class Solution {
    public static int gcd(int num1, int num2){
        if(num2 == 0) return num1;
        else return gcd(num2, num1 % num2);
    }
    
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int result = gcd(n,m);
        int result2 = n*m/result;
        answer[0] = result;
        answer[1] = result2;
        
        return answer;
    }
}
