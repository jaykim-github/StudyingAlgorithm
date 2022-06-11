def solution(n):
    answer = 0
    if n == 0 : answer = 0
    else : 
        a = list(map(int,str(n)))
        answer = sum(a)

    return answer
