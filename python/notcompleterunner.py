def solution(participant, completion):
    answer = ''
    participant.sort()
    completion.sort()
    
   # for i in participant :
    #    if i in completion :
     #       #participant.remove(i)
     #       completion.remove(i)
     #   elif len(participant) == 1 :
      #      answer = i
      #  else : 
      #     answer = i 
       #     break
    i=0
    for comp in participant:
        if i < len(completion) and comp == completion[i]:
            i += 1
        else:
            answer = comp
            break
        
    return answer
