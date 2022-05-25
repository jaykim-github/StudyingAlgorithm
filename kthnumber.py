def solution(array, commands):
    answer = []
    answers = []
    for command in commands:
        answers = array[command[0]-1:command[1]]
        answers.sort()
        answer.append(answers[command[2]-1])
    return answer
