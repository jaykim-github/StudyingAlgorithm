def solution(arr):
    answer = []
    min = 99999;
    if len(arr) == 1 : 
            answer.insert(0,-1)
    else : 
        for i in arr :
            if i <min :
                min = i
            
        arr.remove(min)
            
        answer = arr
    
    return answer
