def solution(s):
    answer = 0
    a = []
    if list(s)[0] == '-' :
        answer = int(s[1:]) * (-1)
    else : answer = int(s)
    
    return answer
