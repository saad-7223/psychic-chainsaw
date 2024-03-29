import H1
chosenWord = "beekeeper"
gameOver = False # state variable
lives = 6
# create blanks
display = []
for _ in chosenWord:
    display += '_'
#print(display)    


while not gameOver:
    guess = input("Guess a letter: ").lower()[0] #capture 1 letter
    
    if guess in display:
        print(f"You already guessed {guess}, try a different letter")
    
    for i in range(0,len(chosenWord)):
        if guess == chosenWord[i]:
            display[i] = chosenWord[i]
            
              
    # jump out of the if loop into the for loop and do the check there
    if guess not in chosenWord:
        print(f"You guessed {guess} that is not in the word, you loose a life")
        lives -=1
        if lives == 0:
            gameOver = True
            print('You Lose')
    print(display)
    print(H1.stages[lives])

    if '_' not in display:
        gameOver = True # state variable
        print("You Win")