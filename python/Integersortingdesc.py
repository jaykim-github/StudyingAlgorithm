def solution(n):
    answer = 0
    a = list(map(int, str(n)))
    a.sort(reverse=True)
    b = list(map(str, a))
    answer = int(''.join(b))
    return answer
