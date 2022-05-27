def solution(numbers):
    answer = []
    for i in range(1,len(numbers)):
        for j in range(0,i):
            if (numbers[j] + numbers[i]) not in answer :
                answer.append(numbers[j] + numbers[i])
        
    answer = sorted(answer)
    return answer
