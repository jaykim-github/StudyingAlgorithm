def solution(s):
    answer = ''
    sol = list(s)
    i = len(s)//2
    if len(s) % 2 == 0 :        
        answer = "".join(sol[i-1:i+1])
    else :
        answer = "".join(sol[i])
    return answer
