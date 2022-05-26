def solution(price, money, count):
    answer = -1
    p = 0
    for i in range(1,count+1) :
        p = p + (price*i)
        if p > money :
            answer = p-money 
        else : 
            answer = 0

    return answer
