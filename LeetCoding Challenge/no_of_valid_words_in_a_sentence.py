ass Solution:
    def countValidWords(self, sentence: str) -> int:
        cnt = 0 
        li = sentence.split()  #creating a list of the words present in the senctence ['cat','and','dog']
        num = [1,2,3,4,5,6,7,8,9,0]
        pun = ["!",".",","]
        for i,word in enumerate(li):
            flag = True
            hypen_count = 0
            for j,letter in enumerate(word):
                if letter.isdigit():    
                  #chekcing if the letter is digit for example, c-> is not a digit, a-> is not a digit and t-> is not a digit
                    flag = False
                    break
                if letter in pun and j!=len(word)-1:
                  #only 1 punctuation is allowed but it has to be the end and not in the between
                    flag = False
                    break
                if letter == "-" and (j== len(word)-1 or j==0) or (letter == "-" 
                and (not word[j-1].isalpha() or not word[j+1].isalpha())):
                  #checking hypens as the condition of hypens is it should be surrounded by letters a-b so we check if -ab,ab- or 1-1 or a-1, etc
                    flag = False
                    break
                if letter == '-':
                    hypen_count += 1
                    if hypen_count > 1:
                      #only 1 hypen is allowed if hypen count is greater than 1 it will be not a valid word
                        flag = False
                        break
            if flag:
                cnt+=1
        return cnt
