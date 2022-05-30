def solution(s):
    answer = True
    s = s.lower()
    p = y =0
    for i in list(s) :
        if i == 'p' :
            p = p + 1 
        elif i == 'y' :
            y = y + 1
    
    if p != y : answer = False 

    return answer
