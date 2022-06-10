def solution(s):
    answer = ''
    str1 = s.split(' ')
    
    for i in str1 :
        cnt = 0
        for j in i :
            if cnt % 2 != 0 :
                j = j.lower()
                cnt = cnt + 1
            else : 
                j = j.upper()
                cnt = cnt + 1
            answer += j
        answer += ' '
    return answer[:-1]
