import H1
print("HANGMAN GAME")
H1.hman()
s="beekeeper"
count =6;e=[];p="";m=0
while(count!=0):
    print("Lives remaining = ",count)
    w=input("guess a letter : ")
    for i in range(0,len(s)):
        if s[i] == w:
            e.insert(i,s[i])            
        else:
            m+=1

    count-=1
    H1.mistake(m)
for i in e:
    p+=i 
if(s==p):
    print("you won")
else:
    print("you lose")