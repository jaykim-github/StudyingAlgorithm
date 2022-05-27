def solution(n, lost, reserve):
    answer = 0
    num = 0
    lost = sorted(lost)
    reserve = sorted(reserve)
    
    common = set(lost).intersection(reserve) #lost,reserve 간 중복 요소 구하기
    for u in common :
        reserve.remove(u)
        lost.remove(u)
    
    for i in lost :
        if i-1 in reserve:
            num += 1
            reserve.remove(i-1)
        elif i+1 in reserve :
            num += 1
            reserve.remove(i+1)
            
    answer = n - len(lost) + num
    
    return answer
