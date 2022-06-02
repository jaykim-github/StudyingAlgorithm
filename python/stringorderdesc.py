def solution(s):
    answer = ''
    a = list(s)
    b = sorted(a, reverse =True)
    answer = ''.join(b)
    return answer
