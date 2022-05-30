#n번째 문자를 앞으로 가져와서 정렬하면 되는 문제
def solution(strings, n):
    answer = []
    for i in range(len(strings)) :
        strings[i] =strings[i][n:n+1]+strings[i]
        
    answer = sorted(strings)
    
    for j in range(len(answer)) :
        answer[j] = answer[j][1:]
    
    return answer
