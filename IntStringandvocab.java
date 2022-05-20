class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String a = s.replace("one","1");
        a= a.replace("two","2");
        a=a.replace("three","3");
        a=a.replace("four","4");
        a=a.replace("five","5");
        a=a.replace("six","6");
        a=a.replace("seven","7");
        a=a.replace("eight","8");
        a=a.replace("nine","9");
        a=a.replace("zero","0");
        
        answer =  Integer.parseInt(a);
        return answer;
        /*
         int answer = 0;
        StringBuilder sb = new StringBuilder("");
        int len = s.length();
        String[] digits = {"0","1","2","3","4","5","6","7","8","9"};
        String[] alphabets = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i=0; i<10; i++){
            s = s.replaceAll(alphabets[i],digits[i]);
        }

        return Integer.parseInt(s);
        */
    }
}
